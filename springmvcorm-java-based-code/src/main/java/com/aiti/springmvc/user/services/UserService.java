package com.aiti.springmvc.user.services;

import java.util.List;

import com.aiti.springmvc.user.entity.User;

public interface UserService {

	void save(User user);

	List<User> getUser();

	public User updateUser(int theId);
	
	public void deleteUser(int theId);
	
	public User editUser(int id);
	
	void update(User user);

}
