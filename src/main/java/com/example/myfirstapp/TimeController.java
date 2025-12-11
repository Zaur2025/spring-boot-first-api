package com.example.myfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @GetMapping ("/current-time")
    public String getCurrenttime() {
        return "Текущее время: " + java.time.LocalTime.now();
    }

    @GetMapping ("/current-date")
    public String getCurrentDate() {
        return "Сегодня: " + java.time.LocalDate.now();
    }
}