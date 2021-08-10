package com.school.system.front.end.integration;

import com.school.system.front.end.integration.dto.Parents;

public interface ParentsRestClient {
	
	public void saveParent(Parents parents);
	public void updateParent(Parents parents);
	public void deleteParent(Integer id);
	public void deleteAll(Parents parents);
	public Parents[] getAllParents(Parents parents);
	public Parents findById(Integer id);
	public Parents findLastId(Parents students);

}
