package com.app.spring.springaop.aspectchaining;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
//Order Imp
@Order(1)
public class SecurityAspect {


    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(ToLog)")
    public void doAuthenticate(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Currently Authentication Process");
        joinPoint.proceed();

    }
}
