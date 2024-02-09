package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlReaderContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //急切初始化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("第一次getBean之前");
        applicationContext.getBean("TestInterface", TestInterface.class);
        ((ClassPathXmlApplicationContext) applicationContext).close();

        System.out.println("-----");

        //延遲初始化
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
        beanDefinitionReader.loadBeanDefinitions(resource);
        System.out.println("第二次getBean之前");
        factory.getBean("TestInterface");

        //TestInterface testInterface = new TestClass1();
        //testInterface.call();
        //TestInterface testInterface = applicationContext.getBean("TestInterface", TestInterface.class);
        //testInterface.call();
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        TestClass1 testClass1 = context.getBean(TestClass1.class);
//        System.out.println(testClass1);

        //java 10局部變量自動推斷
        var ioc = SpringApplication.run(DemoApplication.class, args);
//        String[] names = ioc.getBeanDefinitionNames();
//        for (String name: names) {
//            System.out.println(name);
//        }
//        String[] forType = ioc.getBeanNamesForType(User.class);
//        Object user1 = ioc.getBean("UserConfigNameInContainer");
//        Object user2 = ioc.getBean("UserConfigNameInContainer");
//        System.out.println(user1 == user2); //如果scope是prototype的話，就會不同

//        for (String s: ioc.getBeanNamesForType(Cat.class)) {
//            System.out.println("cat" + s);
//        }
//        for (String s: ioc.getBeanNamesForType(Dog.class)) {
//            System.out.println("dog" + s);
//        }
        Pig pig = ioc.getBean(Pig.class);
        System.out.println(pig.toString());
    }

}
