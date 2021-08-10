package com.aiti.springmvc.springmvchibernate.user.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aiti.springmvc.springmvchibernate.user.dao.UserDao;
import com.aiti.springmvc.springmvchibernate.user.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void saveUser(User user) {
		hibernateTemplate.saveOrUpdate(user);
		// return result;
	}

	@Override
	public List<User> findUser() {

		Session session = hibernateTemplate.getSessionFactory().openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<User> cq = builder.createQuery(User.class);
		cq.from(User.class);
		List<User> users = session.createQuery(cq).getResultList();
		return users;

	}

	@Override
	public User updateUser(int theId) {
		User user = hibernateTemplate.get(User.class, theId);

		return user;
	}

	@Override
	public void deleteUser(int theId) {
		User user = hibernateTemplate.get(User.class, theId);
		hibernateTemplate.delete(user);
		
	}

	@Override
	public User editUser(int id) {
		User users = hibernateTemplate.get(User.class, id);
		return users;
	}

	@Override
	public void update(User user) {
		hibernateTemplate.saveOrUpdate(user);
		
	}

}
