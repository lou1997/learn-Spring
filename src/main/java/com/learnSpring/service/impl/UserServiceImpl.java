package com.learnSpring.service.impl;

import com.learnSpring.UserDao;
import com.learnSpring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {


    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        userDao1.save();
    }

}





