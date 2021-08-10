package com.school.system.front.end.integration;

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

public interface LowerPrimaryRestClient {
	
	public void savePrimaryOneResults(PrimaryOneResults oneResults);
	public void savePrimaryOneResultsTerm1(PrimaryOneResultsTerm1 oneResultsTerm1);
	public void savePrimaryOneResultsTerm2(PrimaryOneResultsTerm2 oneResultsTerm2);
	public void savePrimaryOneResultsTerm3(PrimaryOneResultsTerm3 oneResultsTerm3);
	
	public void savePrimaryTwoResults(PrimaryTwoResults twoResults);
	public void savePrimaryTwoResultsTerm1(PrimaryTwoResultsTerm1 twoResultsTerm1);
	public void savePrimaryTwoResultsTerm2(PrimaryTwoResultsTerm2 twoResultsTerm2);
	public void savePrimaryTwoResultsTerm3(PrimaryTwoResultsTerm3 twoResultsTerm3);
	
	public void savePrimaryThreeResults(PrimaryThreeResults threeResults);
	public void savePrimaryThreeResultsTerm1(PrimaryThreeResultsTerm1 threeResultsTerm1);
	public void savePrimaryThreeResultsTerm2(PrimaryThreeResultsTerm2 threeResultsTerm2);
	public void savePrimaryThreeResultsTerm3(PrimaryThreeResultsTerm3 threeResultsTerm3);
	
	public void updatePrimaryOneResults(PrimaryOneResults oneResults);
	public void updatePrimaryOneResultsTerm1(PrimaryOneResultsTerm1 oneResultsTerm1);
	public void updatePrimaryOneResultsTerm2(PrimaryOneResultsTerm2 oneResultsTerm2);
	public void updatePrimaryOneResultsTerm3(PrimaryOneResultsTerm3 oneResultsTerm3);
	
	public void updatePrimaryTwoResults(PrimaryTwoResults twoResults);
	public void updatePrimaryTwoResultsTerm1(PrimaryTwoResultsTerm1 twoResultsTerm1);
	public void updatePrimaryTwoResultsTerm2(PrimaryTwoResultsTerm2 twoResultsTerm2);
	public void updatePrimaryTwoResultsTerm3(PrimaryTwoResultsTerm3 twoResultsTerm3);
	
	public void updatePrimaryThreeResults(PrimaryThreeResults threeResults);
	public void updatePrimaryThreeResultsTerm1(PrimaryThreeResultsTerm1 threeResultsTerm1);
	public void updatePrimaryThreeResultsTerm2(PrimaryThreeResultsTerm2 threeResultsTerm2);
	public void updatePrimaryThreeResultsTerm3(PrimaryThreeResultsTerm3 threeResultsTerm3);
	
	
	public void deletePrimaryOneResults(Integer id);
	public void deletePrimaryOneResultsTerm1(Integer id);
	public void deletePrimaryOneResultsTerm2( Integer id);
	public void deletePrimaryOneResultsTerm3(Integer id);
	
	public void deletePrimaryTwoResults(Integer id);
	public void deletePrimaryTwoResultsTerm1(Integer id);
	public void deletePrimaryTwoResultsTerm2(Integer id);
	public void deletePrimaryTwoResultsTerm3(Integer id);
	
	public void deletePrimaryThreeResults(Integer id);
	public void deletePrimaryThreeResultsTerm1(Integer id);
	public void deletePrimaryThreeResultsTerm2(Integer id);
	public void deletePrimaryThreeResultsTerm3(Integer id);
	
	
	public  PrimaryOneResults[] getPrimaryOne(PrimaryOneResults oneResults);
	public  PrimaryOneResultsTerm1[] getPrimaryOneTerm1(PrimaryOneResultsTerm1 oneResultsTerm1);
	public  PrimaryOneResultsTerm2[] getPrimaryOneTerm2(PrimaryOneResultsTerm2 oneResultsTerm2);
	public  PrimaryOneResultsTerm3[] getPrimaryOneTerm3(PrimaryOneResultsTerm3 oneResultsTerm3);
	
	public PrimaryTwoResults[] getPrimaryTwo(PrimaryTwoResults twoResults);
	public PrimaryTwoResultsTerm1[] getPrimaryTwoTerm1(PrimaryTwoResultsTerm1 twoResultsTerm1);
	public  PrimaryTwoResultsTerm2[] getPrimaryTwoTerm2(PrimaryTwoResultsTerm2 twoResultsTerm2);
	public  PrimaryTwoResultsTerm3[] getPrimaryTwoTerm3(PrimaryTwoResultsTerm3 twoResultsTerm3);
	
	public  PrimaryThreeResults[] getPrimaryThree(PrimaryThreeResults threeResults);
	public  PrimaryThreeResultsTerm1[] getPrimaryThreeTerm1(PrimaryThreeResultsTerm1 threeResultsTerm1);
	public PrimaryThreeResultsTerm2[] getPrimaryThreeTerm2(PrimaryThreeResultsTerm2 threeResultsTerm2);
	public  PrimaryThreeResultsTerm3[] getPrimaryThreeTerm3(PrimaryThreeResultsTerm3 threeResultsTerm3);
	
	
	

}
