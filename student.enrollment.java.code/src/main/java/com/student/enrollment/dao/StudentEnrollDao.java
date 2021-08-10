package com.student.enrollment.dao;

import java.util.List;

import com.student.enrollment.entities.StudentEnroll;

public interface StudentEnrollDao {
	
	void enrollStudent(StudentEnroll enroll);
	public StudentEnroll updateStudent(StudentEnroll enroll);
	void removeStudent(int id);
	List<StudentEnroll> allStudent();

}
