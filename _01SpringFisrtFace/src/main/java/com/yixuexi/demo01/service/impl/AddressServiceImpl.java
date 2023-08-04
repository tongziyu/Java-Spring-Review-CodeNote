package com.yixuexi.demo01.service.impl;

import com.yixuexi.demo01.dao.UserDao;
import com.yixuexi.demo01.service.AddressService;

import java.util.Map;
import java.util.Properties;

public class AddressServiceImpl implements AddressService {
    private Map<String,String> stringMap;

    private Map<String, UserDao> stringUserDaoMap;

    private Properties properties;

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Map<String, UserDao> getStringUserDaoMap() {
        return stringUserDaoMap;
    }

    public void setStringUserDaoMap(Map<String, UserDao> stringUserDaoMap) {
        this.stringUserDaoMap = stringUserDaoMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public AddressServiceImpl() {
    }

    @Override
    public void show() {
        System.out.println(stringMap);
        System.out.println(stringUserDaoMap);
        System.out.println(properties);

    }
}
