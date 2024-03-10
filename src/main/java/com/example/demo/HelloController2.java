package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController2 {
    @GetMapping("/well2")
    public String helloPage(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        List<Dog> list = Arrays.asList(
                new Dog(1L, "小黑", 1),
                new Dog(1L, "小黑2", 1),
                new Dog(1L, "小黑3", 1),
                new Dog(1L, "小黑4", 1),
                new Dog(1L, "小黑5", 1)
        );
        model.addAttribute("list", list);
        return "welcome-page";
    }
}
