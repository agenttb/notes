package com.agenttb.code.spring.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class AccountServiceThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex) {
        System.out.println("AFTER_THROWING");
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
        System.out.println("AFTER_THROWING: 方法调用出现异常");
    }
}
