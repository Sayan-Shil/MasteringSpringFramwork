package com.app.spring.springcontext.nonabstraction.main;

import com.app.spring.springcontext.nonabstraction.config.ProjectConfig6;
import com.app.spring.springcontext.nonabstraction.object.human.ConstructorDoctor;
import com.app.spring.springcontext.nonabstraction.object.human.FieldDoctor;
import com.app.spring.springcontext.nonabstraction.object.human.MethodDoctor;
import com.app.spring.springcontext.nonabstraction.object.human.Patient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Field;

public class Main6 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        var context = new AnnotationConfigApplicationContext(ProjectConfig6.class);

        FieldDoctor doctor = context.getBean(FieldDoctor.class);
        System.out.println(doctor);

        MethodDoctor methodDoctor = context.getBean(MethodDoctor.class);
        System.out.println(methodDoctor);

        ConstructorDoctor constructorDoctor = context.getBean(ConstructorDoctor.class);
        System.out.println(constructorDoctor);

        Class<FieldDoctor> c = FieldDoctor.class;
        Field field = c.getDeclaredField("patient");
        field.setAccessible(true);
        // Change the field
        Patient patient2= new Patient();
        patient2.setName("Sayan");
        field.set(doctor,patient2);
        // Now Call doctor
        System.out.println(doctor);

    }
}
