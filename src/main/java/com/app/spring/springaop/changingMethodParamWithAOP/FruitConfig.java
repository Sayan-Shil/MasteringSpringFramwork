package com.app.spring.springaop.changingMethodParamWithAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.app.spring.springaop.changingMethodParamWithAOP")
@EnableAspectJAutoProxy
public class FruitConfig {
}
