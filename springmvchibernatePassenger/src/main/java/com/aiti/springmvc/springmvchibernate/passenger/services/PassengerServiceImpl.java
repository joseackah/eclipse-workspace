package com.aiti.springmvc.springmvchibernate.passenger.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiti.springmvc.springmvchibernate.passenger.dao.PassengerDao;
import com.aiti.springmvc.springmvchibernate.passenger.entity.Passenger;
import com.aiti.springmvc.springmvchibernate.passenger.services.PassengerService;

@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	private PassengerDao dao;

	public PassengerDao getDao() {
		return dao;
	}

	public void setDao(PassengerDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(Passenger user) {
		int result = dao.saveUser(user);
		
		return result;
	}

}
