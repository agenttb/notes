package com.agenttb.code.dubbo.provider.service;


import com.agenttb.code.dubbo.provider.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl  implements UserService {
    @Override
    public String sayHello() {
        return "hello world";
    }
}
