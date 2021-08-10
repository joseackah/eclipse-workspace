package com.school.front.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.front.integration.TeacherAddressRestClient;
import com.school.front.integration.dto.TeacherAddress;

@Component
public class TeacherAddressRestClientImpl implements TeacherAddressRestClient {
	
	RestTemplate rest= new RestTemplate();
	TeacherAddress teacherAddresses = new TeacherAddress();



	@Override
	public void saveTeacherAddress(TeacherAddress teacherAddress) {
		teacherAddresses.setTown(teacherAddress.getTown());
		teacherAddresses.setCity(teacherAddress.getCity());
		teacherAddresses.setPostalCode(teacherAddress.getPostalCode());
		teacherAddresses.setResNumber(teacherAddress.getResNumber());
		rest.postForObject("http://localhost:9095/teacherAddress/saveTeacherAddress", teacherAddresses, TeacherAddress.class);

		
	}

	@Override
	public void updateTeacherAddress(TeacherAddress teacherAddress) {
		Map<String, Integer> updateTeacherAddres = new HashMap<String, Integer>();
		updateTeacherAddres.put("id", teacherAddress.getTeacherAddressId());
		rest.put("http://localhost:9095/teacherAddress/updateTeacherAddress", teacherAddress, updateTeacherAddres);

		
	}

	@Override
	public void deleteTeacherAddress(Integer id) {
		rest.delete("http://localhost:9095/teacherAddress/deleteTeacherAddress/" + id);
		
	}

	@Override
	public void deleteAll(TeacherAddress teacherAddress) {
		rest.delete("http://localhost:9095/teacherAddress/deleteAllTeacherAddress");
		
	}

	@Override
	public TeacherAddress[] getAllTeacherAddress(TeacherAddress teacherAddress) {
		TeacherAddress[] teacherAddres = rest.getForObject("http://localhost:9095/teacherAddress/getTeacherAddress", TeacherAddress[].class);
		return teacherAddres;
	}

	@Override
	public TeacherAddress findById(Integer id) {
		TeacherAddress teacherAddress = rest.getForObject("http://localhost:9095/teacherAddress/findById/" + id, TeacherAddress.class);
		return teacherAddress;
	}

}
