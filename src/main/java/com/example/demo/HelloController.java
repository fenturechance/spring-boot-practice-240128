package com.example.demo;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
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
    public String log(String a, String b) {
        log.info("info, a: {}, b: {}", a, b);
        return "log";
    }

    @GetMapping("/dog")
    public Dog dog() {
        Dog dog = new Dog();
        dog.setId(1L);
        dog.setAge(2);
        dog.setName("小黑");
        return dog;
    }
}
