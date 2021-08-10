package com.school.front.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.front.integration.TeachersRestClient;
import com.school.front.integration.dto.Teachers;

@Component
public class TeachersRestClientImpl implements TeachersRestClient {
	
	RestTemplate rest= new RestTemplate();
	Teachers teacher = new Teachers();

	@Override
	public void saveTeacher(Teachers teachers) {
		teacher.setFirstName(teachers.getFirstName());
		teacher.setLastName(teachers.getLastName());
		teacher.setQualification(teachers.getQualification());
		teacher.setSalary(teachers.getSalary());
		teacher.setStartDate(teachers.getStartDate());
		rest.postForObject("http://localhost:9095/teachers/saveTeacher", teacher, Teachers.class);

	}

	@Override
	public void updateTeacher(Teachers teachers) {
		Map<String, Integer> updateTeacher = new HashMap<String, Integer>();
		updateTeacher.put("id", teachers.getTeacherId());
		rest.put("http://localhost:9095/teachers/updateTeacher", teachers, updateTeacher);

	}

	@Override
	public void deleteTeacher(Integer id) {
		rest.delete("http://localhost:9095/teachers/deleteTeacher/" + id);

	}

	@Override
	public void deleteAll(Teachers teachers) {
		rest.delete("http://localhost:9095/teachers/deleteAllTeachers");

	}

	@Override
	public Teachers[] getAllTeachers(Teachers teachers) {
		Teachers[] teacher = rest.getForObject("http://localhost:9095/teachers/getTeacher", Teachers[].class);
		return teacher;
		
	}

	@Override
	public Teachers findById(Integer id) {
		Teachers teacher = rest.getForObject("http://localhost:9095/teachers/findById/" + id, Teachers.class);
		return teacher;
	}

}
