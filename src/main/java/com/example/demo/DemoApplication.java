package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //TestInterface testInterface = new TestClass1();
        //testInterface.call();
        //TestInterface testInterface = applicationContext.getBean("TestInterface", TestInterface.class);
        //testInterface.call();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TestClass1 testClass1 = context.getBean(TestClass1.class);
        System.out.println(testClass1);
        SpringApplication.run(DemoApplication.class, args);
    }

}
