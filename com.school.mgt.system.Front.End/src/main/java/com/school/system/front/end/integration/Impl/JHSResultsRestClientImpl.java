package com.school.system.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.system.front.end.integration.JHSRestClient;
import com.school.system.front.end.integration.dto.JHSOneResults;
import com.school.system.front.end.integration.dto.JHSOneResultsTerm1;
import com.school.system.front.end.integration.dto.JHSOneResultsTerm2;
import com.school.system.front.end.integration.dto.JHSThreeResults;
import com.school.system.front.end.integration.dto.JHSThreeResultsTerm1;
import com.school.system.front.end.integration.dto.JHSThreeResultsTerm2;
import com.school.system.front.end.integration.dto.JHSTwoResults;
import com.school.system.front.end.integration.dto.JHSTwoResultsTerm1;
import com.school.system.front.end.integration.dto.JHSTwoResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryOneResults;
import com.school.system.front.end.integration.dto.PrimaryOneResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryOneResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryThreeResults;
import com.school.system.front.end.integration.dto.PrimaryThreeResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryThreeResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryTwoResults;
import com.school.system.front.end.integration.dto.PrimaryTwoResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryTwoResultsTerm2;

@Component
public class JHSResultsRestClientImpl implements JHSRestClient {
	
	RestTemplate rest = new RestTemplate();
	
	JHSOneResults oneResultss = new JHSOneResults();
	JHSOneResultsTerm1 oneResultssTerm1 = new JHSOneResultsTerm1();
	JHSOneResultsTerm2 oneResultssTerm2 = new JHSOneResultsTerm2();
	
	JHSTwoResults twoResultss = new JHSTwoResults();
	JHSTwoResultsTerm1 twoResultssTerm1 = new JHSTwoResultsTerm1();
	JHSTwoResultsTerm2 twoResultssTerm2 = new JHSTwoResultsTerm2();
	
