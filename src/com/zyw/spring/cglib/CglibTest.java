package com.zyw.spring.cglib;

import com.zyw.spring.demo4.IUserService;
import com.zyw.spring.demo4.UserServiceImpl;
import org.junit.Test;

public class CglibTest {
    @Test
    public void test1() {
        //创建目标对象
        IUserService userService = new UserServiceImpl();

        // 使用cglibproxyfactor创建代理对象
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(userService);

        //

    }
}