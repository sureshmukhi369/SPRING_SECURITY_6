package com.example.SPRING_SECURITY_6.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    @GetMapping("/hello")
    public String sayHello() {
        return "Hellow";
    }
}
