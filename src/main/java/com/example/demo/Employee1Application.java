package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Employee1Application {

	public static void main(String[] args) {
		SpringApplication.run(Employee1Application.class, args);
		
		System.out.println("hi I am only available in branchs");
	}

}
