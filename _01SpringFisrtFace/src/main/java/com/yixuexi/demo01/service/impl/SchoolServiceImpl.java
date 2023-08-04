package com.yixuexi.demo01.service.impl;

import com.yixuexi.demo01.entity.TempData;
import com.yixuexi.demo01.service.SchoolService;

import java.util.List;

public class SchoolServiceImpl implements SchoolService {

    private List<String> stringList;

    private List<TempData> tempDataList;


    public List<TempData> getTempDataList() {
        return tempDataList;
    }

    public SchoolServiceImpl() {
    }

    public void setTempDataList(List<TempData> tempDataList) {
        this.tempDataList = tempDataList;
    }

    public SchoolServiceImpl(List<String> stringList, List<TempData> tempDataList) {
        this.stringList = stringList;
        this.tempDataList = tempDataList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
    public void show(){
        System.out.println(stringList);
        System.out.println(tempDataList);
    }
}
