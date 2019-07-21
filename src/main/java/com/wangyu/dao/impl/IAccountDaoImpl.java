package com.wangyu.dao.impl;

import com.wangyu.dao.IAccountDao;

/**
 * @version V1.0
 * @author: WY
 * @date: 2019/7/10 15:11
 * @description:
 */
public class IAccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户！");
    }
}
