package com.school.system.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.system.front.end.integration.LowerPrimaryRestClient;
import com.school.system.front.end.integration.dto.LowerPrimaryResults;

@Component
public class LowerPrimaryResultsRestClientImpl implements LowerPrimaryRestClient {
	
	RestTemplate rest = new RestTemplate();
	
	LowerPrimaryResults oneResultss = new LowerPrimaryResults();
	

	@Override
	public void savePrimaryOneResults(LowerPrimaryResults oneResults) {
		oneResultss.setStudent_id(oneResults.getStudent_id());
		oneResultss.setFirst_name(oneResults.getFirst_name());
		oneResultss.setLast_name(oneResults.getLast_name());
		oneResultss.setSubjects(oneResults.getSubjects());
		oneResultss.setMarks(oneResults.getMarks());
		oneResultss.setGrade(oneResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryOne", oneResultss, LowerPrimaryResults.class);

	}

	
	@Override
	public void updatePrimaryOneResults(LowerPrimaryResults oneResults) {
		Map<String, Integer> updateOne = new HashMap<String, Integer>();
		updateOne.put("id", oneResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryOne", oneResults, updateOne);

	}

	

	@Override
	public void deletePrimaryOneResults(Integer id) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public LowerPrimaryResults[] getPrimaryOne(LowerPrimaryResults oneResults) {
		LowerPrimaryResults[] primaryOne = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryOne", LowerPrimaryResults[].class);
		return primaryOne;
	}


	





	

	

}
