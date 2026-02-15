package com.app.spring.nonabstraction.object.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MethodDoctor {

    private String name="Arka";

    // Method Injection
    private Patient patient;

    @Autowired
    public void setPatient(Patient patient) {
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
