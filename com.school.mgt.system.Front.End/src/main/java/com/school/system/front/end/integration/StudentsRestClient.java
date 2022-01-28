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
	
	public String count();
	public String countMale();
	public String countFemale();
	
/* year 1 counting methods */
	
	
	public String countYear1();
	
	
	public String countYear1Male();
	
	
	public String countYear1Female();
	
	
	
	/* year 2 counting methods */
	
	
	public String countYear2();
	
	
	public String countYear2Male();
	
	
	public String countYear2Female();
	
	
	
	/* year 3 counting methods */
	
	
	public String countYear3();
	
	
	public String countYear3Male();
	
	
	public String countYear3Female();
	

}
