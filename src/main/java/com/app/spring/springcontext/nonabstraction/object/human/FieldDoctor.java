package com.app.spring.springcontext.nonabstraction.object.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldDoctor {

    private String name="Arka";

    // Field Injection
    @Autowired
    private Patient patient;

    @Override
    public String toString() {
        return name + " is treating "+patient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
