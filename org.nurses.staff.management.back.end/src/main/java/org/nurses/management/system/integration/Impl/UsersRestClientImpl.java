package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.nurses.management.system.integration.UsersRestClient;
import org.nurses.management.system.integration.dto.Users;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class UsersRestClientImpl implements UsersRestClient {
	
	
	Users user = new Users();
	RestTemplate rest = new RestTemplate();

	@Override
	public void saveUsers(Users users) {
		user.setId(users.getId());
		user.setUserId(users.getUserId());
		user.setName(users.getName());
		user.setWard_name(users.getWard_name());
		user.setUserPassword(users.getUserPassword());
		user.setImage(users.getImage());
		user.setUserType(users.getUserType());
		user.setDateCreated(users.getDateCreated());
		user.setCreatedBy(users.getCreatedBy());
	
		rest.postForObject("http://localhost:8084/users/saveUsers", users, Users.class);

	}

	@Override
	public void updateUsers(Users users) {
		Map<String, Integer> updateUser = new HashMap<String, Integer>();
		updateUser.put("id", users.getId());
		rest.put("http://localhost:8084/users/updateUsers", users, updateUser);
		

	}

	@Override
	public void deleteUsers(Integer id) {
		rest.delete("http://localhost:8084/users/deleteUser/"+id);

	}

	@Override
	public void deleteAllUsers(Users users) {
		// TODO Auto-generated method stub

	}

	@Override
	public Users[] getAllUsers(Users users) {
		Users [] getUser = rest.getForObject("http://localhost:8084/users/getAllUsers", Users[].class);
		return getUser;
	}

	@Override
	public Users findUser(Integer id) {
		Users user = rest.getForObject("http://localhost:8084/users/findById/"+id, Users.class);
		return user;
	}

}
