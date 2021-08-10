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
		UserDetails user1 =new UserDetails();
		
		
		user.setUserName("James");
		
		user1.setUserName("Daniel");
		
		
		Vehicle vehicle = new Vehicle();
		Vehicle vehicle1 = new Vehicle();
		
		
		vehicle.setVehicleName("Toyota");
		vehicle1.setVehicleName("Jeep");
		
		vehicle.getUserList().add(user);
		vehicle1.getUserList().add(user);
		vehicle.getUserList().add(user1);
		vehicle1.getUserList().add(user1);
		
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle1);
		
		user1.getVehicle().add(vehicle);
		user1.getVehicle().add(vehicle1);
		
		
		userDetailsRepository.save(user);
		userDetailsRepository.save(user1);
		//vehicleRepository.save(vehicle);
		//vehicleRepository.save(vehicle1);
		
	}
	
	

}
