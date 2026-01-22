package com.examples.spring.rest.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.examples.spring.rest.dto.EmployeeView;
import com.examples.spring.rest.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	//@Query("")
	public List<Employee> findAllByDept(String dept);
	public List<Employee> findAllByJoinDateBefore(LocalDate date);
	//public List<Employee> findAllByJoinDateBetween(LocalDate date1, LocalDate date2);
	public List<Employee> findAllBySalaryLessThan(double salary);
	
	@Query("select e from Employee e where e.dept=?1 and e.salary>?2")
	public List<Employee> findAllEmployeesWithSalAndDept(String dept, double sal);
	
	@Query("SELECT MAX(e.salary) FROM Employee e")
	Double findMaxSalary();
	
	@Query("select e.name as name,e.dept as dept,e.salary as salary from Employee e")
	public List<EmployeeView> getNameSalDept();
}
/*

	findByXXXX()
	findAllByXXXX()
	
	LessThan
	GreaterThan
	Equals
	Between
	
	Integer, Double, Float, String
	
	
	Date - Before, After
	
	

*/