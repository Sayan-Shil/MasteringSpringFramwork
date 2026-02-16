package com.app.spring.springcontext.nonabstraction.object.circularDependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    private final A a;

    @Autowired
    public B(A a) {
        this.a = a;
        System.out.println("Creation of B bean successfully");
    }


}
