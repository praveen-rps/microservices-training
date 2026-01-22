package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping
	//@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<String> getmapping() {
		return new ResponseEntity<>("Hello  mapping is called",HttpStatus.CREATED);
	}
	//data+resp ok
	@PostMapping
	public String postMapping() {
		return "Post mapping is called";
	}
	@PutMapping
	public String putMapping() {
		return "Put mapping is called";
	}
}
