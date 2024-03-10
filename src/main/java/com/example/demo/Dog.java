package com.example.demo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JacksonXmlRootElement
@AllArgsConstructor
public class Dog {
    private Long id;
    private String name;
    private Integer age;
}
