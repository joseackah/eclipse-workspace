package com.school.system.front.end.integration;

import com.school.system.front.end.integration.dto.LowerPrimaryResults;

public interface LowerPrimaryRestClient {
	
	public void savePrimaryOneResults(LowerPrimaryResults oneResults);
	
	
	public void updatePrimaryOneResults(LowerPrimaryResults oneResults);
	
	
	public void deletePrimaryOneResults(Integer id);
	
	
	public  LowerPrimaryResults[] getPrimaryOne(LowerPrimaryResults oneResults);
	
	

}
