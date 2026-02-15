package com.app.spring.object.human;

import org.springframework.stereotype.Component;

@Component
public class Patient {
    private String name = "Arpan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
