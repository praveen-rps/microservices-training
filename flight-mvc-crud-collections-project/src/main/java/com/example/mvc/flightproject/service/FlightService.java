package com.example.mvc.flightproject.service;

import java.util.List;

import com.example.mvc.flightproject.model.Flight;

public interface FlightService {
	
	public int addFlight(Flight flight);
	public List<Flight> getAllFlights();
	public int deleteFlight(int flightId);

}
