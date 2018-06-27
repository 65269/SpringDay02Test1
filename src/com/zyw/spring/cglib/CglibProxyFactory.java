package com.zyw.spring.cglib;

import org.hibernate.Hibernate;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory  implements MethodInterceptor {
    private Object target;



    public CglibProxyFactory(Object target) {
        this.target= target;
    }

    /**
     * 创建代理对象
     * @return
     */
    public Object createProxy(){
        //创建enhancer
        Enhancer enhancer = new Enhancer();

        // 传递目标对象class
        enhancer.setSuperclass(target.getClass());

        // 设置回调操作(相当于In)
        enhancer.setCallback();

    }

    /**
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        return ;
    }
}
