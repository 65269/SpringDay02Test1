package com.zyw.spring.demo4;


import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


//chuang创建一个使用jdkproxy的代理工具
public class JDKProxyFactory  implements InvocationHandler {

    private Object target;
    public JDKProxyFactory(Object target){
    this.target= target;
    }

    public Object createProxy(){

        ClassLoader loader = target.getClass().getClassLoader();

        Class[] interfaces = target.getClass().getInterfaces();

        return Proxy.newProxyInstance(loader,interfaces,this::invoke);
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(target,args);
    }
}
