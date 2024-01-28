package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public TestClass1 testClass1() {
        return new TestClass1("IamTestProp");
    }
}
