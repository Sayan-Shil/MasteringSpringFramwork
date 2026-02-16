package com.app.spring.springcontext.nonabstraction.config;

import com.app.spring.springcontext.nonabstraction.object.bird.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Annotate Configuration so that we can configure Spring Context --6
@Configuration
public class ProjectConfig {

    // Create a Method to return Parrot Object -- 7
    // Annotate With @Bean -- 8
    @Bean
    Parrot parrot(){ // Bean has been named as "parrot"
        Parrot parrot = new Parrot();
        parrot.name = "Kuku";
        return parrot;
    }

    // Adding More Beans
    @Bean
    public String hello(){ // Bean name is "hello"
        return "Hello, I Love Java";
    }

    @Bean
    public Integer six(){ // Bean Name is "six"
        return 6;
    }


}
