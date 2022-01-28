package com.school.system.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.system.front.end.integration.TeachersRestClient;
import com.school.system.front.end.integration.dto.Teachers;

@Component
public class TeachersRestClientImpl implements TeachersRestClient {
	
	RestTemplate rest= new RestTemplate();
	Teachers teacher = new Teachers();

	@Override
	public void saveTeacher(Teachers teachers) {
		teacher.setfName(teachers.getfName());
		teacher.setlName(teachers.getlName());
		teacher.setDateOfBirth(teachers.getDateOfBirth());
		teacher.setQualification(teachers.getQualification());
		teacher.setEmail(teachers.getEmail());
		teacher.setPhoneNumber(teachers.getPhoneNumber());
		teacher.setGender(teachers.getGender());
		teacher.setAddress(teachers.getAddress());
		teacher.setSalary(teachers.getSalary());
		teacher.setAppointmentDate(teachers.getAppointmentDate());
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
	
	
	/* counting teachers methods */

	@Override
	public String countTeachers() {
		
		return rest.getForObject("http://localhost:9095/teachers/countTeachers/", String.class);
	}

	@Override
	public String countTeacherMale() {
		
		return rest.getForObject("http://localhost:9095/teachers/countTeacherMale/", String.class);
	}

	@Override
	public String countTeacherFemale() {
		
		return rest.getForObject("http://localhost:9095/teachers/countTeacherFemale/", String.class);
	}

	@Override
	public Teachers findTeacher(Integer id) {
		RestTemplate rests = new RestTemplate();
		Teachers teacher = rests.getForObject("http://localhost:9095/teachers/find/"+id, Teachers.class);
		return teacher;
	}

}
