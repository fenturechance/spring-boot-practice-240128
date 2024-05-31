package com.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @RequestMapping
    public String hello() {
        return "Hello from test controller";
    }
}
