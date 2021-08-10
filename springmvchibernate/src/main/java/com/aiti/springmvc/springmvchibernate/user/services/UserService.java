package com.aiti.springmvc.springmvchibernate.user.services;

import java.util.List;

import com.aiti.springmvc.springmvchibernate.user.entity.User;

public interface UserService {

	void save(User user);

	List<User> getUser();

	public User updateUser(int theId);
	
	public void deleteUser(int theId);
	
	public User editUser(int id);
	
	void update(User user);

}
