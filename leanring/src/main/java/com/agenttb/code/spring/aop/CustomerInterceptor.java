package com.agenttb.code.spring.aop;

import com.agenttb.code.spring.annotation.BusinessScope;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Method;

public class CustomerInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object obj = methodInvocation.getThis();
        Class<?> targetClass = AopProxyUtils.ultimateTargetClass(obj);
        if (targetClass == null) {
            targetClass = obj.getClass();
        }
        Method method = ClassUtils.getMostSpecificMethod(methodInvocation.getMethod(), targetClass);
        BusinessScope annotation = AnnotationUtils.findAnnotation(method, BusinessScope.class);
        if (annotation != null) {
            System.out.println("************Find BusinessScope annotation****************");
        }
        return methodInvocation.proceed();
    }
}
