package com.example.mvc.flightproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.mvc.flightproject.dao.FlightDao;
import com.example.mvc.flightproject.model.Flight;


@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	@Qualifier("mysql")
	FlightDao flightDao;

	@Override
	public int addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightDao.addFlight(flight);
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return flightDao.getAllFlights();
	}

	@Override
	public int deleteFlight(int flightId) {
		// TODO Auto-generated method stub
		return flightDao.deleteFlight(flightId);
	}

}
