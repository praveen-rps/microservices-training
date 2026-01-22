package com.examples.spring.rest.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.spring.rest.dao.EmployeeDao;
import com.examples.spring.rest.dto.EmployeeView;
import com.examples.spring.rest.entity.Employee;
import com.examples.spring.rest.exceptions.EmployeeNotFound;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}
	@Override
	public List<Employee> getEmployeesByDept(String dept) {
		// TODO Auto-generated method stub
		return dao.findAllByDept(dept);
	}
	@Override
	public List<Employee> getEmployeesJoiningDateBefore(LocalDate date) {
		// TODO Auto-generated method stub
		return dao.findAllByJoinDateBefore(date);
	}

	@Override
	public List<Employee> getAllEmployeesSalLessThan(double salary) {
		// TODO Auto-generated method stub
		return dao.findAllBySalaryLessThan(salary);
	}
	@Override
	public List<Employee> findAllEmployeesWithSalAndDept(String dept, double sal){
		return dao.findAllEmployeesWithSalAndDept(dept, sal);
	}
	@Override
	public Double findMaxSalary() {
		// TODO Auto-generated method stub
		return dao.findMaxSalary();
	}
	@Override
	public List<EmployeeView> getNameSalDept() {
		// TODO Auto-generated method stub
		return dao.getNameSalDept();
	}
	@Override
	public Optional<Employee> getEmployeeById(int empid) throws EmployeeNotFound{
		// TODO Auto-generated method stub
		
		return Optional.of(dao.findById(empid)
				.orElseThrow(() ->
				new EmployeeNotFound(empid)));
	}

}







