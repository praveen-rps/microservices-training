package com.examples.mvc.springmvcdemo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		
		// ModelAndView mvc = new ModelAndView("home","name","kumar");
		//return home;
		return "home";
	}
}
