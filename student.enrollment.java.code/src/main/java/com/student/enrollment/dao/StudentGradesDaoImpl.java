package com.student.enrollment.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.student.enrollment.entities.StudentGrades;

@Repository
public class StudentGradesDaoImpl implements StudentGradesDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveGrade(StudentGrades grades) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(grades);

	}

	@Override
	public StudentGrades updateGrade(StudentGrades grades) {
	Session session = sessionFactory.getCurrentSession();
	session.update(grades);
		return grades;
	}

	@Override
	public void deleteGrade(int id) {
		Session session = sessionFactory.getCurrentSession();
		StudentGrades grades = session.get(StudentGrades.class, id);
		session.delete(grades);

	}

	@Override
	@Transactional
	public List<StudentGrades> showGrades() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<StudentGrades> cq = builder.createQuery(StudentGrades.class);
		cq.from(StudentGrades.class);
		List<StudentGrades> studentGrades = session.createQuery(cq).getResultList();
		return studentGrades;
	}

}
