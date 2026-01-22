package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(DemoApplication.class, args);
		
		Student s = context.getBean(Student.class);
		System.out.println(s);
	}
}
