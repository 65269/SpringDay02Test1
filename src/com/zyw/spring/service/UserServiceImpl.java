package com.zyw.spring.service;

public class UserServiceImpl implements IUserService {
    @Override
    public void login() {
        System.out.println("登录操作");
    }

    @Override
    public void regist() {
        System.out.println("注册操作");
    }
}
