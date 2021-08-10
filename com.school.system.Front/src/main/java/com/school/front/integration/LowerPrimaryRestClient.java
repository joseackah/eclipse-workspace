package com.school.front.integration;

import com.school.front.integration.dto.PrimaryOneResults;
import com.school.front.integration.dto.PrimaryThreeResults;
import com.school.front.integration.dto.PrimaryTwoResults;

public interface LowerPrimaryRestClient {
	
	public void savePrimaryOneResults(PrimaryOneResults oneResults);
	
	public void savePrimaryTwoResults(PrimaryTwoResults twoResults);
	
	public void savePrimaryThreeResults(PrimaryThreeResults threeResults);
	
	public void updatePrimaryOneResults(PrimaryOneResults oneResults);
	
	public void updatePrimaryTwoResults(PrimaryTwoResults twoResults);
	
	public void updatePrimaryThreeResults(PrimaryThreeResults threeResults);
	
	
	public void deletePrimaryOneResults(Integer id);
	
	public void deletePrimaryTwoResults(Integer id);
	
	public void deletePrimaryThreeResults(Integer id);
	
	
	public  PrimaryOneResults[] getPrimaryOne(PrimaryOneResults oneResults);
	
	public PrimaryTwoResults[] getPrimaryTwo(PrimaryTwoResults twoResults);
	
	public  PrimaryThreeResults[] getPrimaryThree(PrimaryThreeResults threeResults);
	
	
	

}
