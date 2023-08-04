package com.yixuexi.demo01.test;

import com.yixuexi.demo01.dao.UserDao;
import com.yixuexi.demo01.dao.impl.UserDaoImpl;
import com.yixuexi.demo01.service.AddressService;
import com.yixuexi.demo01.service.SchoolService;
import com.yixuexi.demo01.service.TeacherService;
import com.yixuexi.demo01.service.UserService;
import com.yixuexi.demo01.service.impl.StudentServiceImpl;
import com.yixuexi.demo01.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    public static void main(String[] args) {
        // 配置文件的名字
        String config = "beans.xml";
        // 创建
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(config);
        // 从容器里获取UserService对象
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");

        UserDao userDao = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        userDao.doSome();
        userService.doSome();
        UserServiceImpl userService1 = (UserServiceImpl) userService;
        userService1.getUserDao().doSome();
        System.out.println(userService.toString());
        System.out.println(userDao);
        System.out.println(classPathXmlApplicationContext.getBeanDefinitionCount());

        System.out.println("================================================");
        System.out.println(classPathXmlApplicationContext.getBean("aaa"));
        System.out.println(classPathXmlApplicationContext.getBean("bbb"));
        System.out.println(classPathXmlApplicationContext.getBean("userService"));

        System.out.println("=======================");
        System.out.println(classPathXmlApplicationContext.getBean("userDao02"));

        System.out.println("===========================");
        System.out.println(classPathXmlApplicationContext.getBean("userService02"));
        // 关闭容器
        // classPathXmlApplicationContext.close();


        UserDaoImpl userDao03 = (UserDaoImpl) classPathXmlApplicationContext.getBean("userDao03");
        System.out.println(userDao03.getName());
        System.out.println("============================");
        StudentServiceImpl studentService = (StudentServiceImpl) classPathXmlApplicationContext.getBean("studentService");

        System.out.println(studentService.getName());

        System.out.println(classPathXmlApplicationContext.getBean("userDaoFactoryBean01") + "静态工厂方式创建bean");

        System.out.println(classPathXmlApplicationContext.getBean("userDaoFactoryBean02"));

    }
    @Test
    public void doSome(){
        String config = "beans.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SchoolService schoolService1 = (SchoolService) applicationContext.getBean("schoolService1");
        schoolService1.show();

        TeacherService teacherServiceImpl = (TeacherService) applicationContext.getBean("teacherServiceImpl");

        teacherServiceImpl.show();
    }
    @Test
    public void doOther(){
        String config = "beans.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(config);
        AddressService addressServiceImpl = (AddressService) classPathXmlApplicationContext.getBean("addressServiceImpl");

        addressServiceImpl.show();
    }
}
