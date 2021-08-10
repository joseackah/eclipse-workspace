package com.aiti.spring.data.customer.address;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aiti.spring.data.customer.address.dal.entities.Address;
import com.aiti.spring.data.customer.address.dal.entities.CustomerDetails;
import com.aiti.spring.data.customer.address.dal.repos.AddressRepository;
import com.aiti.spring.data.customer.address.dal.repos.CustomerRepository;

@SpringBootTest
class SpringdatamappingCustomerAddressApplicationTests {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCustomer() {
		
		CustomerDetails customerDetails = new CustomerDetails();
		CustomerDetails customerDetails1 = new CustomerDetails();
		CustomerDetails customerDetails2 = new CustomerDetails();
		CustomerDetails customerDetails3 = new CustomerDetails();
		CustomerDetails customerDetails4 = new CustomerDetails();
		
		
		
		customerDetails.setcName("Daniel");
		customerDetails1.setcName("Joshua");
		customerDetails2.setcName("Moses");
		customerDetails3.setcName("David");
		customerDetails4.setcName("Joel");
		
		Address address = new Address();
		Address address1 = new Address();
		Address address2 = new Address();
		Address address3 = new Address();
		Address address4 = new Address();
		
		address.setTown("Jirapa");
		address.setCountry("Ghana");
		
		address1.setTown("Wa");
		address1.setCountry("Ghana");
		
		address2.setTown("Bolga");
		address2.setCountry("Ghana");
		
		address3.setTown("Tamale");
		address3.setCountry("Ghana");
		
		address4.setTown("Kumasi");
		address4.setCountry("Ghana");
		
		
		
		customerDetails.setAddress(address);
		customerDetails1.setAddress(address1);
		customerDetails2.setAddress(address2);
		customerDetails3.setAddress(address3);
		customerDetails4.setAddress(address4);
		
		addressRepository.save(address);
		addressRepository.save(address1);
		addressRepository.save(address2);
		addressRepository.save(address3);
		addressRepository.save(address4);
		
		customerRepository.save(customerDetails);
		customerRepository.save(customerDetails1);
		customerRepository.save(customerDetails2);
		customerRepository.save(customerDetails3);
		customerRepository.save(customerDetails4);
	}

}
