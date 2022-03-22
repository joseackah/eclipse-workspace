package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.nurses.management.system.integration.WardRestClient;
import org.nurses.management.system.integration.dto.Ward;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WardRestClientImpl implements WardRestClient {
	
	
	Ward wards = new Ward();
	RestTemplate rest = new RestTemplate();
	

	@Override
	public void saveWard(Ward ward) {
		wards.setId(ward.getId());
		wards.setWard_name(ward.getWard_name());
		wards.setTotal_staff(ward.getTotal_staff());
		wards.setBed_capacity(ward.getBed_capacity());
		wards.setWard_incharge(ward.getWard_incharge());
		rest.postForObject("http://localhost:8084/ward/saveWard/", ward, Ward.class);
		
	}

	@Override
	public void updateWard(Ward ward) {
		Map<String, Integer> updateWard = new HashMap<String, Integer>();
		updateWard.put("id", ward.getId());
		rest.put("http://localhost:8084/ward/updateWard/", ward, updateWard);
		
		
	}

	@Override
	public void deleteWard(Ward ward) {
		rest.delete("http://localhost:8084/ward/delete");
		
	}

	@Override
	public void deleteById(Integer id) {
		rest.delete("http://localhost:8084/ward/delete/"+id);
		
	}

	@Override
	public Ward[] getAllWard(Ward ward) {
		Ward [] getWard = rest.getForObject("http://localhost:8084/ward/getWard", Ward[].class);
		return getWard;
	}

	@Override
	public Ward findById(Integer id) {
		Ward ward = rest.getForObject("http://localhost:8084/ward/findWardById/"+id, Ward.class);
		return ward;
	}

	@Override
	public String bedCapacity() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward/bedCapacity",	String.class);
	}
	
	
	

}
