package com.app.spring.springaop.annotatedInterception;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = "com.app.spring.springaop.annotatedInterception")
@EnableAspectJAutoProxy
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Main.class);
        User user = new User();
        user.setName("Sayan Shil");

        UserService userService = context.getBean(UserService.class);
        userService.sayUserName(user);
    }
}
