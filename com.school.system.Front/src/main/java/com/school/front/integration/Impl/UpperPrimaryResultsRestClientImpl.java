package com.school.front.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.front.integration.UpperPrimaryRestClient;
import com.school.front.integration.dto.PrimaryFiveResults;
import com.school.front.integration.dto.PrimaryFourResults;
import com.school.front.integration.dto.PrimarySixResults;

@Component
public class UpperPrimaryResultsRestClientImpl implements UpperPrimaryRestClient {
	
	RestTemplate rest = new RestTemplate();
	
	PrimaryFourResults fourResultss = new PrimaryFourResults();
	PrimaryFiveResults fiveResultss = new PrimaryFiveResults();
	PrimarySixResults sixResultss = new PrimarySixResults();
	
	@Override
	public void savePrimaryFourResults(PrimaryFourResults fourResults) {
		fourResultss.setStudent_id(fourResults.getStudent_id());
		fourResultss.setFirst_name(fourResults.getFirst_name());
		fourResultss.setLast_name(fourResults.getLast_name());
		fourResultss.setSubjects(fourResults.getSubjects());
		fourResultss.setMarks(fourResults.getMarks());
		fourResultss.setGrade(fourResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryFour", fourResultss, PrimaryFourResults.class);

	}

	
	@Override
	public void savePrimaryFiveResults(PrimaryFiveResults fiveResults) {
		fiveResultss.setStudent_id(fiveResults.getStudent_id());
		fiveResultss.setFirst_name(fiveResults.getFirst_name());
		fiveResultss.setLast_name(fiveResults.getLast_name());
		fiveResultss.setSubjects(fiveResults.getSubjects());
		fiveResultss.setMarks(fiveResults.getMarks());
		fiveResultss.setGrade(fiveResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryFive", fiveResultss, PrimaryFiveResults.class);

	}

	
	@Override
	public void savePrimarySixResults(PrimarySixResults sixResults) {
		sixResultss.setStudent_id(sixResults.getStudent_id());
		sixResultss.setFirst_name(sixResults.getFirst_name());
		sixResultss.setLast_name(sixResults.getLast_name());
		sixResultss.setSubjects(sixResults.getSubjects());
		sixResultss.setMarks(sixResults.getMarks());
		sixResultss.setGrade(sixResults.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimarySix", sixResultss, PrimarySixResults.class);

	}

	
	@Override
	public void updatePrimaryFourResults(PrimaryFourResults fourResults) {
		Map<String, Integer> updateFour = new HashMap<String, Integer>();
		updateFour.put("id", fourResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFour", fourResults, updateFour);

	}

	
	@Override
	public void updatePrimaryFiveResults(PrimaryFiveResults fiveResults) {
		Map<String, Integer> updateFive = new HashMap<String, Integer>();
		updateFive.put("id", fiveResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFive", fiveResults, updateFive);


	}

	
	@Override
	public void updatePrimarySixResults(PrimarySixResults sixResults) {
		Map<String, Integer> updateSix = new HashMap<String, Integer>();
		updateSix.put("id", sixResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimarySix", sixResults, updateSix);

	}

	
	@Override
	public void deletePrimaryFourResults(Integer id) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void deletePrimaryFiveResults(Integer id) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void deletePrimarySixResults(Integer id) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public PrimaryFourResults[] getPrimaryFour(PrimaryFourResults fourResults) {
		PrimaryFourResults[] primaryFour = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFour", PrimaryFourResults[].class);
		return primaryFour;
	}

	
	@Override
	public PrimaryFiveResults[] getPrimaryFive(PrimaryFiveResults fiveResults) {
		PrimaryFiveResults[] primaryFour = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFive", PrimaryFiveResults[].class);
		return primaryFour;
	}

	
	@Override
	public PrimarySixResults[] getPrimarySix(PrimarySixResults sixResults) {
		PrimarySixResults[] primarySix = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimarySix", PrimarySixResults[].class);
		return primarySix;
	}

	
}
