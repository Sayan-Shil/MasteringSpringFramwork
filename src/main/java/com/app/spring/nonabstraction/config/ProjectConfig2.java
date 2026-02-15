package com.app.spring.nonabstraction.config;

import com.app.spring.nonabstraction.object.animal.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig2 {

    //Add 3 Dogs as Beans as Method name

    @Bean
    @Primary
    public Dog dogesh(){
        return new Dog("Dogesh");
    }
    // Customize the bean name with name attribute
    @Bean(value = "gian")
    public Dog muku(){
        return new Dog("Muku");
    }
    // Customize the bean name with name attribute
    @Bean(name = "pet-dog")
    public Dog ruku(){
        return new Dog("Ruku");
    }


}
