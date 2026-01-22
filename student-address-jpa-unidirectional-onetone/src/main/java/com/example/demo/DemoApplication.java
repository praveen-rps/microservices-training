
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Address;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Student student = new Student();
        student.setName("Karthik");

        Address address = new Address();
        address.setStreet("Anna Nagar");
        address.setCity("Chennai");
        address.setState("TN");
        address.setZipcode("600040");

        student.setAddress(address);

        studentRepository.save(student);

        System.out.println("Unidirectional One-to-One data saved successfully");
    }
}
