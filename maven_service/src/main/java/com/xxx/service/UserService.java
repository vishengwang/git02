package com.xxx.service;

import com.xxx.dao.UserDao;

/**
 * @Author Vishengwang
 * @Date 2022/9/3 16:48
 */
public class UserService {
    public static void testService() {
        System.out.println("UserService Test.....");

        // 调用maven_dao模块的方法,先在User_Service的pom.xml文件中引入User_Dao模块的依赖
        UserDao.tetsDao();
    }
}
