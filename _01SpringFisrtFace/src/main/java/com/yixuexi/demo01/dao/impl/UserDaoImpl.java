package com.yixuexi.demo01.dao.impl;

import com.yixuexi.demo01.dao.UserDao;

public class UserDaoImpl implements UserDao {

    private String name;

    public UserDaoImpl(String name) {
        System.out.println("有参构造执行了");
        this.name = name;
    }

    public UserDaoImpl() {
        System.out.println("无参构造执行了");
    }

    public void doSome(){
        System.out.println("UserDao的doSome方法执行");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
