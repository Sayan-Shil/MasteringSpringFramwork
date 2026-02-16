package com.app.spring.springcontext.nonabstraction.main;

import com.app.spring.springcontext.nonabstraction.object.bird.Parrot;
import com.app.spring.springcontext.nonabstraction.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Create Instance of Parrot --2
        Parrot parrot = new Parrot();
        parrot.name = "kiki";
        // Go to Pom.xml and Add Context Dependency --3
        // Creating Context Instance --5
        var context = new AnnotationConfigApplicationContext();
        // Register Configuration Class --> 8
        context.register(ProjectConfig.class);
        // Refresh it --9
        context.refresh();

        // Instance is given by Spring Context
        Parrot parrot2 = context.getBean(Parrot.class);
        System.out.println(parrot.name);
        System.out.println(parrot2.name);

        //Testing Two Other Beans
        // Directly Written
        String hello = new AnnotationConfigApplicationContext(ProjectConfig.class).getBean(String.class);
        int six = new AnnotationConfigApplicationContext(ProjectConfig.class).getBean(Integer.class);

        System.out.println(hello + " "+ six);
    }
}
