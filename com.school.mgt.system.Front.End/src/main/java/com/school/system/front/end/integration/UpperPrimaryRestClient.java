package com.school.system.front.end.integration;

import com.school.system.front.end.integration.dto.UpperPrimaryResults;

public interface UpperPrimaryRestClient {
	
	public void savePrimaryFourResults(UpperPrimaryResults fourResults);
	
	
	public void deletePrimaryFourResults(Integer id);
	
	
	public  UpperPrimaryResults[] getPrimaryFour(UpperPrimaryResults fourResults);


	public void updatePrimaryFourResults(UpperPrimaryResults fourResults);
	
}
