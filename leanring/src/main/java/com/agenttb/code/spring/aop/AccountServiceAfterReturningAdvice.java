package com.agenttb.code.spring.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AccountServiceAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("AFTER_RETURNING: 调用结束");
    }
}
