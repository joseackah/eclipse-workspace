package com.school.system.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.system.front.end.integration.ParentsRestClient;
import com.school.system.front.end.integration.dto.Parents;

@Component
public class ParentsRestClientImpl implements ParentsRestClient {
	
	RestTemplate rest= new RestTemplate();
	Parents parent = new Parents();

	@Override
	public void saveParent(Parents parents) {
		parent.setFirstName(parents.getFirstName());
		parent.setLastName(parents.getLastName());
		parent.setOccupation(parents.getOccupation());
		parent.setContact(parents.getContact());
		parent.setResNumber(parents.getResNumber());
		rest.postForObject("http://localhost:9095/parents/saveParent", parent, Parents.class);

	}

	@Override
	public void updateParent(Parents parents) {
		Map<String, Integer> updateParent = new HashMap<String, Integer>();
		updateParent.put("id", parents.getParentId());
		rest.put("http://localhost:9095/parents/updateParent", parents, updateParent);

	}

	@Override
	public void deleteParent(Integer id) {
		rest.delete("http://localhost:9095/parents/deleteParent/" + id);

	}

	@Override
	public void deleteAll(Parents parents) {
		rest.delete("http://localhost:9095/parents/deleteAllParent");

	}

	@Override
	public Parents[] getAllParents(Parents parents) {
		Parents[] parent = rest.getForObject("http://localhost:9095/parents/getParent", Parents[].class);
		return parent;
		
	}

	@Override
	public Parents findById(Integer id) {
		Parents parent = rest.getForObject("http://localhost:9095/parents/findById/" + id, Parents.class);
		return parent;
	}

	@Override
	public Parents findLastId(Parents parents) {
		Parents parent = rest.getForObject("http://localhost:9095/parents/lastId/", Parents.class);
		return parent;
	}

	

}
