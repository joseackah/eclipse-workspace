package org.aiti.spring.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aiti.spring.data.dal.entities.UserDetails;
import com.aiti.spring.data.dal.repos.UserDetailsRepository;

@SpringBootTest
class SpringdatamappingApplicationTests {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;

	@Test
	public void testUserDetails() {
		UserDetails user = new UserDetails();
		user.setUserName("firstUser");
		userDetailsRepository.save(user);

	}

}
