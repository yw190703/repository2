package com.wangyu.web;

import com.wangyu.service.IAccountService;
import com.wangyu.service.impl.AccountServiceImpl;
import com.wangyu.utils.BeanFactory;

/**
 * @version V1.0
 * @author: WY
 * @date: 2019/7/10 15:12
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();
        IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
        as.saveAccount();
    }
}
