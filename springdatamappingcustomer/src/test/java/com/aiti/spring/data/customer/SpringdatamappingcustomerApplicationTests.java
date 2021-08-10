package com.aiti.spring.data.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aiti.spring.data.customerAddress.dal.entities.Address;
import com.aiti.spring.data.customerAddress.dal.entities.CustomerDetails;
import com.aiti.spring.data.customerAddress.dal.repos.AddressRepository;
import com.aiti.spring.data.customerAddress.dal.repos.CustomerRepository;

@SpringBootTest
class SpringdatamappingcustomerApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AddressRepository addressRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCustomerAddress() {

		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setcName("Daniel");

		Address address = new Address();
		address.setTown("Jirapa");
		address.setCountry("Ghana");
		
		customerDetails.setAddress(address);

		addressRepository.save(address);
		customerRepository.save(customerDetails);

	}

}
