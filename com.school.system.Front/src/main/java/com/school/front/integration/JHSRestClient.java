package com.school.front.integration;

import com.school.front.integration.dto.JHSOneResults;
import com.school.front.integration.dto.JHSThreeResults;
import com.school.front.integration.dto.JHSTwoResults;

public interface JHSRestClient {
	
	public void saveJHSOneResults(JHSOneResults oneResults);
	
	
	public void saveJHSTwoResults(JHSTwoResults twoResults);
	
	
	public void saveJHSThreeResults(JHSThreeResults threeResults);
	
	
	public void updateJHSOneResults(JHSOneResults oneResults);
	
	
	public void updateJHSTwoResults(JHSTwoResults twoResults);
	
	
	public void updateJHSThreeResults(JHSThreeResults threeResults);
	
	
	
	public void deleteJHSOneResults(Integer id);
	
	
	public void deleteJHSTwoResults(Integer id);
	
	
	public void deleteJHSThreeResults(Integer id);
	
	
	
	public  JHSOneResults[] getJHSOne(JHSOneResults oneResults);
	
	
	public JHSTwoResults[] getJHSTwo(JHSTwoResults twoResults);
	
	
	public  JHSThreeResults[] getJHSThree(JHSThreeResults threeResults);
	

}
