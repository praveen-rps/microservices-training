package com.examples.spring.rest.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examples.spring.rest.dto.EmployeeView;
import com.examples.spring.rest.entity.Employee;
import com.examples.spring.rest.exceptions.EmployeeNotFound;
import com.examples.spring.rest.exceptions.InvalidEmployeeException;
import com.examples.spring.rest.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/api/employees/empid/{id}")
	public Optional<Employee> getEmployeeDetails(@PathVariable Integer id) 
			throws EmployeeNotFound{
		if (id<0) {
			throw new InvalidEmployeeException();
		}
		return service.getEmployeeById(id);
	}

	@GetMapping("/api/employees/details")
	public List<EmployeeView> getShortDetails() {
		return service.getNameSalDept();
	}

	@GetMapping("/api/employees/maxsalary")
	public Double findMaxSalary() {
		return service.findMaxSalary();
	}

	@GetMapping("/api/employees/{dept}/{salary}")
	public List<Employee> findEmpWithDeptAndSal(@PathVariable String dept, @PathVariable Double salary) {
		return service.findAllEmployeesWithSalAndDept(dept, salary);
	}

	@GetMapping("/api/employees/salary/{sal}")
	public List<Employee> findEmpBySal(@PathVariable double sal) {
		return service.getAllEmployeesSalLessThan(sal);
	}

	@GetMapping("/api/employees/joiningdate/{date}")
	public List<Employee> findByJoingDate(@PathVariable LocalDate date) {
		return service.getEmployeesJoiningDateBefore(date);
	}

	@GetMapping("/api/employees/dept/{dname}")
	public List<Employee> findByDeptName(@PathVariable String dname) {
		return service.getEmployeesByDept(dname);
	}

	@GetMapping("/api/employees")
	public List<Employee> getAll() {
		return service.getAllEmployees();
	}

	@PostMapping("/api/employees")
	public Employee addEmployee(@Valid @RequestBody Employee emp) {
		return service.addEmployee(emp);
	}

}
