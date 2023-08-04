package com.yixuexi.test;

import com.yixuexi.service.UserService;
import com.yixuexi.service.com.yixuexi.dao.UserDao;
import com.yixuexi.service.com.yixuexi.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test01(){
        String config = "application.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
        userServiceImpl.show();

    }

    @Test
    public void test02(){
        String config = "application.xml";
        // 指定test环境
        System.setProperty("spring.profiles.active","test");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        UserDao userDao = (UserDaoImpl) context.getBean("userDao01");
        System.out.println(userDao);

    }

    @Test
    public void test03(){
        String config = "application.xml";

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        UserDao userDao = (UserDaoImpl) context.getBean("userDao03");
        System.out.println(userDao);
    }
}
