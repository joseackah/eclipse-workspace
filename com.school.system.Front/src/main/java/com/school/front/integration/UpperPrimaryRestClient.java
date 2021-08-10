package com.school.front.integration;

import com.school.front.integration.dto.PrimaryFiveResults;
import com.school.front.integration.dto.PrimaryFourResults;
import com.school.front.integration.dto.PrimarySixResults;

public interface UpperPrimaryRestClient {
	
	public void savePrimaryFourResults(PrimaryFourResults fourResults);
	
	public void savePrimaryFiveResults(PrimaryFiveResults fiveResults);
	
	public void savePrimarySixResults(PrimarySixResults sixResults);
	
	public void updatePrimaryFourResults(PrimaryFourResults fourResults);
	
	public void updatePrimaryFiveResults(PrimaryFiveResults twoResults);
	
	public void updatePrimarySixResults(PrimarySixResults sixResults);
	
	
	public void deletePrimaryFourResults(Integer id);
	
	public void deletePrimaryFiveResults(Integer id);
	
	public void deletePrimarySixResults(Integer id);
	
	
	public  PrimaryFourResults[] getPrimaryFour(PrimaryFourResults fourResults);
	
	public PrimaryFiveResults[] getPrimaryFive(PrimaryFiveResults twoResults);
	
	public  PrimarySixResults[] getPrimarySix(PrimarySixResults sixResults);
	
}
