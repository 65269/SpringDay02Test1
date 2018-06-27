package com.zyw.spring.service;

import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


//创一个使用JDK的Proxy完成代理工具
public class JDKProxyFactory implements InvocationHandler {
    private Object target;

    public JDKProxyFactory(Object target) {
        this.target = target;
    }

    public Object createProxy() {
        // 使用Proxy完成代理对象创建
        // 1. 得到模板对象的classLoader
        ClassLoader loader = target.getClass().getClassLoader();
        // 2. 得到模板对象的实现接口 class []
        Class[] interfaces = target.getClass().getInterfaces();
        // 3. 第三个参数需要一个实现了Invocationhandler接口对象

        return Proxy.newProxyInstance(loader, interfaces, this::invoke);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(target,args);
    }
}
