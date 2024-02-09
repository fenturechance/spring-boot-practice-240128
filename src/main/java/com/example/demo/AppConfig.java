package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //這是一個配置類
public class AppConfig {
    @Bean
    public TestClass1 testClass1() {
        return new TestClass1("IamTestProp");
    }

    @Scope("prototype")
    @Bean("UserConfigNameInContainer") //替代beans.xml
    //組件在容器中的名字是方法名，可以直接修改註解的值
    public User testUser() {
        var user = new User();
        user.setId(1L);
        user.setName("Jerry");
        return user;
    }
}
