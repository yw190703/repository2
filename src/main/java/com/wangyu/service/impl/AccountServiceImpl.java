package com.wangyu.service.impl;


import com.wangyu.dao.IAccountDao;
import com.wangyu.service.IAccountService;
import com.wangyu.utils.BeanFactory;

/**
 * @version V1.0
 * @author: WY
 * @date: 2019/7/10 15:07
 * @description:
 */
public class AccountServiceImpl implements IAccountService {

    //private IAccountDao accountDao = new IAccountDaoImpl();
    //private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");
    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
