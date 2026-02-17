package com.app.spring.springaop.peculiarPattern;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class SecondInterceptor {

    Logger logger = Logger.getLogger(SecondInterceptor.class.getName());

    @Around("@annotation(DelegatesTo)")
    public void intercept(ProceedingJoinPoint joinPoint) throws Throwable{
//        System.out.println("2nd BEFORE");
        logger.info("2ND BEFORE");
        joinPoint.proceed();
//        System.out.println("2nd AFTER");
        logger.info("2ND AFTER");
    }
}
