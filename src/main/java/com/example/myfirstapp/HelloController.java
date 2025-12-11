package com.example.myfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Привет от Spring Boot! \uD83D\uDE80";
    }

    @GetMapping ("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Привет, " + name + "! Добро пожаловать в Spring!";
    }

    @GetMapping ("/test")
    public String test() {
        return "Это тестовая страница!";
    }
}