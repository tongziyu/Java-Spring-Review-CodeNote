package com.yixuexi.dao;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionTest {
    @Test
    public void test01(){
        String config = "application.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(config);
        DruidDataSource druidDataSource = (DruidDataSource) classPathXmlApplicationContext.getBean("druidDataSource");
        System.out.println(druidDataSource);
        System.out.println("测试。。。。");

    }
}
