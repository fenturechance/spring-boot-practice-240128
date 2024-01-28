package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //TestInterface testInterface = new TestClass1();
        //testInterface.call();
        TestInterface testInterface = applicationContext.getBean("TestInterface", TestInterface.class);
        testInterface.call();
        SpringApplication.run(DemoApplication.class, args);
    }

}
