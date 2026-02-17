package com.app.spring.springaop.annotatedInterception;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserInterceptor {
    @Around("@annotation(ToLog)")
//    @Before("@annotation(ToLog)")
//    @After("@annotation(ToLog)")
//    @AfterThrowing(
//            pointcut = "@annotation(ToLog)",
//            throwing = "ex"
//    )
//    @AfterReturning(pointcut = "@annotation(ToLog)", returning = "res") // Method has to return something
    public void getUsername(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Authenticating Successfully");
        pjp.proceed();
        System.out.println("User name fetch done!");
    }
}
