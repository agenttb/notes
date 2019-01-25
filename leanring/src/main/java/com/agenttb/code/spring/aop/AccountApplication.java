package com.agenttb.code.spring.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactoryBean;

public class AccountApplication {

    public static void main(String[] args) {
        Advice beforeAdvice = new AccountServiceBeforeAdvice();
        Advice afterAdvice = new AccountServiceAfterReturningAdvice();
        Advice throwAdvice = new AccountServiceThrowAdvice();

        AccountServiceImpl accountService = new AccountServiceImpl();

        ProxyFactoryBean proxy = new ProxyFactoryBean();
        proxy.setInterfaces(AccountService.class);
        proxy.setTarget(accountService);

        //proxy.setProxyTargetClass(true);

        proxy.addAdvice(beforeAdvice);
        proxy.addAdvice(afterAdvice);
        proxy.addAdvice(throwAdvice);

        AccountService service = (AccountService) proxy.getObject();
        System.out.println("开始查询**********");
        service.query();
        System.out.println("开始冻结*********");
        service.freeze();
        System.out.println("开始解冻*********");
        service.unFreeze();
    }
}
