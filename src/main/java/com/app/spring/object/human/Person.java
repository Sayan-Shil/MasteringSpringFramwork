package com.app.spring.object.human;

import com.app.spring.object.bird.Parrot;

// Creating Person Class
public class Person {
    Parrot parrot;
    String name;

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name +" owns " + parrot;
    }
}
