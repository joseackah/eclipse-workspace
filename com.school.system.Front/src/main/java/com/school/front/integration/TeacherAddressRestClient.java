package com.school.front.integration;

import com.school.front.integration.dto.TeacherAddress;

public interface TeacherAddressRestClient {
	
	public void saveTeacherAddress(TeacherAddress teacherAddress);
	public void updateTeacherAddress(TeacherAddress teacherAddress);
	public void deleteTeacherAddress(Integer id);
	public void deleteAll(TeacherAddress teacherAddress);
	public TeacherAddress[] getAllTeacherAddress(TeacherAddress teacherAddress);
	public TeacherAddress findById(Integer id);

}
