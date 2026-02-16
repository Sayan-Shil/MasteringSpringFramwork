package com.app.spring.springcontext.nonabstraction.main;

import com.app.spring.springcontext.nonabstraction.config.ProjectConfig5;
import com.app.spring.springcontext.nonabstraction.object.bird.Parrot;
import com.app.spring.springcontext.nonabstraction.object.human.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main5 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig5.class);

        // When Parrot and Person both are beans
        // Person will use existing bean of Parrot
        // The no-arg constructor will be executed only once when spring gonna create

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot);
        Person person = context.getBean(Person.class);
        System.out.println(person);

        // If Parrot is removed from Bean
        // As normal flow , two times constructor will be called
        // Remove - @bean from parrot

//        Parrot parrot = new Parrot();
//        parrot.name="Kuku";
//        System.out.println(parrot);
//        Person person = context.getBean(Person.class);
//        System.out.println(person);

        // Hence proved, Spring automatically wiring or delegating the object responsibility pass



        Person personParam = context.getBean("personParam",Person.class);
        System.out.println(personParam);

    }
}
