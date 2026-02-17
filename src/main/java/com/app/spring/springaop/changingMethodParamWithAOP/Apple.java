package com.app.spring.springaop.changingMethodParamWithAOP;

public class Apple implements Fruit {
    @Override
    public void extract() {
        System.out.println("Extracting Apple");
        System.out.println("Fresh Apple Juice");
    }
}
