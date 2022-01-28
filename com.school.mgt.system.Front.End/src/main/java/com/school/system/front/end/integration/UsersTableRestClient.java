package com.school.system.front.end.integration;

import com.school.system.front.end.integration.dto.UsersTable;

public interface UsersTableRestClient {
	

	public void saveUser(UsersTable users);
	
	
	public void deleteUser(Integer id);
	
	
	public  UsersTable[] getUser( UsersTable users);

	public void updateUser( UsersTable users);

}
