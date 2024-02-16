package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data //自動生成getter setter
@NoArgsConstructor // 自動生成無參數constructor
@AllArgsConstructor // 自動生成全參數constructor
@ConfigurationProperties(prefix = "person")
@Component
public class Person {
    private Long id;
    private String name;
    private Date birthday;
    private Boolean like;
    private Child child;
    private List<Dog> dogs;
    private Map<String, Cat> cats;
}
