package com.zyw.spring.service;


import org.junit.Test;

public class Proxy {

    @Test
    public void test1() {
        // 1. 创建目标对象
         IUserService userService = new UserServiceImpl();

         // 2. 通过JDKProxyFactory完成代理对象的创建
        JDKProxyFactory factory = new JDKProxyFactory(userService);

        IUserService proxy = (IUserService) factory.createProxy();

        proxy.login();
    }
}
