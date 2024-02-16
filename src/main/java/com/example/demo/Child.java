package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Data
public class Child {
    private String name;
    private Integer age;
    private Date birthday;
    private List<String> text;
}
