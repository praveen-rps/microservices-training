package com.example.mvc.flightproject.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jspecify.annotations.Nullable;
import org.springframework.jdbc.core.RowMapper;

public class FlightRowMapper implements RowMapper<Flight> {

	@Override
	public @Nullable Flight mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
	}

	

}
