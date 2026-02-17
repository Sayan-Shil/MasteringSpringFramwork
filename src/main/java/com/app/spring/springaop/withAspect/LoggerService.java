package com.app.spring.springaop.withAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerService {

    @Around("execution(* com.app.spring.springaop.withAspect.* .*(..))")
    public void log(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Method Request is going....");
        pjp.proceed();
        System.out.println("Method Response is coming....");
    }
}
