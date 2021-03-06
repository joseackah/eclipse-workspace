package com.learnSpring.Spring.springJDBC.passenger.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.learnSpring.Passenger.entity.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger>{

	

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Passenger passenger = new Passenger();
		passenger.setId(rs.getInt(1));
		passenger.setFirstName(rs.getString(2));
		passenger.setLastName(rs.getString(3));
		passenger.setPhoneNumber(rs.getString(4));
		passenger.setHomeTown(rs.getString(5));
		
		return passenger;
	}

}
