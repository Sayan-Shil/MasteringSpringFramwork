package com.app.spring.springaop.withAspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

       Comment comment = new Comment();
       comment.setComment("Hello Java");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getClass().getSimpleName());
        userService.publishComment(comment);
    }
}
