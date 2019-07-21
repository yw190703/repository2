package com.wangyu.utils;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * @version V1.0
 * @author: WY
 * @date: 2019/7/10 15:19
 * @description:
 */
public class BeanFactory {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("beans");

    private static Map<String, Object> map = new HashMap<>();

    static{
        Enumeration<String> keys = resourceBundle.getKeys();
        //遍历keys
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = resourceBundle.getString(key);
            try {
                Object bean = Class.forName(value).newInstance();
                //封装进map
                map.put(key,bean);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }



    //对外提供方法
    public static Object getBean(String beanName){
        return map.get(beanName);
    }

}