	JHSThreeResults threeResultss = new JHSThreeResults();
	JHSThreeResultsTerm1 threeResultssTerm1 = new JHSThreeResultsTerm1();
	JHSThreeResultsTerm2 threeResultssTerm2 = new JHSThreeResultsTerm2();
	

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
	public void saveJHSOneResultsTerm1(JHSOneResultsTerm1 oneResultsTerm1) {
		oneResultssTerm1.setStudent_id(oneResultsTerm1.getStudent_id());
		oneResultssTerm1.setFirst_name(oneResultsTerm1.getFirst_name());
		oneResultssTerm1.setLast_name(oneResultsTerm1.getLast_name());
		oneResultssTerm1.setSubjects(oneResultsTerm1.getSubjects());
		oneResultssTerm1.setMarks(oneResultsTerm1.getMarks());
		oneResultssTerm1.setGrade(oneResultsTerm1.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/saveJHSOneTerm1", oneResultssTerm1, PrimaryOneResultsTerm1.class);

	}

	@Override
	public void saveJHSOneResultsTerm2(JHSOneResultsTerm2 oneResultsTerm2) {
		oneResultssTerm2.setStudent_id(oneResultsTerm2.getStudent_id());
		oneResultssTerm2.setFirst_name(oneResultsTerm2.getFirst_name());
		oneResultssTerm2.setLast_name(oneResultsTerm2.getLast_name());
		oneResultssTerm2.setSubjects(oneResultsTerm2.getSubjects());
		oneResultssTerm2.setMarks(oneResultsTerm2.getMarks());
		oneResultssTerm2.setGrade(oneResultsTerm2.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/saveJHSOneTerm2", oneResultssTerm2, PrimaryOneResultsTerm2.class);

	}

	/*
	 * @Override public void savePrimaryOneResultsTerm3(PrimaryOneResultsTerm3
	 * oneResultsTerm3) {
	 * oneResultssTerm3.setStudent_id(oneResultsTerm3.getStudent_id());
	 * oneResultssTerm3.setFirst_name(oneResultsTerm3.getFirst_name());
	 * oneResultssTerm3.setLast_name(oneResultsTerm3.getLast_name());
	 * oneResultssTerm3.setSubjects(oneResultsTerm3.getSubjects());
	 * oneResultssTerm3.setMarks(oneResultsTerm3.getMarks());
	 * oneResultssTerm3.setGrade(oneResultsTerm3.getGrade());
	 * rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryOneTerm3",
	 * oneResultssTerm3, PrimaryOneResultsTerm3.class);
	 * 
	 * }
	 */

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
	public void saveJHSTwoResultsTerm1(JHSTwoResultsTerm1 twoResultsTerm1) {
		twoResultssTerm1.setStudent_id(twoResultsTerm1.getStudent_id());
		twoResultssTerm1.setFirst_name(twoResultsTerm1.getFirst_name());
		twoResultssTerm1.setLast_name(twoResultsTerm1.getLast_name());
		twoResultssTerm1.setSubjects(twoResultsTerm1.getSubjects());
		twoResultssTerm1.setMarks(twoResultsTerm1.getMarks());
		twoResultssTerm1.setGrade(twoResultsTerm1.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/saveJHSTwoTerm1", twoResultssTerm1, PrimaryTwoResultsTerm1.class);

	}

	@Override
	public void saveJHSTwoResultsTerm2(JHSTwoResultsTerm2 twoResultsTerm2) {
		twoResultssTerm2.setStudent_id(twoResultsTerm2.getStudent_id());
		twoResultssTerm2.setFirst_name(twoResultsTerm2.getFirst_name());
		twoResultssTerm2.setLast_name(twoResultsTerm2.getLast_name());
		twoResultssTerm2.setSubjects(twoResultsTerm2.getSubjects());
		twoResultssTerm2.setMarks(twoResultsTerm2.getMarks());
		twoResultssTerm2.setGrade(twoResultsTerm2.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryTwoTerm2", twoResultssTerm2, PrimaryTwoResultsTerm2.class);

	}

	/*
	 * @Override public void savePrimaryTwoResultsTerm3(PrimaryTwoResultsTerm3
	 * twoResultsTerm3) {
	 * twoResultssTerm3.setStudent_id(twoResultsTerm3.getStudent_id());
	 * twoResultssTerm3.setFirst_name(twoResultsTerm3.getFirst_name());
	 * twoResultssTerm3.setLast_name(twoResultsTerm3.getLast_name());
	 * twoResultssTerm3.setSubjects(twoResultsTerm3.getSubjects());
	 * twoResultssTerm3.setMarks(twoResultsTerm3.getMarks());
	 * twoResultssTerm3.setGrade(twoResultsTerm3.getGrade());
	 * rest.postForObject("http://localhost:9095/lowerPrimary/savePrimaryTwoTerm3",
	 * twoResultssTerm3, PrimaryTwoResultsTerm3.class);
	 * 
	 * }
	 */

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
	public void saveJHSThreeResultsTerm1(JHSThreeResultsTerm1 threeResultsTerm1) {
		threeResultssTerm1.setStudent_id(threeResultsTerm1.getStudent_id());
		threeResultssTerm1.setFirst_name(threeResultsTerm1.getFirst_name());
		threeResultssTerm1.setLast_name(threeResultsTerm1.getLast_name());
		threeResultssTerm1.setSubjects(threeResultsTerm1.getSubjects());
		threeResultssTerm1.setMarks(threeResultsTerm1.getMarks());
		threeResultssTerm1.setGrade(threeResultsTerm1.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/saveJHSThreeTerm1", threeResultssTerm1, PrimaryThreeResultsTerm1.class);

	}

	@Override
	public void saveJHSThreeResultsTerm2(JHSThreeResultsTerm2 threeResultsTerm2) {
		threeResultssTerm2.setStudent_id(threeResultsTerm2.getStudent_id());
		threeResultssTerm2.setFirst_name(threeResultsTerm2.getFirst_name());
		threeResultssTerm2.setLast_name(threeResultsTerm2.getLast_name());
		threeResultssTerm2.setSubjects(threeResultsTerm2.getSubjects());
		threeResultssTerm2.setMarks(threeResultsTerm2.getMarks());
		threeResultssTerm2.setGrade(threeResultsTerm2.getGrade());
		rest.postForObject("http://localhost:9095/lowerPrimary/saveJHSThreeTerm2", threeResultssTerm2, PrimaryThreeResultsTerm2.class);

	}

	/*
	 * @Override public void savePrimaryThreeResultsTerm3(PrimaryThreeResultsTerm3
	 * threeResultsTerm3) {
	 * threeResultssTerm3.setStudent_id(threeResultsTerm3.getStudent_id());
	 * threeResultssTerm3.setFirst_name(threeResultsTerm3.getFirst_name());
	 * threeResultssTerm3.setLast_name(threeResultsTerm3.getLast_name());
	 * threeResultssTerm3.setSubjects(threeResultsTerm3.getSubjects());
	 * threeResultssTerm3.setMarks(threeResultsTerm3.getMarks());
	 * threeResultssTerm3.setGrade(threeResultsTerm3.getGrade());
	 * rest.postForObject(
	 * "http://localhost:9095/lowerPrimary/savePrimaryThreeTerm3",
	 * threeResultssTerm3, PrimaryThreeResultsTerm3.class);
	 * 
	 * }
	 */

	@Override
	public void updateJHSOneResults(JHSOneResults oneResults) {
		Map<String, Integer> updateOne = new HashMap<String, Integer>();
		updateOne.put("id", oneResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSOne", oneResults, updateOne);

	}

	@Override
	public void updateJHSOneResultsTerm1(JHSOneResultsTerm1 oneResultsTerm1) {
		Map<String, Integer> updateOneTerm1 = new HashMap<String, Integer>();
		updateOneTerm1.put("id", oneResultsTerm1.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSOneTerm1", oneResultsTerm1, updateOneTerm1);


	}

	@Override
	public void updateJHSOneResultsTerm2(JHSOneResultsTerm2 oneResultsTerm2) {
		Map<String, Integer> updateOneTerm2 = new HashMap<String, Integer>();
		updateOneTerm2.put("id", oneResultsTerm2.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updatePrimaryOneTerm2", oneResultsTerm2, updateOneTerm2);


	}

	/*
	 * @Override public void updateJHSOneResultsTerm3(JHSOneResultsTerm3
	 * oneResultsTerm3) { Map<String, Integer> updateOneTerm3 = new HashMap<String,
	 * Integer>(); updateOneTerm3.put("id", oneResultsTerm3.getResults_id());
	 * rest.put("http://localhost:9095/lowerPrimary/updateJHSOneTerm3",
	 * oneResultsTerm3, updateOneTerm3);
	 * 
	 * 
	 * }
	 */

	@Override
	public void updateJHSTwoResults(JHSTwoResults twoResults) {
		Map<String, Integer> updateTwo = new HashMap<String, Integer>();
		updateTwo.put("id", twoResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSTwo", twoResults, updateTwo);


	}

	@Override
	public void updateJHSTwoResultsTerm1(JHSTwoResultsTerm1 twoResultsTerm1) {
		Map<String, Integer> updateTwoTerm1 = new HashMap<String, Integer>();
		updateTwoTerm1.put("id", twoResultsTerm1.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSTwoTerm1", twoResultsTerm1, updateTwoTerm1);


	}

	@Override
	public void updateJHSTwoResultsTerm2(JHSTwoResultsTerm2 twoResultsTerm2) {
		Map<String, Integer> updateTwoTerm2 = new HashMap<String, Integer>();
		updateTwoTerm2.put("id", twoResultsTerm2.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSTwoTerm2", twoResultsTerm2, updateTwoTerm2);

	}

	/*
	 * @Override public void updateJHSTwoResultsTerm3(JHSTwoResultsTerm3
	 * twoResultsTerm3) { Map<String, Integer> updateTwoTerm3 = new HashMap<String,
	 * Integer>(); updateTwoTerm3.put("id", twoResultsTerm3.getResults_id());
	 * rest.put("http://localhost:9095/lowerPrimary/updateJHSTwoTerm1",
	 * twoResultsTerm3, updateTwoTerm3);
	 * 
	 * }
	 */
	@Override
	public void updateJHSThreeResults(JHSThreeResults threeResults) {
		Map<String, Integer> updateThree = new HashMap<String, Integer>();
		updateThree.put("id", threeResults.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSThree", threeResults, updateThree);

	}

	@Override
	public void updateJHSThreeResultsTerm1(JHSThreeResultsTerm1 threeResultsTerm1) {
		Map<String, Integer> updateThreeTerm1 = new HashMap<String, Integer>();
		updateThreeTerm1.put("id", threeResultsTerm1.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSThreeTerm1", threeResultsTerm1, updateThreeTerm1);

	}

	@Override
	public void updateJHSThreeResultsTerm2(JHSThreeResultsTerm2 threeResultsTerm2) {
		Map<String, Integer> updateThreeTerm2 = new HashMap<String, Integer>();
		updateThreeTerm2.put("id", threeResultsTerm2.getResults_id());
		rest.put("http://localhost:9095/lowerPrimary/updateJHSThreeTerm2", threeResultsTerm2, updateThreeTerm2);

	}

	/*
	 * @Override public void updateJHSThreeResultsTerm3(JHSThreeResultsTerm3
	 * threeResultsTerm3) { Map<String, Integer> updateThreeTerm3 = new
	 * HashMap<String, Integer>(); updateThreeTerm3.put("id",
	 * threeResultsTerm3.getResults_id());
	 * rest.put("http://localhost:9095/lowerPrimary/updateJHSTwoTerm3",
	 * threeResultsTerm3, updateThreeTerm3);
	 * 
	 * }
	 */

	@Override
	public void deleteJHSOneResults(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteJHSOneResultsTerm1(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteJHSOneResultsTerm2(Integer id) {
		// TODO Auto-generated method stub

	}

	/*
	 * @Override public void deleteJHSOneResultsTerm3(Integer id) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public void deleteJHSTwoResults(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteJHSTwoResultsTerm1(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteJHSTwoResultsTerm2(Integer id) {
		// TODO Auto-generated method stub

	}

	/*
	 * @Override public void deleteJHSTwoResultsTerm3(Integer id) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public void deleteJHSThreeResults(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteJHSThreeResultsTerm1(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteJHSThreeResultsTerm2(Integer id) {
		// TODO Auto-generated method stub

	}

	/*
	 * @Override public void deletePrimaryThreeResultsTerm3(Integer id) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public JHSOneResults[] getJHSOne(JHSOneResults oneResults) {
		JHSOneResults[] JHSOne = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSOne", JHSOneResults[].class);
		return JHSOne;
	}

	@Override
	public JHSOneResultsTerm1[] getJHSOneTerm1(JHSOneResultsTerm1 oneResultsTerm1) {
		JHSOneResultsTerm1[] JHSOneTerm1 = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSOneTerm1", JHSOneResultsTerm1[].class);
		return JHSOneTerm1;
	}

	@Override
	public JHSOneResultsTerm2[] getJHSOneTerm2(JHSOneResultsTerm2 oneResultsTerm2) {
		 
		JHSOneResultsTerm2[] JHSOneTerm2 = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSOneTerm2", JHSOneResultsTerm2[].class);
		return JHSOneTerm2;
	}

	/*
	 * @Override public JHSOneResultsTerm3[] getJHSOneTerm3(JHSOneResultsTerm3
	 * oneResultsTerm3) { JHSOneResultsTerm3[] JHSOneTerm3 =
	 * rest.getForObject("http://localhost:9095/lowerPrimary/getJHSOneTerm3",
	 * JHSOneResultsTerm3[].class); return JHSOneTerm3; }
	 */

	@Override
	public JHSTwoResults[] getJHSTwo(JHSTwoResults twoResults) {
		JHSTwoResults[] JHSTwo = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSTwo", JHSTwoResults[].class);
		return JHSTwo;
	}

	@Override
	public JHSTwoResultsTerm1[] getJHSTwoTerm1(JHSTwoResultsTerm1 twoResultsTerm1) {
		JHSTwoResultsTerm1[] JHSTwoTerm1 = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSTwoTerm1", JHSTwoResultsTerm1[].class);
		return JHSTwoTerm1;
	}

	@Override
	public JHSTwoResultsTerm2[] getJHSTwoTerm2(JHSTwoResultsTerm2 twoResultsTerm2) {
		JHSTwoResultsTerm2[] JHSTwoTerm2 = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSTwoTerm2", JHSTwoResultsTerm2[].class);
		return JHSTwoTerm2;
	}

	/*
	 * @Override public JHSTwoResultsTerm3[] getJHSTwoTerm3(JHSTwoResultsTerm3
	 * twoResultsTerm3) { JHSTwoResultsTerm3[] JHSTwoTerm3 =
	 * rest.getForObject("http://localhost:9095/lowerPrimary/getJHSTwoTerm3",
	 * PrimaryTwoResultsTerm3[].class); return JHSTwoTerm3; }
	 */

	@Override
	public JHSThreeResults[] getJHSThree(JHSThreeResults threeResults) {
		JHSThreeResults[] primaryThree = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSThree", JHSThreeResults[].class);
		return primaryThree;
	}

	@Override
	public JHSThreeResultsTerm1[] getJHSThreeTerm1(JHSThreeResultsTerm1 threeResultsTerm1) {
		JHSThreeResultsTerm1[] JHSThreeTerm1 = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSThreeTerm1", JHSThreeResultsTerm1[].class);
		return JHSThreeTerm1;
	}

	@Override
	public JHSThreeResultsTerm2[] getJHSThreeTerm2(JHSThreeResultsTerm2 threeResultsTerm2) {
		JHSThreeResultsTerm2[] primaryThreeTerm2 = rest.getForObject("http://localhost:9095/lowerPrimary/getJHSThreeTerm2", JHSThreeResultsTerm2[].class);
		return primaryThreeTerm2;
	}

	/*
	 * @Override public JHSThreeResultsTerm3[]
	 * getJHSThreeTerm3(PrimaryThreeResultsTerm3 threeResultsTerm3) {
	 * JHSThreeResultsTerm3[] primaryThreeTerm3 =
	 * rest.getForObject("http://localhost:9095/lowerPrimary/getJHSThreeTerm3",
	 * PrimaryThreeResultsTerm3[].class); return primaryThreeTerm3; }
	 */

}
