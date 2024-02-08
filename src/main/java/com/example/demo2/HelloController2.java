package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody //這個裡面所有方法，給瀏覽器是純文本

@RestController()
public class HelloController2 {

    @GetMapping("/hello2")
    public String hello() {
        return "Hello World";
    }
}
