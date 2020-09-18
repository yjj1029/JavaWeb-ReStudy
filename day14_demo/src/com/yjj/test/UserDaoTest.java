package com.yjj.test;

import com.yjj.dao.UserDao;
import com.yjj.domain.User;
import org.junit.Test;

public class UserDaoTest {



    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUsername("admin");
        loginuser.setPassword("admin");


        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
