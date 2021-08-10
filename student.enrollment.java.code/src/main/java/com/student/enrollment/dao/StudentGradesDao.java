package com.student.enrollment.dao;

import java.util.List;

import com.student.enrollment.entities.StudentGrades;

public interface StudentGradesDao {
	
	void saveGrade(StudentGrades grades);
	public StudentGrades updateGrade(StudentGrades grades);
	void deleteGrade(int id);
	List<StudentGrades> showGrades();

}
