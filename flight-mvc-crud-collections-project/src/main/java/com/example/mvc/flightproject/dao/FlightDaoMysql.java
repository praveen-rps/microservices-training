package com.example.mvc.flightproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.mvc.flightproject.model.Flight;
import com.example.mvc.flightproject.model.FlightRowMapper;

@Repository("mysql")
public class FlightDaoMysql implements FlightDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addFlight(Flight flight) {
		// TODO Auto-generated method stub
		String query = "insert into flights values(?,?,?,?)";
		return jdbcTemplate.update(query, flight.getFlightId(), flight.getProvider(), flight.getSource(),
				flight.getDestination());
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		String query = "select * from flights";
		return jdbcTemplate.query(query, new FlightRowMapper());
	}

	@Override
	public int deleteFlight(int flightId) {
		// TODO Auto-generated method stub
		String query = "delete from flights where flightId=?";
		return jdbcTemplate.update(query, flightId);
	}

}