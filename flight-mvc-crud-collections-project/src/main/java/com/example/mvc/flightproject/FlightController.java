package com.example.mvc.flightproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mvc.flightproject.model.Flight;
import com.example.mvc.flightproject.service.FlightService;

@Controller
public class FlightController {

	@Autowired
	FlightService flightService;
	
	@GetMapping("/delete")
	public String showDelPage() {
		return "delpage";
	}
	
	@GetMapping("/deleteFlight")
	public String deleteFlight(@RequestParam Integer flightId) {
		int isDeleted = flightService.deleteFlight(flightId);
		if(isDeleted >1) {
			return "home";
		}
		return null;
	}
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/display")
	public String displayPage(Model model) {
		List<Flight> flights = flightService.getAllFlights();
		model.addAttribute("flights", flights);
		return "display";
	}

	@GetMapping("/add")
	public String showAddPage(Model model) {
		Flight flight = new Flight();
		model.addAttribute("flight", flight);
		return "addFlight";
	}
	@GetMapping("/addFlightData")
	public String addFlight(@ModelAttribute Flight flight, Model model) {
		int isAdded = flightService.addFlight(flight);
		if (isAdded == 1) {

			model.addAttribute("flights", flightService.getAllFlights());
			return "/display";
		} else
			return "fail";
	}
}
