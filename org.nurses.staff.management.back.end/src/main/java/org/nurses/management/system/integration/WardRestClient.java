package org.nurses.management.system.integration;

import org.nurses.management.system.integration.dto.Ward;

public interface WardRestClient {
	
	
	public void saveWard(Ward ward);
	public void updateWard( Ward ward);
	public void deleteWard(Ward ward);
	public void deleteById( Integer id);
	public Ward [] getAllWard( Ward ward);
	public Ward  findById(Integer id);
	
	
	public String bedCapacity();

}
