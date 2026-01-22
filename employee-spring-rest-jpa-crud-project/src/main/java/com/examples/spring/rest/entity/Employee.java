package com.examples.spring.rest.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="ctsemployees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	int empid;
	
	@NotNull(message = "Employee name is mandatory")
	@Size(min = 3, max = 30, message = "Name must be 3–30 characters")
	String name;
	
	@NotNull(message = "Employee dept is mandatory")
	@Size(min = 3, max = 30, message = "dept must be 3–30 characters")
	String dept;
	
	LocalDate joinDate;
	
	@NotNull(message = "Salary cannot be null")
	@Min(value = 10000, message = "Salary must be at least 10000")
	double salary;

}
