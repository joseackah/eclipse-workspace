package com.student.enrollment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.enrollment.dao.StudentGradesDao;
import com.student.enrollment.entities.StudentGrades;

@Service
public class StudentGradesServiceImpl implements StudentGradesService {
	
	@Autowired
	private StudentGradesDao gradesDao;

	public StudentGradesDao getGradesDao() {
		return gradesDao;
	}

	public void setGradesDao(StudentGradesDao gradesDao) {
		this.gradesDao = gradesDao;
	}

	@Override
	@Transactional
	public void saveGrade(StudentGrades grades) {
		gradesDao.saveGrade(grades);

	}

	@Override
	@Transactional
	public StudentGrades updateGrade(StudentGrades grades) {
		
		return  gradesDao.updateGrade(grades);
	}

	@Override
	@Transactional
	public void deleteGrade(int id) {
		gradesDao.deleteGrade(id);

	}

	@Override
	@Transactional
	public List<StudentGrades> showGrades() {
		
		return gradesDao.showGrades();
	}

}
