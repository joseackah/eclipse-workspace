package com.school.front.integration;

import com.school.front.integration.dto.StudentAddress;

public interface StudentAddressRestClient {
	
	public void saveStudentAddress(StudentAddress studentAddress);
	public void updateStudentAddress(StudentAddress studentAddress);
	public void deleteStudentAddress(Integer id);
	public void deleteAll(StudentAddress studentAddress);
	public StudentAddress[] getAllStudentAddress(StudentAddress studentAddress);
	public StudentAddress findById(Integer id);

}
