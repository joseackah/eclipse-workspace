package com.aiti.spring.boot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aiti.spring.boot.springboot.dao.Dao;

@Component
public class Service {
	
	
	Dao dao;
	
	@Autowired
	Service(Dao dao){
		this.dao=dao;
	}
	
	public void save() {
		dao.create();
	}

}
