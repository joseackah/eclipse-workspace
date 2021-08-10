package com.student.enrollment.services;

import java.util.List;

import com.student.enrollment.entities.StudentGrades;

public interface StudentGradesService {
	
	void saveGrade(StudentGrades grades);
	public StudentGrades updateGrade(StudentGrades grades);
	void deleteGrade(int id);
	List<StudentGrades> showGrades();
	

}
