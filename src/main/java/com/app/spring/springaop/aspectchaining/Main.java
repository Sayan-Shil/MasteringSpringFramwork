package com.app.spring.springaop.aspectchaining;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.app.spring.springaop.aspectchaining")
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Main.class);
        Treasury treasury = context.getBean(Treasury.class);
        for (int i = 0; i < 100; i++) {
            treasury.getTreasury();
        }
    }
}
