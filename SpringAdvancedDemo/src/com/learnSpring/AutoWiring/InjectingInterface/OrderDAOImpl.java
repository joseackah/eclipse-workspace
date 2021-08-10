package com.learnSpring.AutoWiring.InjectingInterface;

import org.springframework.stereotype.Component;

@Component("DAO")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
				
		System.out.println("Inside order DAO CreateOrder()");

	}

}
