package com.learnSpring.Spring.springJDBC.passenger.dao;

import com.learnSpring.Passenger.entity.Passenger;

public interface PassengerDAO {
	int create(Passenger passenger);
	
	int update(Passenger passenger);
	
	int delete(int id);
	
	Passenger read(int id);
	

}
