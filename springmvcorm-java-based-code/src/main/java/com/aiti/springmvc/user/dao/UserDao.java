package com.aiti.springmvc.user.dao;

import java.util.List;

import com.aiti.springmvc.user.entity.User;

public interface UserDao {
	void saveUser(User user);

	List<User> findUser();

	public User updateUser(int theId);
	
	public void deleteUser(int theId);
	
	public User editUser(int id);
	
	public void update(User user);

}
