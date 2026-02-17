package com.app.spring.springaop.withAspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.app.spring.springaop.withAspect")
@EnableAspectJAutoProxy
public class ProjectConfig {

}
