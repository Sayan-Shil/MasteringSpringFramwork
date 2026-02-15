package com.app.spring.nonabstraction.main;

import com.app.spring.nonabstraction.object.animal.Dog;
import com.app.spring.nonabstraction.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        // Create Context with Configuration Class
        var context= new AnnotationConfigApplicationContext(ProjectConfig2.class);
        // Exception -> Spring Context Confused
//      Dog dogesh = context.getBean(Dog.class); // NoUniqueBeanDefinition
        Dog dog = context.getBean("dogesh", Dog.class);
        System.out.println(dog.getName());
        Dog petdog = context.getBean("pet-dog", Dog.class);
        System.out.println(petdog.getName());
        Dog gian =  context.getBean("gian", Dog.class);
        System.out.println(gian.getName());
        // As annotate with @Primary , we can call without name
        Dog dogesh = context.getBean(Dog.class);
        System.out.println(dogesh.getName());
    }
}
