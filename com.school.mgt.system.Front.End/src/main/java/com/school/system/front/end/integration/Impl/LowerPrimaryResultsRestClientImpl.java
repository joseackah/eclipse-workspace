package com.school.system.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.system.front.end.integration.LowerPrimaryRestClient;
import com.school.system.front.end.integration.dto.PrimaryOneResults;
import com.school.system.front.end.integration.dto.PrimaryOneResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryOneResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryOneResultsTerm3;
import com.school.system.front.end.integration.dto.PrimaryThreeResults;
import com.school.system.front.end.integration.dto.PrimaryThreeResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryThreeResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryThreeResultsTerm3;
import com.school.system.front.end.integration.dto.PrimaryTwoResults;
import com.school.system.front.end.integration.dto.PrimaryTwoResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryTwoResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryTwoResultsTerm3;

@Component
public class LowerPrimaryResultsRestClientImpl implements LowerPrimaryRestClient {
	
	RestTemplate rest = new RestTemplate();
	
	PrimaryOneResults oneResultss = new PrimaryOneResults();
	PrimaryOneResultsTerm1 oneResultssTerm1 = new PrimaryOneResultsTerm1();
	PrimaryOneResultsTerm2 oneResultssTerm2 = new PrimaryOneResultsTerm2();
	PrimaryOneResultsTerm3 oneResultssTerm3 = new PrimaryOneResultsTerm3();
	PrimaryTwoResults twoResultss = new PrimaryTwoResults();
	PrimaryTwoResultsTerm1 twoResultssTerm1 = new PrimaryTwoResultsTerm1();
	PrimaryTwoResultsTerm2 twoResultssTerm2 = new PrimaryTwoResultsTerm2();
	PrimaryTwoResultsTerm3 twoResultssTerm3 = new PrimaryTwoResultsTerm3();
	PrimaryThreeResults threeResultss = new PrimaryThreeResults();
	PrimaryThreeResultsTerm1 threeResultssTerm1 = new PrimaryThreeResultsTerm1();
	PrimaryThreeResultsTerm2 threeResultssTerm2 = new PrimaryThreeResultsTerm2();
	PrimaryThreeResultsTerm3 threeResultssTerm3 = new PrimaryThreeResultsTerm3();

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
	public void savePrimaryOneResultsTerm1(PrimaryOneResultsTerm1 oneResultsTerm1) {
		oneResultssTerm1.setStudent_id(oneResultsTerm1.getStudent_id());
		oneResultssTerm1.setFirst_name(oneResultsTerm1.getFirst_name());
		oneResultssTerm1.setLast_name(oneResultsTerm1.getLast_name());
		oneResultssTerm1.setSubjects(oneResultsTerm1.getSubjects());
		oneResultssTerm1.setMarks(oneResultsTerm1.getMarks());
		oneResultssTerm1.setGrade(oneResultsTerm1.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryOneTerm1", oneResultssTerm1, PrimaryOneResultsTerm1.class);

	}

	@Override
	public void savePrimaryOneResultsTerm2(PrimaryOneResultsTerm2 oneResultsTerm2) {
		oneResultssTerm2.setStudent_id(oneResultsTerm2.getStudent_id());
		oneResultssTerm2.setFirst_name(oneResultsTerm2.getFirst_name());
		oneResultssTerm2.setLast_name(oneResultsTerm2.getLast_name());
		oneResultssTerm2.setSubjects(oneResultsTerm2.getSubjects());
		oneResultssTerm2.setMarks(oneResultsTerm2.getMarks());
		oneResultssTerm2.setGrade(oneResultsTerm2.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryOneTerm2", oneResultssTerm2, PrimaryOneResultsTerm2.class);

	}

	@Override
	public void savePrimaryOneResultsTerm3(PrimaryOneResultsTerm3 oneResultsTerm3) {
		oneResultssTerm3.setStudent_id(oneResultsTerm3.getStudent_id());
		oneResultssTerm3.setFirst_name(oneResultsTerm3.getFirst_name());
		oneResultssTerm3.setLast_name(oneResultsTerm3.getLast_name());
		oneResultssTerm3.setSubjects(oneResultsTerm3.getSubjects());
		oneResultssTerm3.setMarks(oneResultsTerm3.getMarks());
		oneResultssTerm3.setGrade(oneResultsTerm3.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryOneTerm3", oneResultssTerm3, PrimaryOneResultsTerm3.class);

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
	public void savePrimaryTwoResultsTerm1(PrimaryTwoResultsTerm1 twoResultsTerm1) {
		twoResultssTerm1.setStudent_id(twoResultsTerm1.getStudent_id());
		twoResultssTerm1.setFirst_name(twoResultsTerm1.getFirst_name());
		twoResultssTerm1.setLast_name(twoResultsTerm1.getLast_name());
		twoResultssTerm1.setSubjects(twoResultsTerm1.getSubjects());
		twoResultssTerm1.setMarks(twoResultsTerm1.getMarks());
		twoResultssTerm1.setGrade(twoResultsTerm1.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryTwoTerm1", twoResultssTerm1, PrimaryTwoResultsTerm1.class);

	}

	@Override
	public void savePrimaryTwoResultsTerm2(PrimaryTwoResultsTerm2 twoResultsTerm2) {
		twoResultssTerm2.setStudent_id(twoResultsTerm2.getStudent_id());
		twoResultssTerm2.setFirst_name(twoResultsTerm2.getFirst_name());
		twoResultssTerm2.setLast_name(twoResultsTerm2.getLast_name());
		twoResultssTerm2.setSubjects(twoResultsTerm2.getSubjects());
		twoResultssTerm2.setMarks(twoResultsTerm2.getMarks());
		twoResultssTerm2.setGrade(twoResultsTerm2.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryTwoTerm2", twoResultssTerm2, PrimaryTwoResultsTerm2.class);

	}

	@Override
	public void savePrimaryTwoResultsTerm3(PrimaryTwoResultsTerm3 twoResultsTerm3) {
		twoResultssTerm3.setStudent_id(twoResultsTerm3.getStudent_id());
		twoResultssTerm3.setFirst_name(twoResultsTerm3.getFirst_name());
		twoResultssTerm3.setLast_name(twoResultsTerm3.getLast_name());
		twoResultssTerm3.setSubjects(twoResultsTerm3.getSubjects());
		twoResultssTerm3.setMarks(twoResultsTerm3.getMarks());
		twoResultssTerm3.setGrade(twoResultsTerm3.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryTwoTerm3", twoResultssTerm3, PrimaryTwoResultsTerm3.class);

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
	public void savePrimaryThreeResultsTerm1(PrimaryThreeResultsTerm1 threeResultsTerm1) {
		threeResultssTerm1.setStudent_id(threeResultsTerm1.getStudent_id());
		threeResultssTerm1.setFirst_name(threeResultsTerm1.getFirst_name());
		threeResultssTerm1.setLast_name(threeResultsTerm1.getLast_name());
		threeResultssTerm1.setSubjects(threeResultsTerm1.getSubjects());
		threeResultssTerm1.setMarks(threeResultsTerm1.getMarks());
		threeResultssTerm1.setGrade(threeResultsTerm1.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryThreeTerm1", threeResultssTerm1, PrimaryThreeResultsTerm1.class);

	}

	@Override
	public void savePrimaryThreeResultsTerm2(PrimaryThreeResultsTerm2 threeResultsTerm2) {
		threeResultssTerm2.setStudent_id(threeResultsTerm2.getStudent_id());
		threeResultssTerm2.setFirst_name(threeResultsTerm2.getFirst_name());
		threeResultssTerm2.setLast_name(threeResultsTerm2.getLast_name());
		threeResultssTerm2.setSubjects(threeResultsTerm2.getSubjects());
		threeResultssTerm2.setMarks(threeResultsTerm2.getMarks());
		threeResultssTerm2.setGrade(threeResultsTerm2.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryThreeTerm2", threeResultssTerm2, PrimaryThreeResultsTerm2.class);

	}

	@Override
	public void savePrimaryThreeResultsTerm3(PrimaryThreeResultsTerm3 threeResultsTerm3) {
		threeResultssTerm3.setStudent_id(threeResultsTerm3.getStudent_id());
		threeResultssTerm3.setFirst_name(threeResultsTerm3.getFirst_name());
		threeResultssTerm3.setLast_name(threeResultsTerm3.getLast_name());
		threeResultssTerm3.setSubjects(threeResultsTerm3.getSubjects());
		threeResultssTerm3.setMarks(threeResultsTerm3.getMarks());
		threeResultssTerm3.setGrade(threeResultsTerm3.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryThreeTerm3", threeResultssTerm3, PrimaryThreeResultsTerm3.class);

	}

	@Override
	public void updatePrimaryOneResults(PrimaryOneResults oneResults) {
		Map<String, Integer> updateOne = new HashMap<String, Integer>();
		updateOne.put("id", oneResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryOne", oneResults, updateOne);

	}

	@Override
	public void updatePrimaryOneResultsTerm1(PrimaryOneResultsTerm1 oneResultsTerm1) {
		Map<String, Integer> updateOneTerm1 = new HashMap<String, Integer>();
		updateOneTerm1.put("id", oneResultsTerm1.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryOneTerm1", oneResultsTerm1, updateOneTerm1);


	}

	@Override
	public void updatePrimaryOneResultsTerm2(PrimaryOneResultsTerm2 oneResultsTerm2) {
		Map<String, Integer> updateOneTerm2 = new HashMap<String, Integer>();
		updateOneTerm2.put("id", oneResultsTerm2.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryOneTerm2", oneResultsTerm2, updateOneTerm2);


	}

	@Override
	public void updatePrimaryOneResultsTerm3(PrimaryOneResultsTerm3 oneResultsTerm3) {
		Map<String, Integer> updateOneTerm3 = new HashMap<String, Integer>();
		updateOneTerm3.put("id", oneResultsTerm3.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryOneTerm3", oneResultsTerm3, updateOneTerm3);


	}

	@Override
	public void updatePrimaryTwoResults(PrimaryTwoResults twoResults) {
		Map<String, Integer> updateTwo = new HashMap<String, Integer>();
		updateTwo.put("id", twoResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryTwo", twoResults, updateTwo);


	}

	@Override
	public void updatePrimaryTwoResultsTerm1(PrimaryTwoResultsTerm1 twoResultsTerm1) {
		Map<String, Integer> updateTwoTerm1 = new HashMap<String, Integer>();
		updateTwoTerm1.put("id", twoResultsTerm1.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryTwoTerm1", twoResultsTerm1, updateTwoTerm1);


	}

	@Override
	public void updatePrimaryTwoResultsTerm2(PrimaryTwoResultsTerm2 twoResultsTerm2) {
		Map<String, Integer> updateTwoTerm2 = new HashMap<String, Integer>();
		updateTwoTerm2.put("id", twoResultsTerm2.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryTwoTerm2", twoResultsTerm2, updateTwoTerm2);

	}

	@Override
	public void updatePrimaryTwoResultsTerm3(PrimaryTwoResultsTerm3 twoResultsTerm3) {
		Map<String, Integer> updateTwoTerm3 = new HashMap<String, Integer>();
		updateTwoTerm3.put("id", twoResultsTerm3.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryTwoTerm1", twoResultsTerm3, updateTwoTerm3);

	}

	@Override
	public void updatePrimaryThreeResults(PrimaryThreeResults threeResults) {
		Map<String, Integer> updateThree = new HashMap<String, Integer>();
		updateThree.put("id", threeResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryThree", threeResults, updateThree);

	}

	@Override
	public void updatePrimaryThreeResultsTerm1(PrimaryThreeResultsTerm1 threeResultsTerm1) {
		Map<String, Integer> updateThreeTerm1 = new HashMap<String, Integer>();
		updateThreeTerm1.put("id", threeResultsTerm1.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryThreeTerm1", threeResultsTerm1, updateThreeTerm1);

	}

	@Override
	public void updatePrimaryThreeResultsTerm2(PrimaryThreeResultsTerm2 threeResultsTerm2) {
		Map<String, Integer> updateThreeTerm2 = new HashMap<String, Integer>();
		updateThreeTerm2.put("id", threeResultsTerm2.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryThreeTerm2", threeResultsTerm2, updateThreeTerm2);

	}

	@Override
	public void updatePrimaryThreeResultsTerm3(PrimaryThreeResultsTerm3 threeResultsTerm3) {
		Map<String, Integer> updateThreeTerm3 = new HashMap<String, Integer>();
		updateThreeTerm3.put("id", threeResultsTerm3.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryTwoTerm1", threeResultsTerm3, updateThreeTerm3);

	}

	@Override
	public void deletePrimaryOneResults(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryOneResultsTerm1(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryOneResultsTerm2(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryOneResultsTerm3(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryTwoResults(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryTwoResultsTerm1(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryTwoResultsTerm2(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryTwoResultsTerm3(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryThreeResults(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryThreeResultsTerm1(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryThreeResultsTerm2(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePrimaryThreeResultsTerm3(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public PrimaryOneResults[] getPrimaryOne(PrimaryOneResults oneResults) {
		PrimaryOneResults[] primaryOne = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryOne", PrimaryOneResults[].class);
		return primaryOne;
	}

	@Override
	public PrimaryOneResultsTerm1[] getPrimaryOneTerm1(PrimaryOneResultsTerm1 oneResultsTerm1) {
		PrimaryOneResultsTerm1[] primaryOneTerm1 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryOneTerm1", PrimaryOneResultsTerm1[].class);
		return primaryOneTerm1;
	}

	@Override
	public PrimaryOneResultsTerm2[] getPrimaryOneTerm2(PrimaryOneResultsTerm2 oneResultsTerm2) {
		 
		PrimaryOneResultsTerm2[] primaryOneTerm2 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryOneTerm2", PrimaryOneResultsTerm2[].class);
		return primaryOneTerm2;
	}

	@Override
	public PrimaryOneResultsTerm3[] getPrimaryOneTerm3(PrimaryOneResultsTerm3 oneResultsTerm3) {
		PrimaryOneResultsTerm3[] primaryOneTerm3 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryOneTerm3", PrimaryOneResultsTerm3[].class);
		return primaryOneTerm3;
	}

	@Override
	public PrimaryTwoResults[] getPrimaryTwo(PrimaryTwoResults twoResults) {
		PrimaryTwoResults[] primaryTwo = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryTwo", PrimaryTwoResults[].class);
		return primaryTwo;
	}

	@Override
	public PrimaryTwoResultsTerm1[] getPrimaryTwoTerm1(PrimaryTwoResultsTerm1 twoResultsTerm1) {
		PrimaryTwoResultsTerm1[] primaryTwoTerm1 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryTwoTerm1", PrimaryTwoResultsTerm1[].class);
		return primaryTwoTerm1;
	}

	@Override
	public PrimaryTwoResultsTerm2[] getPrimaryTwoTerm2(PrimaryTwoResultsTerm2 twoResultsTerm2) {
		PrimaryTwoResultsTerm2[] primaryTwoTerm2 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryTwoTerm2", PrimaryTwoResultsTerm2[].class);
		return primaryTwoTerm2;
	}

	@Override
	public PrimaryTwoResultsTerm3[] getPrimaryTwoTerm3(PrimaryTwoResultsTerm3 twoResultsTerm3) {
		PrimaryTwoResultsTerm3[] primaryTwoTerm3 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryTwoTerm3", PrimaryTwoResultsTerm3[].class);
		return primaryTwoTerm3;
	}

	@Override
	public PrimaryThreeResults[] getPrimaryThree(PrimaryThreeResults threeResults) {
		PrimaryThreeResults[] primaryThree = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryThree", PrimaryThreeResults[].class);
		return primaryThree;
	}

	@Override
	public PrimaryThreeResultsTerm1[] getPrimaryThreeTerm1(PrimaryThreeResultsTerm1 threeResultsTerm1) {
		PrimaryThreeResultsTerm1[] primaryThreeTerm1 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryThreeTerm1", PrimaryThreeResultsTerm1[].class);
		return primaryThreeTerm1;
	}

	@Override
	public PrimaryThreeResultsTerm2[] getPrimaryThreeTerm2(PrimaryThreeResultsTerm2 threeResultsTerm2) {
		PrimaryThreeResultsTerm2[] primaryThreeTerm2 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryThreeTerm2", PrimaryThreeResultsTerm2[].class);
		return primaryThreeTerm2;
	}

	@Override
	public PrimaryThreeResultsTerm3[] getPrimaryThreeTerm3(PrimaryThreeResultsTerm3 threeResultsTerm3) {
		PrimaryThreeResultsTerm3[] primaryThreeTerm3 = rest.getForObject("http://localhost:9095/lowerPrimary/getPrimaryThreeTerm3", PrimaryThreeResultsTerm3[].class);
		return primaryThreeTerm3;
	}

	

}
