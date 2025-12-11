package com.example.myfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstappApplication {

	public static void main(String[] args) {
		System.out.println("HI!");
		SpringApplication.run(MyfirstappApplication.class, args);
	}
}