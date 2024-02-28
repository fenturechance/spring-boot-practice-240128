package com.example.demo;

import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody //這個裡面所有方法，給瀏覽器是純文本

@RestController //上面兩個的合成
public class HelloController {

    @Autowired
    StringRedisTemplate redisTemplate;
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/increment")
    public String increment() {
        Long haha = redisTemplate.opsForValue().increment("haha");
        return "增加後的值" + haha;
    }

    @GetMapping("/log")
    public String log() {
        LogFactory.getLog(HelloController.class).info("這是info");
        return "log";
    }
}
