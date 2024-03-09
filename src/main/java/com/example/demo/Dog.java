package com.example.demo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement
public class Dog {
    private Long id;
    private String name;
    private Integer age;
}
