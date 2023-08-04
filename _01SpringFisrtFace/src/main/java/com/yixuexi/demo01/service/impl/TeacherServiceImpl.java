package com.yixuexi.demo01.service.impl;

import com.yixuexi.demo01.dao.impl.UserDaoImpl;
import com.yixuexi.demo01.service.TeacherService;

import java.util.Set;

public class TeacherServiceImpl implements TeacherService {

    private Set<String> names;

    private Set<UserDaoImpl> userDaoSet;

    public TeacherServiceImpl() {

    }

    public TeacherServiceImpl(Set<String> names, Set<UserDaoImpl> userDaoSet) {
        this.names = names;
        this.userDaoSet = userDaoSet;
    }

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    public Set<UserDaoImpl> getUserDaoSet() {
        return userDaoSet;
    }
    public void setUserDaoSet(Set<UserDaoImpl> userDaoSet) {
        this.userDaoSet = userDaoSet;
    }

    @Override
    public void show() {
        System.out.println(names);
        System.out.println(userDaoSet);
    }
}
