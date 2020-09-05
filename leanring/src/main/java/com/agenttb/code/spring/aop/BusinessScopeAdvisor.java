package com.agenttb.code.spring.aop;

import com.agenttb.code.spring.annotation.BusinessScope;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Method;


@Configuration
public class BusinessScopeAdvisor extends AbstractPointcutAdvisor {

    private final StaticMethodMatcherPointcut pointcut = new StaticMethodMatcherPointcut() {
        @Override
        public boolean matches(Method method, Class<?> aClass) {
            Method instanceMethod = ClassUtils.getMostSpecificMethod(method, aClass);
            return instanceMethod.isAnnotationPresent(BusinessScope.class) || aClass.isAnnotationPresent(BusinessScope.class);
        }
    };
    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return new CustomerInterceptor();
    }
}
