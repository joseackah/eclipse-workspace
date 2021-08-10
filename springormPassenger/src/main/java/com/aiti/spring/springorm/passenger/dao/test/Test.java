package com.aiti.spring.springorm.passenger.dao.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aiti.spring.springorm.passenger.dao.PassengerDAO;
import com.aiti.spring.springorm.passenger.entity.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aiti/spring/springorm/passenger/dao/test/config.xml");
		
		PassengerDAO passdao = (PassengerDAO) ctx.getBean("passengerdao");
		Passenger passenger = new Passenger();
		/*passenger.setId(6);
		passenger.setFirstName("Amarh");
		passenger.setLastName("David");
		passenger.setpNumber("0241257894");
		passenger.sethTown("Sunyani");
		passdao.create(passenger);
		
		passenger.setId(7);
		passenger.setFirstName("Enoch");
		passenger.setLastName("Adam");
		passenger.setpNumber("0256987415");
		passenger.sethTown("Takoradi");
		passdao.create(passenger);*/
		
		/*passenger.setId(8);
		passenger.setFirstName("Solomon");
		passenger.setLastName("Nyameke");
		passenger.setpNumber("0270123654");
		passenger.sethTown("Bolgatanga");*/
		//passdao.create(passenger);
		
		/*passenger.setId(11);
		passenger.setFirstName("Haggai");
		passenger.setLastName("Kofi");
		passenger.setpNumber("0547896541");
		passenger.sethTown("Cape Coast");
		//passdao.delete(passenger);*/
		
		//product.setId(3);
		//product.setName("SAMSUNG TV");
		//product.setDesc("EXCELLENT");
		//product.setPrice(9000d);
		//passdao.create(passenger);
		//passdao.update(passenger);
		//passdao.delete(passenger);
		//List<Product> read = pdao.read(product);
		//System.out.println(read);
		
		//Passenger find = passdao.find(2);
		
		//System.out.println(find);
		
		//List<Passenger> findAll = passdao.findAll();
		//System.out.println(findAll);
	}
}
