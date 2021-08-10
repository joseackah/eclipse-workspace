package com.school.system.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.system.front.end.integration.UpperPrimaryRestClient;
import com.school.system.front.end.integration.dto.PrimaryFiveResults;
import com.school.system.front.end.integration.dto.PrimaryFiveResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryFiveResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryFiveResultsTerm3;
import com.school.system.front.end.integration.dto.PrimaryFourResults;
import com.school.system.front.end.integration.dto.PrimaryFourResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryFourResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryFourResultsTerm3;
import com.school.system.front.end.integration.dto.PrimarySixResults;
import com.school.system.front.end.integration.dto.PrimarySixResultsTerm1;
import com.school.system.front.end.integration.dto.PrimarySixResultsTerm2;
import com.school.system.front.end.integration.dto.PrimarySixResultsTerm3;

@Component
public class UpperPrimaryResultsRestClientImpl implements UpperPrimaryRestClient {
	
	RestTemplate rest = new RestTemplate();
	
	PrimaryFourResults fourResultss = new PrimaryFourResults();
	PrimaryFourResultsTerm1 fourResultssTerm1 = new PrimaryFourResultsTerm1();
	PrimaryFourResultsTerm2 fourResultssTerm2 = new PrimaryFourResultsTerm2();
	PrimaryFourResultsTerm3 fourResultssTerm3 = new PrimaryFourResultsTerm3();
	PrimaryFiveResults fiveResultss = new PrimaryFiveResults();
	PrimaryFiveResultsTerm1 fiveResultssTerm1 = new PrimaryFiveResultsTerm1();
	PrimaryFiveResultsTerm2 fiveResultssTerm2 = new PrimaryFiveResultsTerm2();
	PrimaryFiveResultsTerm3 fiveResultssTerm3 = new PrimaryFiveResultsTerm3();
	PrimarySixResults sixResultss = new PrimarySixResults();
	PrimarySixResultsTerm1 sixResultssTerm1 = new PrimarySixResultsTerm1();
	PrimarySixResultsTerm2 sixResultssTerm2 = new PrimarySixResultsTerm2();
	PrimarySixResultsTerm3 sixResultssTerm3 = new PrimarySixResultsTerm3();

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
	public void savePrimaryFourResultsTerm1(PrimaryFourResultsTerm1 fourResultsTerm1) {
		fourResultssTerm1.setStudent_id(fourResultsTerm1.getStudent_id());
		fourResultssTerm1.setFirst_name(fourResultsTerm1.getFirst_name());
		fourResultssTerm1.setLast_name(fourResultsTerm1.getLast_name());
		fourResultssTerm1.setSubjects(fourResultsTerm1.getSubjects());
		fourResultssTerm1.setMarks(fourResultsTerm1.getMarks());
		fourResultssTerm1.setGrade(fourResultsTerm1.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryFourTerm1", fourResultssTerm1, PrimaryFourResultsTerm1.class);

	}

	@Override
	public void savePrimaryFourResultsTerm2(PrimaryFourResultsTerm2 fourResultsTerm2) {
		fourResultssTerm2.setStudent_id(fourResultsTerm2.getStudent_id());
		fourResultssTerm2.setFirst_name(fourResultsTerm2.getFirst_name());
		fourResultssTerm2.setLast_name(fourResultsTerm2.getLast_name());
		fourResultssTerm2.setSubjects(fourResultsTerm2.getSubjects());
		fourResultssTerm2.setMarks(fourResultsTerm2.getMarks());
		fourResultssTerm2.setGrade(fourResultsTerm2.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryFourTerm2", fourResultssTerm2, PrimaryFourResultsTerm2.class);

	}

	@Override
	public void savePrimaryFourResultsTerm3(PrimaryFourResultsTerm3 fourResultsTerm3) {
		fourResultssTerm3.setStudent_id(fourResultsTerm3.getStudent_id());
		fourResultssTerm3.setFirst_name(fourResultsTerm3.getFirst_name());
		fourResultssTerm3.setLast_name(fourResultsTerm3.getLast_name());
		fourResultssTerm3.setSubjects(fourResultsTerm3.getSubjects());
		fourResultssTerm3.setMarks(fourResultsTerm3.getMarks());
		fourResultssTerm3.setGrade(fourResultsTerm3.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryFourTerm3", fourResultssTerm3, PrimaryFourResultsTerm3.class);

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
	public void savePrimaryFiveResultsTerm1(PrimaryFiveResultsTerm1 fiveResultsTerm1) {
		fiveResultssTerm1.setStudent_id(fiveResultsTerm1.getStudent_id());
		fiveResultssTerm1.setFirst_name(fiveResultsTerm1.getFirst_name());
		fiveResultssTerm1.setLast_name(fiveResultsTerm1.getLast_name());
		fiveResultssTerm1.setSubjects(fiveResultsTerm1.getSubjects());
		fiveResultssTerm1.setMarks(fiveResultsTerm1.getMarks());
		fiveResultssTerm1.setGrade(fiveResultsTerm1.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryFiveTerm1", fiveResultssTerm1, PrimaryFiveResultsTerm1.class);

	}

	@Override
	public void savePrimaryFiveResultsTerm2(PrimaryFiveResultsTerm2 fiveResultsTerm2) {
		fiveResultssTerm2.setStudent_id(fiveResultsTerm2.getStudent_id());
		fiveResultssTerm2.setFirst_name(fiveResultsTerm2.getFirst_name());
		fiveResultssTerm2.setLast_name(fiveResultsTerm2.getLast_name());
		fiveResultssTerm2.setSubjects(fiveResultsTerm2.getSubjects());
		fiveResultssTerm2.setMarks(fiveResultsTerm2.getMarks());
		fiveResultssTerm2.setGrade(fiveResultsTerm2.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryFiveTerm2", fiveResultssTerm2, PrimaryFiveResultsTerm2.class);

	}

	@Override
	public void savePrimaryFiveResultsTerm3(PrimaryFiveResultsTerm3 fiveResultsTerm3) {
		fiveResultssTerm3.setStudent_id(fiveResultsTerm3.getStudent_id());
		fiveResultssTerm3.setFirst_name(fiveResultsTerm3.getFirst_name());
		fiveResultssTerm3.setLast_name(fiveResultsTerm3.getLast_name());
		fiveResultssTerm3.setSubjects(fiveResultsTerm3.getSubjects());
		fiveResultssTerm3.setMarks(fiveResultsTerm3.getMarks());
		fiveResultssTerm3.setGrade(fiveResultsTerm3.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryFiveTerm3", fiveResultssTerm3, PrimaryFiveResultsTerm3.class);

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
	public void savePrimarySixResultsTerm1(PrimarySixResultsTerm1 sixResultsTerm1) {
		sixResultssTerm1.setStudent_id(sixResultsTerm1.getStudent_id());
		sixResultssTerm1.setFirst_name(sixResultsTerm1.getFirst_name());
		sixResultssTerm1.setLast_name(sixResultsTerm1.getLast_name());
		sixResultssTerm1.setSubjects(sixResultsTerm1.getSubjects());
		sixResultssTerm1.setMarks(sixResultsTerm1.getMarks());
		sixResultssTerm1.setGrade(sixResultsTerm1.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimarySixTerm1", sixResultssTerm1, PrimarySixResultsTerm1.class);

	}

	@Override
	public void savePrimarySixResultsTerm2(PrimarySixResultsTerm2 sixResultsTerm2) {
		sixResultssTerm2.setStudent_id(sixResultsTerm2.getStudent_id());
		sixResultssTerm2.setFirst_name(sixResultsTerm2.getFirst_name());
		sixResultssTerm2.setLast_name(sixResultsTerm2.getLast_name());
		sixResultssTerm2.setSubjects(sixResultsTerm2.getSubjects());
		sixResultssTerm2.setMarks(sixResultsTerm2.getMarks());
		sixResultssTerm2.setGrade(sixResultsTerm2.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimarySixTerm2", sixResultssTerm2, PrimarySixResultsTerm2.class);

	}

	@Override
	public void savePrimarySixResultsTerm3(PrimarySixResultsTerm3 sixResultsTerm3) {
		sixResultssTerm3.setStudent_id(sixResultsTerm3.getStudent_id());
		sixResultssTerm3.setFirst_name(sixResultsTerm3.getFirst_name());
		sixResultssTerm3.setLast_name(sixResultsTerm3.getLast_name());
		sixResultssTerm3.setSubjects(sixResultsTerm3.getSubjects());
		sixResultssTerm3.setMarks(sixResultsTerm3.getMarks());
		sixResultssTerm3.setGrade(sixResultsTerm3.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimarySixTerm3", sixResultssTerm3, PrimarySixResultsTerm3.class);

	}

	@Override
	public void updatePrimaryFourResults(PrimaryFourResults fourResults) {
		Map<String, Integer> updateFour = new HashMap<String, Integer>();
		updateFour.put("id", fourResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFour", fourResults, updateFour);

	}

	@Override
	public void updatePrimaryFourResultsTerm1(PrimaryFourResultsTerm1 fourResultsTerm1) {
		Map<String, Integer> updateFourTerm1 = new HashMap<String, Integer>();
		updateFourTerm1.put("id", fourResultsTerm1.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFourTerm1", fourResultsTerm1, updateFourTerm1);


	}

	@Override
	public void updatePrimaryFourResultsTerm2(PrimaryFourResultsTerm2 fourResultsTerm2) {
		Map<String, Integer> updateFourTerm2 = new HashMap<String, Integer>();
		updateFourTerm2.put("id", fourResultsTerm2.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFourTerm2", fourResultsTerm2, updateFourTerm2);


	}

	@Override
	public void updatePrimaryFourResultsTerm3(PrimaryFourResultsTerm3 fourResultsTerm3) {
		Map<String, Integer> updateFourTerm3 = new HashMap<String, Integer>();
		updateFourTerm3.put("id", fourResultsTerm3.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFourTerm3", fourResultsTerm3, updateFourTerm3);


	}

	@Override
	public void updatePrimaryFiveResults(PrimaryFiveResults fiveResults) {
		Map<String, Integer> updateFive = new HashMap<String, Integer>();
		updateFive.put("id", fiveResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFive", fiveResults, updateFive);


	}

	@Override
	public void updatePrimaryFiveResultsTerm1(PrimaryFiveResultsTerm1 fiveResultsTerm1) {
		Map<String, Integer> updateFiveTerm1 = new HashMap<String, Integer>();
		updateFiveTerm1.put("id", fiveResultsTerm1.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFiveTerm1", fiveResultsTerm1, updateFiveTerm1);


	}

	@Override
	public void updatePrimaryFiveResultsTerm2(PrimaryFiveResultsTerm2 fiveResultsTerm2) {
		Map<String, Integer> updateFiveTerm2 = new HashMap<String, Integer>();
		updateFiveTerm2.put("id", fiveResultsTerm2.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFiveTerm2", fiveResultsTerm2, updateFiveTerm2);

	}

	@Override
	public void updatePrimaryFiveResultsTerm3(PrimaryFiveResultsTerm3 fiveResultsTerm3) {
		Map<String, Integer> updateFiveTerm3 = new HashMap<String, Integer>();
		updateFiveTerm3.put("id", fiveResultsTerm3.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryFiveTerm3", fiveResultsTerm3, updateFiveTerm3);

	}

	@Override
	public void updatePrimarySixResults(PrimarySixResults sixResults) {
		Map<String, Integer> updateSix = new HashMap<String, Integer>();
		updateSix.put("id", sixResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimarySix", sixResults, updateSix);

	}

	@Override
	public void updatePrimarySixResultsTerm1(PrimarySixResultsTerm1 sixResultsTerm1) {
		Map<String, Integer> updateSixTerm1 = new HashMap<String, Integer>();
		updateSixTerm1.put("id", sixResultsTerm1.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimarySixTerm1", sixResultsTerm1, updateSixTerm1);

	}

	@Override
	public void updatePrimarySixResultsTerm2(PrimarySixResultsTerm2 sixResultsTerm2) {
		Map<String, Integer> updateSixTerm2 = new HashMap<String, Integer>();
		updateSixTerm2.put("id", sixResultsTerm2.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimarySixTerm2", sixResultsTerm2, updateSixTerm2);

	}

	@Override
	public void updatePrimarySixResultsTerm3(PrimarySixResultsTerm3 sixResultsTerm3) {
		Map<String, Integer> updateSixTerm3 = new HashMap<String, Integer>();
		updateSixTerm3.put("id", sixResultsTerm3.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimarySixTerm3", sixResultsTerm3, updateSixTerm3);

	}

	@Override
	public void deletePrimaryFourResults(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryFourResultsTerm1(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryFourResultsTerm2(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryFourResultsTerm3(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryFiveResults(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryFiveResultsTerm1(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryFiveResultsTerm2(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryFiveResultsTerm3(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimarySixResults(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimarySixResultsTerm1(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimarySixResultsTerm2(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimarySixResultsTerm3(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public PrimaryFourResults[] getPrimaryFour(PrimaryFourResults fourResults) {
		PrimaryFourResults[] primaryFour = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFour", PrimaryFourResults[].class);
		return primaryFour;
	}

	@Override
	public PrimaryFourResultsTerm1[] getPrimaryFourTerm1(PrimaryFourResultsTerm1 fourResultsTerm1) {
		PrimaryFourResultsTerm1[] primaryFourTerm1 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFourTerm1", PrimaryFourResultsTerm1[].class);
		return primaryFourTerm1;
	}

	@Override
	public PrimaryFourResultsTerm2[] getPrimaryFourTerm2(PrimaryFourResultsTerm2 fourResultsTerm2) {
		 
		PrimaryFourResultsTerm2[] primaryFourTerm2 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFourTerm2", PrimaryFourResultsTerm2[].class);
		return primaryFourTerm2;
	}

	@Override
	public PrimaryFourResultsTerm3[] getPrimaryFourTerm3(PrimaryFourResultsTerm3 fourResultsTerm3) {
		PrimaryFourResultsTerm3[] primaryFourTerm3 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFourTerm3", PrimaryFourResultsTerm3[].class);
		return primaryFourTerm3;
	}

	@Override
	public PrimaryFiveResults[] getPrimaryFive(PrimaryFiveResults fiveResults) {
		PrimaryFiveResults[] primaryFour = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFive", PrimaryFiveResults[].class);
		return primaryFour;
	}

	@Override
	public PrimaryFiveResultsTerm1[] getPrimaryFiveTerm1(PrimaryFiveResultsTerm1 fiveResultsTerm1) {
		PrimaryFiveResultsTerm1[] primaryFiveTerm1 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFiveTerm1", PrimaryFiveResultsTerm1[].class);
		return primaryFiveTerm1;
	}

	@Override
	public PrimaryFiveResultsTerm2[] getPrimaryFiveTerm2(PrimaryFiveResultsTerm2 fiveResultsTerm2) {
		PrimaryFiveResultsTerm2[] primaryFiveTerm2 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFiveTerm2", PrimaryFiveResultsTerm2[].class);
		return primaryFiveTerm2;
	}

	@Override
	public PrimaryFiveResultsTerm3[] getPrimaryFiveTerm3(PrimaryFiveResultsTerm3 fiveResultsTerm3) {
		PrimaryFiveResultsTerm3[] primaryFiveTerm3 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryFiveTerm3", PrimaryFiveResultsTerm3[].class);
		return primaryFiveTerm3;
	}

	@Override
	public PrimarySixResults[] getPrimarySix(PrimarySixResults sixResults) {
		PrimarySixResults[] primarySix = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimarySix", PrimarySixResults[].class);
		return primarySix;
	}

	@Override
	public PrimarySixResultsTerm1[] getPrimarySixTerm1(PrimarySixResultsTerm1 sixResultsTerm1) {
		PrimarySixResultsTerm1[] primarySixTerm1 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimarySixTerm1", PrimarySixResultsTerm1[].class);
		return primarySixTerm1;
	}

	@Override
	public PrimarySixResultsTerm2[] getPrimarySixTerm2(PrimarySixResultsTerm2 sixResultsTerm2) {
		PrimarySixResultsTerm2[] primarySixTerm2 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimarySixTerm2", PrimarySixResultsTerm2[].class);
		return primarySixTerm2;
	}

	@Override
	public PrimarySixResultsTerm3[] getPrimarySixTerm3(PrimarySixResultsTerm3 sixResultsTerm3) {
		PrimarySixResultsTerm3[] primarySixTerm3 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimarySixTerm3", PrimarySixResultsTerm3[].class);
		return primarySixTerm3;
	}

}
