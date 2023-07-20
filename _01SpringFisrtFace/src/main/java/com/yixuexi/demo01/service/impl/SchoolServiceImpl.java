package com.yixuexi.demo01.service.impl;

import com.yixuexi.demo01.service.SchoolService;

import java.util.List;

public class SchoolServiceImpl implements SchoolService {

    private List<String> stringList;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
    public void show(){
        System.out.println(stringList);
    }
}
