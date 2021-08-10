package com.school.front.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.front.integration.JHSRestClient;
import com.school.front.integration.dto.JHSOneResults;
import com.school.front.integration.dto.JHSThreeResults;
import com.school.front.integration.dto.JHSTwoResults;
import com.school.front.integration.dto.PrimaryOneResults;
import com.school.front.integration.dto.PrimaryThreeResults;
import com.school.front.integration.dto.PrimaryTwoResults;

@Component
public class JHSResultsRestClientImpl implements JHSRestClient {
	
	RestTemplate rest = new RestTemplate();
	
	JHSOneResults oneResultss = new JHSOneResults();
	
	JHSTwoResults twoResultss = new JHSTwoResults();
	
	JHSThreeResults threeResultss = new JHSThreeResults();
	

	@Override
	public void saveJHSOneResults(JHSOneResults oneResults) {
		oneResultss.setStudent_id(oneResults.getStudent_id());
		oneResultss.setFirst_name(oneResults.getFirst_name());
		oneResultss.setLast_name(oneResults.getLast_name());
		oneResultss.setSubjects(oneResults.getSubjects());
		oneResultss.setMarks(oneResults.getMarks());
		oneResultss.setGrade(oneResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/saveJHSOne", oneResultss, PrimaryOneResults.class);

	}



	@Override
	public void saveJHSTwoResults(JHSTwoResults twoResults) {
		twoResultss.setStudent_id(twoResults.getStudent_id());
		twoResultss.setFirst_name(twoResults.getFirst_name());
		twoResultss.setLast_name(twoResults.getLast_name());
		twoResultss.setSubjects(twoResults.getSubjects());
		twoResultss.setMarks(twoResults.getMarks());
		twoResultss.setGrade(twoResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/saveJHSTwo", twoResultss, PrimaryTwoResults.class);

	}

	

	@Override
	public void saveJHSThreeResults(JHSThreeResults threeResults) {
		threeResultss.setStudent_id(threeResults.getStudent_id());
		threeResultss.setFirst_name(threeResults.getFirst_name());
		threeResultss.setLast_name(threeResults.getLast_name());
		threeResultss.setSubjects(threeResults.getSubjects());
		threeResultss.setMarks(threeResults.getMarks());
		threeResultss.setGrade(threeResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/saveJHSThree", threeResultss, PrimaryThreeResults.class);

	}


	@Override
	public void updateJHSOneResults(JHSOneResults oneResults) {
		Map<String, Integer> updateOne = new HashMap<String, Integer>();
		updateOne.put("id", oneResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSOne", oneResults, updateOne);

	}


	@Override
	public void updateJHSTwoResults(JHSTwoResults twoResults) {
		Map<String, Integer> updateTwo = new HashMap<String, Integer>();
		updateTwo.put("id", twoResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSTwo", twoResults, updateTwo);


	}


	@Override
	public void updateJHSThreeResults(JHSThreeResults threeResults) {
		Map<String, Integer> updateThree = new HashMap<String, Integer>();
		updateThree.put("id", threeResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSThree", threeResults, updateThree);

	}


	@Override
	public void deleteJHSOneResults(Integer id) {
		// TODO Auto-generated method stub

	}



	@Override
	public void deleteJHSTwoResults(Integer id) {
		// TODO Auto-generated method stub

	}



	@Override
	public void deleteJHSThreeResults(Integer id) {
		// TODO Auto-generated method stub

	}


	@Override
	public JHSOneResults[] getJHSOne(JHSOneResults oneResults) {
		JHSOneResults[] JHSOne = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSOne", JHSOneResults[].class);
		return JHSOne;
	}



	@Override
	public JHSTwoResults[] getJHSTwo(JHSTwoResults twoResults) {
		JHSTwoResults[] JHSTwo = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSTwo", JHSTwoResults[].class);
		return JHSTwo;
	}

	

	@Override
	public JHSThreeResults[] getJHSThree(JHSThreeResults threeResults) {
		JHSThreeResults[] primaryThree = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSThree", JHSThreeResults[].class);
		return primaryThree;
	}


}
