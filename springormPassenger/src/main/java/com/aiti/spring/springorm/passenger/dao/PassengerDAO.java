package com.aiti.spring.springorm.passenger.dao;

import java.util.List;

import com.aiti.spring.springorm.passenger.entity.Passenger;

public interface PassengerDAO {
	
	int create (Passenger passenger);
	void delete(Passenger passenger);
	void update(Passenger passenger);

	List<Passenger> read(Passenger passenger);
	List<Passenger>findAll();
	Passenger find(int id);
}
