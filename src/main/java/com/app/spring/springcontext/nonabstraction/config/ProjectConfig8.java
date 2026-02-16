package com.app.spring.springcontext.nonabstraction.config;

import com.app.spring.springcontext.nonabstraction.object.animal.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.app.spring.springcontext.nonabstraction.object.human")
public class ProjectConfig8 {

    @Bean
    @Primary
    public Cat kitty() {
        return new Cat("Kitty") ;
    }

    @Bean
    public Cat persian() {
        return new Cat("Persian") ;
    }

    @Bean
    public Cat abysinnian() {
        return new Cat("Abysinnian") ;
    }


}
