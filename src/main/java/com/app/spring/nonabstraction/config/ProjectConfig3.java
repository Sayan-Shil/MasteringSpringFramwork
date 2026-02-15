package com.app.spring.nonabstraction.config;

// This Configuration File is for Component Scan

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.app.spring")
public class ProjectConfig3 {
}
