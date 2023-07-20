package com.yixuexi.demo01.factory;

import com.yixuexi.demo01.dao.UserDao;
import com.yixuexi.demo01.dao.impl.UserDaoImpl;

public class MyBeanFactory1 {

    public static UserDao userDao(String name){
        System.out.println("工厂的静态方法执行了");
        return new UserDaoImpl();
    }

    public UserDao userDao04(){
        System.out.println("工厂的实例方法执行了");
        return new UserDaoImpl();
    }
}
