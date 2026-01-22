package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest1")
public class DemoController {
	
	@GetMapping("/get1")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public String getmapping1() {
		return "getmapping1 is called";
	}
	

	@GetMapping("/get2")
	public String getmapping2() {
		return "getmapping2 is called";
	}

}
