package com.app.spring.springcontext.nonabstraction.main;

import com.app.spring.springcontext.nonabstraction.config.ProjectConfig4;
import com.app.spring.springcontext.nonabstraction.object.bird.Crow;
import com.app.spring.springcontext.nonabstraction.object.bird.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main4 {
    public static void main(String[] args) {
        // Create Context And Add Config File
        var context = new AnnotationConfigApplicationContext(ProjectConfig4.class);

        // Create an instance and a supplier we want to add
        Crow x = new Crow();
        x.setName("Kakkuuu");
        Supplier<Crow> crowSupplier = () -> x;
        Supplier<Parrot> parrotSupplier = () -> {
            Parrot parrot = new Parrot();
            parrot.name = "Miku";
            return parrot;
        };

        // Add The Bean to Context
        context.registerBean("crow", Crow.class,crowSupplier);
        context.registerBean("parrot", Parrot.class,parrotSupplier,bc->bc.setPrimary(true));

        // Get The Bean
        Crow pet = context.getBean("crow", Crow.class);
        System.out.println(pet.getName());

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.name);
    }
}
