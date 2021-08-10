package com.aiti.springmvc.springmvchibernate.passenger.dao.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aiti.springmvc.springmvchibernate.passenger.dao.PassengerDao;
import com.aiti.springmvc.springmvchibernate.passenger.entity.Passenger;


@Repository
public class PassengerDaoImpl implements PassengerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int saveUser(Passenger user) {
		int result = (int) hibernateTemplate.save(user);
		return result;
	}

}
