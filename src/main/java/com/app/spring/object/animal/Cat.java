package com.app.spring.object.animal;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;
    public String getName() {
        return name;
    }
}
