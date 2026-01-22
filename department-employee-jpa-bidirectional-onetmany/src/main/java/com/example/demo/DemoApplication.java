
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repository.DepartmentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Department dept = new Department();
        dept.setName("IT");

        Employee e1 = new Employee();
        e1.setName("Ravi");
        e1.setDepartment(dept);

        Employee e2 = new Employee();
        e2.setName("Anita");
        e2.setDepartment(dept);

        dept.setEmployees(Set.of(e1, e2));

        departmentRepository.save(dept);

        System.out.println("Department and Employees saved successfully");
    }
}
