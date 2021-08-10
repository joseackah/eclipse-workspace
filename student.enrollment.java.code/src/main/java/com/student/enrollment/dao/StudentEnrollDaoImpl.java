package com.student.enrollment.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.student.enrollment.entities.StudentEnroll;

@Repository
public class StudentEnrollDaoImpl implements StudentEnrollDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void enrollStudent(StudentEnroll enroll) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(enroll);

	}

	@Override
	public StudentEnroll updateStudent(StudentEnroll enroll) {
		Session session = sessionFactory.getCurrentSession();
		session.update(enroll);
		
		return enroll;
	}

	@Override
	public void removeStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		StudentEnroll enroll = session.get(StudentEnroll.class, id);
		session.delete(enroll);
		

	}

	@Override
	@Transactional
	public List<StudentEnroll> allStudent() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<StudentEnroll> cq = builder.createQuery(StudentEnroll.class);
		cq.from(StudentEnroll.class);
		List<StudentEnroll> studentEnroll = session.createQuery(cq).getResultList();
		
		return studentEnroll;
	}

}
