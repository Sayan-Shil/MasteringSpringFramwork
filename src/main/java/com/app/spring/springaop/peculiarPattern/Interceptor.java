package com.app.spring.springaop.peculiarPattern;

import com.app.spring.springaop.aspectchaining.SecurityAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class Interceptor {

    Logger logger = Logger.getLogger(Interceptor.class.getName());

    @Around("@annotation(DelegatesTo)")
    public void intercept(ProceedingJoinPoint joinPoint) throws Throwable{
//        System.out.println("BEFORE");
        logger.info("BEFORE");
        joinPoint.proceed();
//        System.out.println("AFTER");
        logger.info("AFTER");
    }
}
