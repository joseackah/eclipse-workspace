package com.school.system.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.system.front.end.integration.JHSRestClient;
import com.school.system.front.end.integration.dto.JHSResults;
import com.school.system.front.end.integration.dto.LowerPrimaryResults;

@Component
public class JHSResultsRestClientImpl implements JHSRestClient {
	
	RestTemplate rest = new RestTemplate();
	
	JHSResults oneResultss = new JHSResults();
	

	@Override
	public void saveJHSOneResults(JHSResults oneResults) {
		oneResultss.setStudent_id(oneResults.getStudent_id());
		oneResultss.setFirst_name(oneResults.getFirst_name());
		oneResultss.setLast_name(oneResults.getLast_name());
		oneResultss.setSubjects(oneResults.getSubjects());
		oneResultss.setMarks(oneResults.getMarks());
		oneResultss.setGrade(oneResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/saveJHSOne", oneResultss, LowerPrimaryResults.class);

	}

	

	

	@Override
	public void updateJHSOneResults(JHSResults oneResults) {
		Map<String, Integer> updateOne = new HashMap<String, Integer>();
		updateOne.put("id", oneResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSOne", oneResults, updateOne);

	}

	

	@Override
	public void deleteJHSOneResults(Integer id) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public JHSResults[] getJHSOne(JHSResults oneResults) {
		JHSResults[] JHSOne = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSOne", JHSResults[].class);
		return JHSOne;
	}

	

}
