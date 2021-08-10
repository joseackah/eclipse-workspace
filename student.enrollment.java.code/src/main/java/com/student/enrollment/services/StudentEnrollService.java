package com.student.enrollment.services;

import java.util.List;

import com.student.enrollment.entities.StudentEnroll;

public interface StudentEnrollService {
	
	void enrollStudent(StudentEnroll enroll);
	public StudentEnroll updateStudent(StudentEnroll enroll);
	void removeStudent(int id);
	List<StudentEnroll> allStudent();

}
