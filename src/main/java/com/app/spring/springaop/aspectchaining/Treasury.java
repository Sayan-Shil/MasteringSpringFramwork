package com.app.spring.springaop.aspectchaining;

import org.springframework.stereotype.Component;

@Component
public class Treasury {

    @ToLog
    public void getTreasury(){
        System.out.println("You Got Treasury !!");
    }
}
