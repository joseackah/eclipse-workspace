package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.nurses.management.system.integration.Nurses_staff_RestClient;
import org.nurses.management.system.integration.dto.Leave;
import org.nurses.management.system.integration.dto.Nurses_staff;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class Nurses_staff_RestClientImpl implements Nurses_staff_RestClient {
	
	Nurses_staff nurses = new Nurses_staff();
	RestTemplate rest = new RestTemplate();

	@Override
	public void saveNursesStaff(Nurses_staff nursesStaff) {
		nurses.setId(nursesStaff.getId());
		nurses.setStaff_id(nursesStaff.getStaff_id());
		nurses.setName(nursesStaff.getName());
		nurses.setCategory(nursesStaff.getCategory());
		nurses.setDate_of_birth(nursesStaff.getDate_of_birth());
		nurses.setSex(nursesStaff.getSex());
		nurses.setAddress(nursesStaff.getAddress());
		nurses.setSsnit(nursesStaff.getSsnit());
		nurses.setAssumption_date(nursesStaff.getAssumption_date());
		nurses.setBasic_qualification(nursesStaff.getBasic_qualification());
		nurses.setAdditional_qualification(nursesStaff.getAdditional_qualification());
		nurses.setStatus(nursesStaff.getStatus());
		nurses.setGrade(nursesStaff.getGrade());
		rest.postForObject("http://localhost:8084/nurses/saveNurse", nursesStaff, Leave.class);
		
		
		
	}

	@Override
	public void updateNursesStaff(Nurses_staff nursesStaff) {
		Map<String, Integer> nurseStaffs = new HashMap<String, Integer>();
		nurseStaffs.put("id", nursesStaff.getId());
		rest.put("http://localhost:8084/nurses/updateNurse", nursesStaff, nurseStaffs);
		
	}

	@Override
	public void deleteNursesStaff(Integer id) {
		rest.delete("http://localhost:8084/nurses/deleteNurse/" + id);
		
	}

	@Override
	public void deleteAllNursesStaff(Nurses_staff nursesStaff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Nurses_staff[] getAllNursesStaff(Nurses_staff nursesStaff) {
		Nurses_staff [] nurses = rest.getForObject("http://localhost:8084/nurses/getAllNurses",Nurses_staff[].class);
		return nurses;
	}

	@Override
	public Nurses_staff findNursesStaff(Integer id) {
		Nurses_staff staff = rest.getForObject("http://localhost:8084/nurses/findById/"+id, Nurses_staff.class);
		return staff;
	}

	@Override
	public String countNurses() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/nurses/countNurses", String.class);
	}

	@Override
	public String countMaleNurses() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/nurses/countMaleNurses", String.class);
	}

	@Override
	public String countFemaleNurses() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/nurses/countFemaleNurses", String.class);
	}

}
