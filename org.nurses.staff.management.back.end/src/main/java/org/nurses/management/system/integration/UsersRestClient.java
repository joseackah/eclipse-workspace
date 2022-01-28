package org.nurses.management.system.integration;

import org.nurses.management.system.integration.dto.Users;

public interface UsersRestClient {
	
	
	
	public void saveUsers(Users users);
	public void updateUsers( Users users);
	public void deleteUsers(Integer id);
	public void deleteAllUsers( Users users);
	public Users [] getAllUsers( Users users);
	public Users  findUser(Integer id);

}
