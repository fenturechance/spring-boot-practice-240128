package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody //這個裡面所有方法，給瀏覽器是純文本

@RestController //上面兩個的合成
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
