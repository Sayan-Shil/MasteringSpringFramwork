package com.app.spring.main;

import com.app.spring.config.ProjectConfig3;
import com.app.spring.object.animal.Cat;
import com.app.spring.object.animal.PussyCat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        // Create Context with Configuration Class
        var context= new AnnotationConfigApplicationContext(ProjectConfig3.class);

        // Directly get the required bean
        Cat cat = context.getBean(Cat.class);
        // Null because we did not set any name of instance
        System.out.println(cat.getName());

        PussyCat pussyCat = context.getBean(PussyCat.class);
        System.out.println(pussyCat.getName());
    }
}
