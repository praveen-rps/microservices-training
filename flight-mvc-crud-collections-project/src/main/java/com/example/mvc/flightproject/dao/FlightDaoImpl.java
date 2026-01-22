package com.example.mvc.flightproject.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.example.mvc.flightproject.model.Flight;

@Component("collection")
public class FlightDaoImpl implements FlightDao {
	
	List<Flight> flights ;
	
	public FlightDaoImpl() {
		flights = new ArrayList<>();
	}
	@Override
	public int addFlight(Flight flight) {
		// TODO Auto-generated method stub
		int flag=0;
		
		if(flights.add(flight)) 
			flag=1;
		
		return flag;
	
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return flights;
	}
	@Override
	public int deleteFlight(int flightId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
