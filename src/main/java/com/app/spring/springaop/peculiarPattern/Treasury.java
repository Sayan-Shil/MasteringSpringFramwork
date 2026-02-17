package com.app.spring.springaop.peculiarPattern;

import org.springframework.stereotype.Component;

@Component
public class Treasury {

    @DelegatesTo
    public void getTreasury(){
        System.out.println("You Got Treasury !!");
    }
}
