package com.app.spring.springaop.changingMethodParamWithAOP;

import org.springframework.stereotype.Service;

@Service
public class JuiceService {
    public void makeJuice(Fruit fruit){
        fruit.extract();
    }

}
