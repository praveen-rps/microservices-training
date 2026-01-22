package com.examples.spring.rest.exceptions;

public class InvalidEmployeeException extends RuntimeException{
	
	public InvalidEmployeeException() {
		super("Invalid employee details");
	}
}
