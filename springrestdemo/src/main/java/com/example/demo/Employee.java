package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	
	int empid;
	String name;
	String dept;
	public Employee() {
		this.empid=1001;
		this.name="Anil";
		this.dept="fiance";
	}

}
