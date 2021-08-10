package com.school.front.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.front.integration.LowerPrimaryRestClient;
import com.school.front.integration.dto.PrimaryOneResults;
import com.school.front.integration.dto.PrimaryThreeResults;
import com.school.front.integration.dto.PrimaryTwoResults;

@Component
public class LowerPrimaryResultsRestClientImpl implements LowerPrimaryRestClient {
	
	RestTemplate rest = new RestTemplate();
	
	PrimaryOneResults oneResultss = new PrimaryOneResults();
	PrimaryTwoResults twoResultss = new PrimaryTwoResults();
	PrimaryThreeResults threeResultss = new PrimaryThreeResults();
	
	@Override
	public void savePrimaryOneResults(PrimaryOneResults oneResults) {
		oneResultss.setStudent_id(oneResults.getStudent_id());
		oneResultss.setFirst_name(oneResults.getFirst_name());
		oneResultss.setLast_name(oneResults.getLast_name());
		oneResultss.setSubjects(oneResults.getSubjects());
		oneResultss.setMarks(oneResults.getMarks());
		oneResultss.setGrade(oneResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryOne", oneResultss, PrimaryOneResults.class);

	}

	@Override
	public void savePrimaryTwoResults(PrimaryTwoResults twoResults) {
		twoResultss.setStudent_id(twoResults.getStudent_id());
		twoResultss.setFirst_name(twoResults.getFirst_name());
		twoResultss.setLast_name(twoResults.getLast_name());
		twoResultss.setSubjects(twoResults.getSubjects());
		twoResultss.setMarks(twoResults.getMarks());
		twoResultss.setGrade(twoResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryTwo", twoResultss, PrimaryTwoResults.class);

	}

	@Override
	public void savePrimaryThreeResults(PrimaryThreeResults threeResults) {
		threeResultss.setStudent_id(threeResults.getStudent_id());
		threeResultss.setFirst_name(threeResults.getFirst_name());
		threeResultss.setLast_name(threeResults.getLast_name());
		threeResultss.setSubjects(threeResults.getSubjects());
		threeResultss.setMarks(threeResults.getMarks());
		threeResultss.setGrade(threeResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryThree", threeResultss, PrimaryThreeResults.class);

	}

	@Override
	public void updatePrimaryOneResults(PrimaryOneResults oneResults) {
		Map<String, Integer> updateOne = new HashMap<String, Integer>();
		updateOne.put("id", oneResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryOne", oneResults, updateOne);

	}

	@Override
	public void updatePrimaryTwoResults(PrimaryTwoResults twoResults) {
		Map<String, Integer> updateTwo = new HashMap<String, Integer>();
		updateTwo.put("id", twoResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryTwo", twoResults, updateTwo);


	}

	@Override
	public void updatePrimaryThreeResults(PrimaryThreeResults threeResults) {
		Map<String, Integer> updateThree = new HashMap<String, Integer>();
		updateThree.put("id", threeResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryThree", threeResults, updateThree);

	}

	
	@Override
	public void deletePrimaryOneResults(Integer id) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public void deletePrimaryTwoResults(Integer id) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public void deletePrimaryThreeResults(Integer id) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public PrimaryOneResults[] getPrimaryOne(PrimaryOneResults oneResults) {
		PrimaryOneResults[] primaryOne = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryOne", PrimaryOneResults[].class);
		return primaryOne;
	}

	
	@Override
	public PrimaryTwoResults[] getPrimaryTwo(PrimaryTwoResults twoResults) {
		PrimaryTwoResults[] primaryTwo = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryTwo", PrimaryTwoResults[].class);
		return primaryTwo;
	}

	
	@Override
	public PrimaryThreeResults[] getPrimaryThree(PrimaryThreeResults threeResults) {
		PrimaryThreeResults[] primaryThree = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryThree", PrimaryThreeResults[].class);
		return primaryThree;
	}

	
	

}
