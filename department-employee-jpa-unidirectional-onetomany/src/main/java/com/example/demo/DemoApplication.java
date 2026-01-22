
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
        dept.setName("HR");

        Employee e1 = new Employee();
        e1.setName("Kumar");

        Employee e2 = new Employee();
        e2.setName("Sita");

        dept.setEmployees(Set.of(e1, e2));

        departmentRepository.save(dept);

        System.out.println("Unidirectional One-to-Many data saved successfully");
    }
}
