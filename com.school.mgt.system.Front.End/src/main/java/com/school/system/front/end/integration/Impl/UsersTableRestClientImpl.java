package com.school.system.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.system.front.end.integration.UsersTableRestClient;
import com.school.system.front.end.integration.dto.UsersTable;

@Component
public class UsersTableRestClientImpl implements UsersTableRestClient {
	
	
	RestTemplate rest = new RestTemplate();
	UsersTable  user = new UsersTable();
	
	

	@Override
	public void saveUser(UsersTable users) {
		user.setId(users.getId());
		user.setFirstName(users.getFirstName());
		user.setLastName(users.getLastName());
		user.setUserName(users.getUserName());
		user.setEmail(users.getEmail());
		user.setUserType(users.getUserType());
		rest.postForObject("http://localhost:9095/users/save", user, UsersTable.class);
	}

	@Override
	public void deleteUser(Integer id) {
		rest.delete("http://localhost:9095/users/delete"+id);

	}

	@Override
	public UsersTable[] getUser(UsersTable users) {
		UsersTable[] user = rest.getForObject("http://localhost:9095/users/getAll", UsersTable[].class);
		return user;
	}

	@Override
	public void updateUser(UsersTable users) {
		Map<String, Integer> updateUser = new HashMap<String, Integer>();
		updateUser.put("id", users.getId());
		rest.put("http:localhost:9095/users/update", users, updateUser);
	}

}
