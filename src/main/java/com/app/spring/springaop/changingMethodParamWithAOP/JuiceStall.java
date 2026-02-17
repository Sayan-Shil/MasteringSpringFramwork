package com.app.spring.springaop.changingMethodParamWithAOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JuiceStall {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(FruitConfig.class);

        Fruit fruit = new Apple();
        JuiceService juiceService = context.getBean(JuiceService.class);
        juiceService.makeJuice(fruit);

    }
}
