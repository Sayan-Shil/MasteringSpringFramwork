package com.app.spring.nonabstraction.main;

import com.app.spring.nonabstraction.config.ProjectConfig7;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main7 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig7.class);
        // Directly Got exception as A needs B and B needs A
    }
}
