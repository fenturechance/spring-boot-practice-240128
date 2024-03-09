package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController2 {
    @GetMapping("/well2")
    public String helloPage(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome-page";
    }
}
