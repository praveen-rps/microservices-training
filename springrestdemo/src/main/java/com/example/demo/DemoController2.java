package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class DemoController2 {
	
	
	@GetMapping("/get1")
	public String getmapping1() {
		return "getmapping1 in controller2  is called";
	}
	
	
	@GetMapping("/get2")
	public String getmapping2() {
		return "getmapping2 in controller2 is called";
	}

}
