package com.ecommerce.front.END.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.front.END.integration.UsersTableRestClient;
import com.ecommerce.front.END.integration.dto.UsersTable;

@Component
public class UsersTableRestClientImpl implements UsersTableRestClient {
	
	RestTemplate rest = new RestTemplate();
	UsersTable user = new UsersTable();

	@Override
	public void saveUsers(UsersTable users) {
		UsersTable userss = new UsersTable();
		userss.setFirstName(users.getFirstName());
		userss.setLastName(users.getLastName());
		userss.setUserName(users.getUserName());
		userss.setEmail(users.getEmail());
		rest.postForObject("http://localhost:8082/users/save", userss, UsersTable.class);

	}

	@Override
	public void updateUser(UsersTable users) {
		Map<String, Integer> update = new HashMap<String, Integer>();
		update.put("id", users.getId());
		rest.put("http://localhost:8082/users/update",users, update);

	}

	@Override
	public void deleteUser(Integer id) {
		rest.delete("http://localhost:8082/users/delete/"+id);

	}

	@Override
	public UsersTable[] getAll(UsersTable users) {
		UsersTable[] userT = rest.getForObject("http://localhost:8082/users/getAll", UsersTable[].class);
		return userT;
	}

	@Override
	public UsersTable getById(int id) {
		UsersTable usersT = rest.getForObject("http://localhost:8082/users/find/"+id, UsersTable.class);
		return usersT;
	}

}
