package com.app.spring.main;

import com.app.spring.config.ProjectConfig8;
import com.app.spring.object.human.CatPerson;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main8 {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfig8.class);

        CatPerson person = context.getBean(CatPerson.class);
        System.out.println(person);
    }
}
