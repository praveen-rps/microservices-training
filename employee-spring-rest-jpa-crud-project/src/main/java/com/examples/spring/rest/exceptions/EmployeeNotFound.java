package com.examples.spring.rest.exceptions;

public class EmployeeNotFound extends RuntimeException {
	
	public EmployeeNotFound(int empid) {
		super("Employee with "+empid+" id is not found");
	}

}
