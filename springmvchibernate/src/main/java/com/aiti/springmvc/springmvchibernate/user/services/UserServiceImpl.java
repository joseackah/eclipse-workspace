package com.aiti.springmvc.springmvchibernate.user.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiti.springmvc.springmvchibernate.user.dao.UserDao;
import com.aiti.springmvc.springmvchibernate.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public void save(User user) {
		dao.saveUser(user);

		
	}

	@Override
	public List<User> getUser() {

		return dao.findUser();
	}

	@Override
	@Transactional
	public User updateUser(int theId) {

		return dao.updateUser(theId);

	}

	@Override
	@Transactional
	public void deleteUser(int theId) {
		dao.deleteUser(theId);
		
	}

	@Override
	@Transactional
	public User editUser(int id) {

		return dao.editUser(id);
		//return null;
	}

	@Override
	@Transactional
	public void update(User user) {
		dao.update(user);
		
	}

}
