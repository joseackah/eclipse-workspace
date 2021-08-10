package com.school.front.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.front.integration.StudentAddressRestClient;
import com.school.front.integration.dto.StudentAddress;

@Component
public class StudentAddressRestClientImpl implements StudentAddressRestClient {
	
	RestTemplate rest= new RestTemplate();
	StudentAddress studentAddresses = new StudentAddress();

	@Override
	public void saveStudentAddress(StudentAddress studentAddress) {
		studentAddresses.setTown(studentAddress.getTown());
		studentAddresses.setCity(studentAddress.getCity());
		studentAddresses.setPostalCode(studentAddress.getPostalCode());
		studentAddresses.setResNumber(studentAddress.getResNumber());
		rest.postForObject("http://localhost:9095/studentAddress/saveStudentAddress", studentAddresses, StudentAddress.class);

	}

	@Override
	public void updateStudentAddress(StudentAddress studentAddress) {
		Map<String, Integer> updateStudentAddres = new HashMap<String, Integer>();
		updateStudentAddres.put("id", studentAddress.getStudentAddId());
		rest.put("http://localhost:9095/students/updateStudent", studentAddress, updateStudentAddres);

	}

	@Override
	public void deleteStudentAddress(Integer id) {
		rest.delete("http://localhost:9095/studentAddress/deleteStudentAddress/" + id);

	}

	@Override
	public void deleteAll(StudentAddress studentAddress) {
		rest.delete("http://localhost:9095/studentAddress/deleteAllStudentAddress");

	}

	@Override
	public StudentAddress[] getAllStudentAddress(StudentAddress studentAddress) {
		StudentAddress[] studentAddres = rest.getForObject("http://localhost:9095/studentAddress/getStudentAddress", StudentAddress[].class);
		return studentAddres;
		
	}

	@Override
	public StudentAddress findById(Integer id) {
		StudentAddress studentAddress = rest.getForObject("http://localhost:9095/studentAddress/findById/" + id, StudentAddress.class);
		return studentAddress;
	}

}
