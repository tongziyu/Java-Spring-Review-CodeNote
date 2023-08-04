package com.yixuexi.service.impl;

import com.yixuexi.service.UserService;
import com.yixuexi.service.com.yixuexi.dao.impl.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDaoImpl userDao;

    public UserDaoImpl getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void show() {
        System.out.println(userDao);
    }
}
