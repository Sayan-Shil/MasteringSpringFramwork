package com.app.spring.main;

import com.app.spring.config.ProjectConfig7;
import com.app.spring.object.circularDependencies.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main7 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig7.class);
        // Directly Got exception as A needs B and B needs A
    }
}
