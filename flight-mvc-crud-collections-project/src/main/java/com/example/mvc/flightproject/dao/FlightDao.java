package com.example.mvc.flightproject.dao;

import java.util.List;

import com.example.mvc.flightproject.model.Flight;

public interface FlightDao {
	
	public int addFlight(Flight flight);
	public List<Flight> getAllFlights();
	public int deleteFlight(int flightId);

}
