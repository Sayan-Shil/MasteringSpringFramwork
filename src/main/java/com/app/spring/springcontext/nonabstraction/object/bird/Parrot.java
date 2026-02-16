package com.app.spring.springcontext.nonabstraction.object.bird;

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
