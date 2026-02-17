package com.app.spring.springaop.changingMethodParamWithAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FruitInterceptor {

    @Around("execution(* com.app.spring.springaop.changingMethodParamWithAOP.*.*(..))")
    public void alterFruitJuice(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = {new Fruit() {
            @Override
            public void extract() {
                System.out.println("Rotten Fruit");
            }
        }};
        pjp.proceed(args);
    }
}
