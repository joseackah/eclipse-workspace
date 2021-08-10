package com.learnSpring.Spring.springJDBC.passenger.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.learnSpring.Passenger.entity.Passenger;
import com.learnSpring.Spring.springJDBC.passenger.dao.PassengerDAO;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/learnSpring/Spring/springJDBC/passenger/test/config.xml");
		
		PassengerDAO edao = (PassengerDAO) ctx.getBean("pass");
		
		/*Passenger passenger = new Passenger();
		
		passenger.setFirstName("Joshua");
		passenger.setLastName("kofi");
		passenger.setPhoneNumber("024587684");
		passenger.setHomeTown("Ho");
		passenger.setId(5);*/
		//int result = edao.create(passenger);
		
		//int result = edao.update(passenger);
		//int result = edao.delete(6);
		
		Passenger passenger = edao.read(2);
		
		
		
		System.out.println("Passenger record: " + passenger);
		//System.out.println(result1 + " record inserted successfully");
		//System.out.println(result2 + " record inserted successfully");
		//System.out.println(result3 + " record inserted successfully");

	}

}
