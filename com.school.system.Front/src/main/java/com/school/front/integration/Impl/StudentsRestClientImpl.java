package com.school.front.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.front.integration.StudentsRestClient;
import com.school.front.integration.dto.Students;

@Component
public class StudentsRestClientImpl implements StudentsRestClient {
	
	RestTemplate rest= new RestTemplate();
	Students student = new Students();

	@Override
	public void saveStudent(Students students) {
		student.setFirstName(students.getFirstName());
		student.setLastName(students.getLastName());
		student.setSex(students.getSex());
		student.setAge(students.getAge());
		student.setClassLevel(students.getClassLevel());
		rest.postForObject("http://localhost:9095/students/saveStudent", student, Students.class);

	}

	@Override
	public void updateStudent(Students students) {
		Map<String, Integer> updateStudent = new HashMap<String, Integer>();
		updateStudent.put("id", students.getStudentId());
		rest.put("http://localhost:9095/students/updateStudent/{id}", students, updateStudent);

	}

	@Override
	public void deleteStudent(Integer id) {
		rest.delete("http://localhost:9095/students/deleteStudent/" + id);

	}

	@Override
	public void deleteAll(Students students) {
		rest.delete("http://localhost:9095/students/deleteAllStudent");

	}

	@Override
	public Students[] getAllStudents(Students students) {
		Students[] student = rest.getForObject("http://localhost:9095/students/getStudent", Students[].class);
		return student;
		
	}

	@Override
	public Students find(Integer id) {
		RestTemplate rests = new RestTemplate();
		Students student = rests.getForObject("http://localhost:9095/students/find/"+id, Students.class);
		return student;
	}

	@Override
	public String lookLastId(String student_id) {
		
		String look = String.valueOf(rest.getForObject("http://localhost:9095/students/look", Students.class));
		return look;
	}

	@Override
	public Students findLastId(Students students) {
		
		Students student =  rest.getForObject("http://localhost:9095/students/lastId/", Students.class);
		return student;
	}

	
}
