package com.learnSpring.factory;

import com.learnSpring.UserDao;
import com.learnSpring.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
