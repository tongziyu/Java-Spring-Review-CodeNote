package com.yixuexi.demo01.service.impl;

import com.yixuexi.demo01.service.StudentService;
public class StudentServiceImpl implements StudentService {
    private String name;

    public StudentServiceImpl() {
        System.out.println("无参构造执行了");
    }

    public StudentServiceImpl(String name) {
        System.out.println("有参构造执行了");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
