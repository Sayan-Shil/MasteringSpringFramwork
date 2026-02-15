package com.app.spring.nonabstraction.object.bird;

// Our Parrot Class -- 1
public class Parrot {
    public Parrot() {
        System.out.println("Parrot Constructor called");
    }

    public String name;

    @Override
    public String toString() {
        return name;
    }
}
