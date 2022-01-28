package com.school.system.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.system.front.end.integration.UpperPrimaryRestClient;
import com.school.system.front.end.integration.dto.UpperPrimaryResults;

@Component
public class UpperPrimaryResultsRestClientImpl implements UpperPrimaryRestClient {
	
	RestTemplate rest = new RestTemplate();
	
	UpperPrimaryResults fourResultss = new UpperPrimaryResults();
	

	@Override
	public void savePrimaryFourResults(UpperPrimaryResults fourResults) {
		fourResultss.setStudent_id(fourResults.getStudent_id());
		fourResultss.setFirst_name(fourResults.getFirst_name());
		fourResultss.setLast_name(fourResults.getLast_name());
		fourResultss.setSubjects(fourResults.getSubjects());
		fourResultss.setMarks(fourResults.getMarks());
		fourResultss.setGrade(fourResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryFour", fourResultss, UpperPrimaryResults.class);

	}

	

	@Override
	public void updatePrimaryFourResults(UpperPrimaryResults fourResults) {
		Map<String, Integer> updateFour = new HashMap<String, Integer>();
		updateFour.put("id", fourResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFour", fourResults, updateFour);

	}

	

	@Override
	public void deletePrimaryFourResults(Integer id) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public UpperPrimaryResults[] getPrimaryFour(UpperPrimaryResults fourResults) {
		UpperPrimaryResults[] primaryFour = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFour", UpperPrimaryResults[].class);
		return primaryFour;
	}

	
}
