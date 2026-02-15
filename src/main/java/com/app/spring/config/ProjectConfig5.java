package com.app.spring.config;

import com.app.spring.object.bird.Parrot;
import com.app.spring.object.human.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig5 {

    @Bean
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.name = "Kuku";
        return parrot;
    }

    @Bean
    @Primary
    public Person person(){
        Person person = new Person();
        person.setName("Sayan");
        // Spring will use the bean
        person.setParrot(parrot());         // --> Call of registered parrot beans
//        person.setParrot(new Parrot());   // --> New instance completely which is not a bean
        return person;
    }

    @Bean
    public Person personParam(Parrot parrot){ // --> Here, we are saying that find Parrot Class bean if exists
        Person person = new Person();
        person.setName("Arka");
        person.setParrot(parrot);
        return person;
    }

}
