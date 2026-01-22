package com.example.mvc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
	
	int empid;
	String name;
	String dept;
	
	public Employee() {
	
	}

}
