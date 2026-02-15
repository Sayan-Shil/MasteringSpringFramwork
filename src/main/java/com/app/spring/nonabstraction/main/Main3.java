package com.app.spring.nonabstraction.main;

import com.app.spring.nonabstraction.config.ProjectConfig3;
import com.app.spring.nonabstraction.object.animal.Cat;
import com.app.spring.nonabstraction.object.animal.PussyCat;
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
