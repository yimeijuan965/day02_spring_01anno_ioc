package com.ymj.service.impl;

import com.ymj.dao.IAccountDao;
import com.ymj.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    @Qualifier("accountDao1")
//    @Resource(name = "accountDao2")
    private IAccountDao accountDao;

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
