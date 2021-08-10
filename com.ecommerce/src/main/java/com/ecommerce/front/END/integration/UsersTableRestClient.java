package com.ecommerce.front.END.integration;

import com.ecommerce.front.END.integration.dto.UsersTable;

public interface UsersTableRestClient {
	
	public void saveUsers(UsersTable users);
	public void updateUser(UsersTable users);
	public void deleteUser(Integer id);
	public UsersTable[] getAll(UsersTable users);
	public UsersTable getById(int id);

}
