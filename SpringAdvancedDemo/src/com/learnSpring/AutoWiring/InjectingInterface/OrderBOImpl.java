package com.learnSpring.AutoWiring.InjectingInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("BO")
public class OrderBOImpl implements OrderBO {
	
	@Autowired
	private OrderDAO dao;
	
	@Override
	public void placeOrder() {
		
		
		
		System.out.println("Inside order BO");
		
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}
	

}
