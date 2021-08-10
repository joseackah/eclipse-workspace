package com.school.system.front.end.integration;

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

public interface UpperPrimaryRestClient {
	
	public void savePrimaryFourResults(PrimaryFourResults fourResults);
	public void savePrimaryFourResultsTerm1(PrimaryFourResultsTerm1 fourResultsTerm1);
	public void savePrimaryFourResultsTerm2(PrimaryFourResultsTerm2 fourResultsTerm2);
	public void savePrimaryFourResultsTerm3(PrimaryFourResultsTerm3 fourResultsTerm3);
	
	public void savePrimaryFiveResults(PrimaryFiveResults fiveResults);
	public void savePrimaryFiveResultsTerm1(PrimaryFiveResultsTerm1 fiveResultsTerm1);
	public void savePrimaryFiveResultsTerm2(PrimaryFiveResultsTerm2 fiveResultsTerm2);
	public void savePrimaryFiveResultsTerm3(PrimaryFiveResultsTerm3 fiveResultsTerm3);
	
	public void savePrimarySixResults(PrimarySixResults sixResults);
	public void savePrimarySixResultsTerm1(PrimarySixResultsTerm1 sixResultsTerm1);
	public void savePrimarySixResultsTerm2(PrimarySixResultsTerm2 sixResultsTerm2);
	public void savePrimarySixResultsTerm3(PrimarySixResultsTerm3 sixResultsTerm3);
	
	public void updatePrimaryFourResults(PrimaryFourResults fourResults);
	public void updatePrimaryFourResultsTerm1(PrimaryFourResultsTerm1 fourResultsTerm1);
	public void updatePrimaryFourResultsTerm2(PrimaryFourResultsTerm2 fourResultsTerm2);
	public void updatePrimaryFourResultsTerm3(PrimaryFourResultsTerm3 fourResultsTerm3);
	
	public void updatePrimaryFiveResults(PrimaryFiveResults twoResults);
	public void updatePrimaryFiveResultsTerm1(PrimaryFiveResultsTerm1 fiveResultsTerm1);
	public void updatePrimaryFiveResultsTerm2(PrimaryFiveResultsTerm2 fiveResultsTerm2);
	public void updatePrimaryFiveResultsTerm3(PrimaryFiveResultsTerm3 fiveResultsTerm3);
	
	public void updatePrimarySixResults(PrimarySixResults sixResults);
	public void updatePrimarySixResultsTerm1(PrimarySixResultsTerm1 sixResultsTerm1);
	public void updatePrimarySixResultsTerm2(PrimarySixResultsTerm2 sixResultsTerm2);
	public void updatePrimarySixResultsTerm3(PrimarySixResultsTerm3 sixResultsTerm3);
	
	
	public void deletePrimaryFourResults(Integer id);
	public void deletePrimaryFourResultsTerm1(Integer id);
	public void deletePrimaryFourResultsTerm2( Integer id);
	public void deletePrimaryFourResultsTerm3(Integer id);
	
	public void deletePrimaryFiveResults(Integer id);
	public void deletePrimaryFiveResultsTerm1(Integer id);
	public void deletePrimaryFiveResultsTerm2(Integer id);
	public void deletePrimaryFiveResultsTerm3(Integer id);
	
	public void deletePrimarySixResults(Integer id);
	public void deletePrimarySixResultsTerm1(Integer id);
	public void deletePrimarySixResultsTerm2(Integer id);
	public void deletePrimarySixResultsTerm3(Integer id);
	
	
	public  PrimaryFourResults[] getPrimaryFour(PrimaryFourResults fourResults);
	public  PrimaryFourResultsTerm1[] getPrimaryFourTerm1(PrimaryFourResultsTerm1 fourResultsTerm1);
	public  PrimaryFourResultsTerm2[] getPrimaryFourTerm2(PrimaryFourResultsTerm2 fourResultsTerm2);
	public  PrimaryFourResultsTerm3[] getPrimaryFourTerm3(PrimaryFourResultsTerm3 fourResultsTerm3);
	
	public PrimaryFiveResults[] getPrimaryFive(PrimaryFiveResults twoResults);
	public PrimaryFiveResultsTerm1[] getPrimaryFiveTerm1(PrimaryFiveResultsTerm1 fiveResultsTerm1);
	public  PrimaryFiveResultsTerm2[] getPrimaryFiveTerm2(PrimaryFiveResultsTerm2 fiveResultsTerm2);
	public  PrimaryFiveResultsTerm3[] getPrimaryFiveTerm3(PrimaryFiveResultsTerm3 fiveResultsTerm3);
	
	public  PrimarySixResults[] getPrimarySix(PrimarySixResults sixResults);
	public  PrimarySixResultsTerm1[] getPrimarySixTerm1(PrimarySixResultsTerm1 sixResultsTerm1);
	public PrimarySixResultsTerm2[] getPrimarySixTerm2(PrimarySixResultsTerm2 sixResultsTerm2);
	public  PrimarySixResultsTerm3[] getPrimarySixTerm3(PrimarySixResultsTerm3 sixResultsTerm3);

}
