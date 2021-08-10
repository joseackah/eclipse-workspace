package com.learnSpring.Spring.springJDBC.passenger.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.learnSpring.Passenger.entity.Passenger;
import com.learnSpring.Spring.springJDBC.passenger.dao.PassengerDAO;
import com.learnSpring.Spring.springJDBC.passenger.dao.rowmapper.PassengerRowMapper;


@Component("pass")
public class PassengerDAOImpl implements PassengerDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	

	@Override
	public int create(Passenger passenger) {
		
		String sql = "insert into passenger values(?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName(), passenger.getPhoneNumber(), passenger.getHomeTown());
		
		return result;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int update(Passenger passenger) {
		
		String sql = "update passenger set firstName=?, lastName=?, phoneNumber=?, homeTown=? where id=?";
		int result = jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(),passenger.getPhoneNumber(), passenger.getHomeTown(), passenger.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from passenger where id = ?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}

	@Override
	public Passenger read(int id) {
		
		String sql = "select * from passenger where id=?";
		
		PassengerRowMapper rowmapper = new PassengerRowMapper();
		Passenger passenger = jdbcTemplate.queryForObject(sql, rowmapper, id);
		
		
		return passenger;
	}


}
