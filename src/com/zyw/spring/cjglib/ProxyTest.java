package com.zyw.spring.cjglib;

import com.zyw.spring.service.IUserService;
import com.zyw.spring.service.UserServiceImpl;
import org.junit.Test;

public class ProxyTest {


    @Test
    public void test1() {
        IUserService userService = new UserServiceImpl();
        CglibProxyFactory factory = new CglibProxyFactory(userService);
        UserServiceImpl proxy = (UserServiceImpl) factory.createProxy();
        proxy.regist();
    }
}