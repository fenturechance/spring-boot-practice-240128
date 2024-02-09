package com.example.demo;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class AppConfig2 {

    @ConditionalOnClass(User.class)
    @Bean
    public Cat cat1() {
        return new Cat();
    }

    @ConditionalOnMissingClass(value="com.example.demo.Dog")
    @Bean
    public Dog dog1() {
        return new Dog();
    }
}
