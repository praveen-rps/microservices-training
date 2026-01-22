package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
	
	int htno;
	String name;
	String branch;
	public Student() {
		this.htno=1001;
		this.name="Anil";
		this.branch="Chennai";
	}
}
