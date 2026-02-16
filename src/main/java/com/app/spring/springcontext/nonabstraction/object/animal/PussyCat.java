package com.app.spring.springcontext.nonabstraction.object.animal;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class PussyCat {
    private String name;
    public String getName() {
        return name;
    }
    // Use of @PostConstruct to initialise with default instance properties
    // Add @PostConstruct annotation from jakarta annotation api
    @PostConstruct
    public void init(){
        this.name = "Meow Cat";
    }
}
