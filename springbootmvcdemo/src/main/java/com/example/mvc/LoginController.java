package com.example.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@GetMapping("/showRegPage")
	public String showRePage(Model model) {
		
		Employee emp = new Employee();
		model.addAttribute("emp", emp);
		return "register";
	}
	
	@GetMapping("/registerEmp")
	public String registerData(@ModelAttribute Employee emp) {
		
		System.out.println(emp);
		
		
		return "success";
	}

	@GetMapping("/home")
	public ModelAndView home(Model model) {
		model.addAttribute("city", "Chennai");
		model.addAttribute("country","India");
		model.addAttribute("name","anil");
		Employee emp = new Employee();
		Employee e1 = new Employee(9001,"Anil","Finance");
		Employee e2 = new Employee(9002,"Balu","Marketing");
		Employee e3 = new Employee(9003,"Krish","HR");
		Employee e4 = new Employee(9004,"John","Quality");
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);employees.add(e2);employees.add(e3);employees.add(e4);
		model.addAttribute("employees", employees);
		model.addAttribute("employee",emp);
		return new ModelAndView("home");
		
	}

	@GetMapping("/login")
	public ModelAndView login(Model model) {
		//model.addAttribute("name","kumar");)
		return new ModelAndView("login","name","kumar");
	}

	@GetMapping("/validate")
	public ModelAndView validate(@RequestParam String uid, 
			@RequestParam String pwd, Model model) {

		if (uid.equals("admin") && pwd.equals("12345")) {

			return new ModelAndView("success","username",uid);
		}
		else {
			return new ModelAndView("fail","username",uid);
		}
	}

}
