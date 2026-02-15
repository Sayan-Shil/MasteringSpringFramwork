package com.app.spring.nonabstraction.object.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorDoctor {

    private String name="Arka";

    private final Patient patient;
    @Autowired
    public ConstructorDoctor(Patient patient) {
        this.patient = patient;
    }

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
