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
		user.setUserName("James");

		Vehicle vehicle = new Vehicle();
		Vehicle vehicle1 = new Vehicle();

		vehicle.setVehicleName("Toyota");
		vehicle1.setVehicleName("Jeep");

		vehicle.setUser(user);
		vehicle1.setUser(user);

		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle1);

		userDetailsRepository.save(user);
		// vehicleRepository.save(vehicle);
		// vehicleRepository.save(vehicle1);

	}

}
