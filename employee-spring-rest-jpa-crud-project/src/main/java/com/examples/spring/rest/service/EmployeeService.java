package com.examples.spring.rest.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.examples.spring.rest.dto.EmployeeView;
import com.examples.spring.rest.entity.Employee;
import com.examples.spring.rest.exceptions.EmployeeNotFound;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee employee);
	public List<Employee> getEmployeesByDept(String dept);
	public List<Employee> getEmployeesJoiningDateBefore(LocalDate date);
	public List<Employee> getAllEmployeesSalLessThan(double salary);
	
	public Optional<Employee> getEmployeeById(int empid) throws EmployeeNotFound;
	
	public List<Employee> findAllEmployeesWithSalAndDept(String dept, double sal);
	public Double findMaxSalary();
	public List<EmployeeView> getNameSalDept();

}
