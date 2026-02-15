package com.app.spring.object.human;

import com.app.spring.object.animal.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//  Use the name same as Qualifier Bean
public class CatPerson {


    private final String name = "Sayan";
    private final Cat cat;

    @Autowired
    // Error if Spring confused
    public CatPerson(@Qualifier("persian") Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return name +" has " +cat.getName() ;
    }
}
