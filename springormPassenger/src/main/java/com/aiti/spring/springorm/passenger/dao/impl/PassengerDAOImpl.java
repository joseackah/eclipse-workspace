package com.aiti.spring.springorm.passenger.dao.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.aiti.spring.springorm.passenger.dao.PassengerDAO;
import com.aiti.spring.springorm.passenger.entity.Passenger;

@Component("passengerdao")
public class PassengerDAOImpl implements PassengerDAO {

	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Passenger passenger) {
		Integer result = (Integer) hibernateTemplate.save(passenger);
		
		return result;
	}

	@Override
	@Transactional
	public void delete(Passenger passenger) {
		hibernateTemplate.delete(passenger);
		
	}
	
	
	@Override
	@Transactional
	public void update(Passenger passenger) {
	hibernateTemplate.update(passenger);
		
		
	}

	

	@Override
	@Transactional
	public List<Passenger> read(Passenger passenger) {
		
		List<Passenger> result = hibernateTemplate.loadAll(Passenger.class);
		return result;
	
	}

	

	@Override
	public List<Passenger> findAll() {
		
		List<Passenger> passenger = hibernateTemplate.loadAll(Passenger.class);
		return passenger;
		
		
	}
	@Override
	public Passenger find(int id) {
		Passenger passenger = hibernateTemplate.get(Passenger.class, id);
		
		return passenger;
	}

	
}
