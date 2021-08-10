package com.school.system.front.end.integration;

import com.school.system.front.end.integration.dto.JHSOneResults;
import com.school.system.front.end.integration.dto.JHSOneResultsTerm1;
import com.school.system.front.end.integration.dto.JHSOneResultsTerm2;
import com.school.system.front.end.integration.dto.JHSThreeResults;
import com.school.system.front.end.integration.dto.JHSThreeResultsTerm1;
import com.school.system.front.end.integration.dto.JHSThreeResultsTerm2;
import com.school.system.front.end.integration.dto.JHSTwoResults;
import com.school.system.front.end.integration.dto.JHSTwoResultsTerm1;
import com.school.system.front.end.integration.dto.JHSTwoResultsTerm2;

public interface JHSRestClient {
	
	public void saveJHSOneResults(JHSOneResults oneResults);
	public void saveJHSOneResultsTerm1(JHSOneResultsTerm1 oneResultsTerm1);
	public void saveJHSOneResultsTerm2(JHSOneResultsTerm2 oneResultsTerm2);
	
	
	public void saveJHSTwoResults(JHSTwoResults twoResults);
	public void saveJHSTwoResultsTerm1(JHSTwoResultsTerm1 twoResultsTerm1);
	public void saveJHSTwoResultsTerm2(JHSTwoResultsTerm2 twoResultsTerm2);
	
	
	public void saveJHSThreeResults(JHSThreeResults threeResults);
	public void saveJHSThreeResultsTerm1(JHSThreeResultsTerm1 threeResultsTerm1);
	public void saveJHSThreeResultsTerm2(JHSThreeResultsTerm2 threeResultsTerm2);
	
	
	public void updateJHSOneResults(JHSOneResults oneResults);
	public void updateJHSOneResultsTerm1(JHSOneResultsTerm1 oneResultsTerm1);
	public void updateJHSOneResultsTerm2(JHSOneResultsTerm2 oneResultsTerm2);
	
	
	public void updateJHSTwoResults(JHSTwoResults twoResults);
	public void updateJHSTwoResultsTerm1(JHSTwoResultsTerm1 twoResultsTerm1);
	public void updateJHSTwoResultsTerm2(JHSTwoResultsTerm2 twoResultsTerm2);
	
	
	public void updateJHSThreeResults(JHSThreeResults threeResults);
	public void updateJHSThreeResultsTerm1(JHSThreeResultsTerm1 threeResultsTerm1);
	public void updateJHSThreeResultsTerm2(JHSThreeResultsTerm2 threeResultsTerm2);
	
	
	
	public void deleteJHSOneResults(Integer id);
	public void deleteJHSOneResultsTerm1(Integer id);
	public void deleteJHSOneResultsTerm2( Integer id);
	
	
	public void deleteJHSTwoResults(Integer id);
	public void deleteJHSTwoResultsTerm1(Integer id);
	public void deleteJHSTwoResultsTerm2(Integer id);
	
	
	public void deleteJHSThreeResults(Integer id);
	public void deleteJHSThreeResultsTerm1(Integer id);
	public void deleteJHSThreeResultsTerm2(Integer id);
	
	
	
	public  JHSOneResults[] getJHSOne(JHSOneResults oneResults);
	public  JHSOneResultsTerm1[] getJHSOneTerm1(JHSOneResultsTerm1 oneResultsTerm1);
	public  JHSOneResultsTerm2[] getJHSOneTerm2(JHSOneResultsTerm2 oneResultsTerm2);
	
	
	public JHSTwoResults[] getJHSTwo(JHSTwoResults twoResults);
	public JHSTwoResultsTerm1[] getJHSTwoTerm1(JHSTwoResultsTerm1 twoResultsTerm1);
	public  JHSTwoResultsTerm2[] getJHSTwoTerm2(JHSTwoResultsTerm2 twoResultsTerm2);
	
	
	public  JHSThreeResults[] getJHSThree(JHSThreeResults threeResults);
	public  JHSThreeResultsTerm1[] getJHSThreeTerm1(JHSThreeResultsTerm1 threeResultsTerm1);
	public JHSThreeResultsTerm2[] getJHSThreeTerm2(JHSThreeResultsTerm2 threeResultsTerm2);
	

}
