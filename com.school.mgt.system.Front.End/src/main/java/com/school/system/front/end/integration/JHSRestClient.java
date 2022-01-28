package com.school.system.front.end.integration;

import com.school.system.front.end.integration.dto.JHSResults;

public interface JHSRestClient {
	
	public void saveJHSOneResults(JHSResults oneResults);
	
	
	public void updateJHSOneResults(JHSResults oneResults);
	
	
	
	public void deleteJHSOneResults(Integer id);
	
	
	
	public  JHSResults[] getJHSOne(JHSResults oneResults);
	
	
	

}
