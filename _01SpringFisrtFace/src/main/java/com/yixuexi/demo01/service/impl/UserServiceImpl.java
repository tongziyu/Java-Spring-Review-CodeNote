package com.yixuexi.demo01.service.impl;

import com.yixuexi.demo01.dao.UserDao;
import com.yixuexi.demo01.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public void doSome() {
        System.out.println("doSome方法执行了");
    }

    public void init(){
        System.out.println("初始化方法执行了");
    }
     public void destroy(){
         System.out.println("销毁方法执行了");
     }


}
