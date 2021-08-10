package com.aiti.spring.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aiti.spring.data.dal.entities.UserDetails;
import com.aiti.spring.data.dal.entities.Vehicle;
import com.aiti.spring.data.dal.repos.UserDetailsRepository;
import com.aiti.spring.data.dal.repos.VehicleRepository;

@SpringBootTest
class SpringdatamappinggApplicationTests {
	
	@Autowired
	UserDetailsRepository userDetailsRepository; 
	
	@Autowired
	VehicleRepository vehicleRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testUserDetails() {
		
		UserDetails user = new UserDetails();
		user.setUserName("solomon");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Toyota");
		user.setVehicle(vehicle);
		vehicleRepository.save(vehicle);
		userDetailsRepository.save(user);
	}
	
	

}
