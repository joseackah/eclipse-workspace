package com.school.system.front.end.integration;

import com.school.system.front.end.integration.dto.Teachers;

public interface TeachersRestClient {
	
	public void saveTeacher(Teachers teachers);
	public void updateTeacher(Teachers teachers);
	public void deleteTeacher(Integer id);
	public void deleteAll(Teachers teachers);
	public Teachers[] getAllTeachers(Teachers teachers);
	public Teachers findById(Integer id);

}
