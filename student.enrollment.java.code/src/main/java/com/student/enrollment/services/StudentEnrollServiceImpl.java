package com.student.enrollment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.enrollment.dao.StudentEnrollDao;
import com.student.enrollment.entities.StudentEnroll;

@Service
public class StudentEnrollServiceImpl implements StudentEnrollService {
	
	@Autowired
	private StudentEnrollDao enrollDao;

	public StudentEnrollDao getEnrollDao() {
		return enrollDao;
	}

	public void setEnrollDao(StudentEnrollDao enrollDao) {
		this.enrollDao = enrollDao;
	}

	@Override
	@Transactional
	public void enrollStudent(StudentEnroll enroll) {
		enrollDao.enrollStudent(enroll);

	}

	@Override
	@Transactional
	public StudentEnroll updateStudent(StudentEnroll enroll) {
		
		return enrollDao.updateStudent(enroll);
	}

	@Override
	@Transactional
	public void removeStudent(int id) {
		enrollDao.removeStudent(id);

	}

	@Override
	@Transactional
	public List<StudentEnroll> allStudent() {
		
		return enrollDao.allStudent();
	}

}
