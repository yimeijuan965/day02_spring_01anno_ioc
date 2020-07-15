package com.ymj.ui;

import com.ymj.dao.IAccountDao;
import com.ymj.dao.impl.AccountDaoImpl;
import com.ymj.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        IAccountService as  = (IAccountService)ac.getBean("accountServiceImpl");
//        System.out.println(as);
        as.saveAccount();
//
//        IAccountDao ad = ac.getBean("accountDao", IAccountDao.class);
//        System.out.println(ad);
    }
}
