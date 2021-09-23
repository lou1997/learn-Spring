package com.learnSpring.factory;

import com.learnSpring.UserDao;
import com.learnSpring.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
