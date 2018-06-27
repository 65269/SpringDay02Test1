package com.zyw.spring.cjglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory  implements MethodInterceptor {
    // 得到目标对象
    private Object target;
    //  使用构造方法传递目标对象
    public CglibProxyFactory(Object target){
        this.target = target;
    }
    //创建代理对象
    public Object createProxy(){
        // 创建Enhancer
        Enhancer enhancer = new Enhancer();

        // 2. 传递模板对象的class
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        return method.invoke(target,method);
    }
}
