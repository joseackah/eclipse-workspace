package com.aiti.springmvc.user.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aiti.springmvc.user.dao.UserDao;
import com.aiti.springmvc.user.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		// return result;
	}

	@Override
	@Transactional
	public List<User> findUser() {

		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<User> cq = builder.createQuery(User.class);
		cq.from(User.class);
		List<User> users = session.createQuery(cq).getResultList();
		return users;

	}

	@Override
	public User updateUser(int theId) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, theId);

		return user;
	}

	@Override
	public void deleteUser(int theId) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, theId);
		session.delete(user);

	}

	@Override
	public User editUser(int id) {
		Session session = sessionFactory.getCurrentSession();
		User users = session.get(User.class, id);
		return users;
	}

	@Override
	public void update(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);

	}

}
