package com.app.spring.springcontext.nonabstraction.main;

import com.app.spring.springcontext.nonabstraction.config.ProjectConfig8;
import com.app.spring.springcontext.nonabstraction.object.human.CatPerson;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main8 {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfig8.class);

        CatPerson person = context.getBean(CatPerson.class);
        System.out.println(person);
    }
}
