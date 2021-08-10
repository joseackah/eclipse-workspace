package com.school.system.front.end.integration;

import com.school.system.front.end.integration.dto.TeacherAddress;

public interface TeacherAddressRestClient {
	
	public void saveTeacherAddress(TeacherAddress teacherAddress);
	public void updateTeacherAddress(TeacherAddress teacherAddress);
	public void deleteTeacherAddress(Integer id);
	public void deleteAll(TeacherAddress teacherAddress);
	public TeacherAddress[] getAllTeacherAddress(TeacherAddress teacherAddress);
	public TeacherAddress findById(Integer id);

}
