package com.learnspring;

import com.learnSpring.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    //测试 scope属性
    public void test1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1);

        //((ClassPathXmlApplicationContext)app).close();
        //app.close();
        //注释是另一种   ApplicationContext是接口    ClassPathXmlApp是实现    前者比后者高一层
    }
}
