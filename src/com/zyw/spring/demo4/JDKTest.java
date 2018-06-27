package com.zyw.spring.demo4;

import org.junit.Test;

public class JDKTest {

    @Test
    public void test1(){

        IUserService userService = new UserServiceImpl();

        JDKProxyFactory factory =new JDKProxyFactory(userService);

        IUserService proxy = (IUserService) factory.createProxy();

        proxy.login();
        proxy.regist();
    }

}

