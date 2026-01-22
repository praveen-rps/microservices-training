package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestData {
	
	@PostMapping("/post")
	public Employee receiveEmployee(@RequestBody Employee emp , @RequestHeader String key1) {
		emp.setEmpid(1);
		System.out.println(key1);
		return emp;
	}
	
	@GetMapping("/employee")
	public ResponseEntity<Employee> sendemployee() {
		ResponseEntity entity = new ResponseEntity(new Employee(), HttpStatus.OK);
		return entity;
	}
	
	
	 
	
	@GetMapping("/login")
	public String validate(@RequestParam String uid, 
			@RequestParam String pwd) {
		if(uid.equals("admin") && pwd.equals("admin"))
			return "login is valid";
		else
			return "Invalid login";
	}

}
