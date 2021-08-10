package com.school.system.front.end.integration;

import com.school.system.front.end.integration.dto.Students;

public interface StudentsRestClient {
	
	public void saveStudent(Students students);
	public void updateStudent(Students students);
	public void deleteStudent(Integer id);
	public void deleteAll(Students students);
	public Students[] getAllStudents(Students students);
	public Students find(Integer id);
	public String lookLastId(String student_id);
	public Students findLastId(Students students);
	

}
