package org.nurses.management.system.integration;

import java.util.List;

import org.nurses.management.system.integration.dto.Pin_Ain;

public interface Pin_Ain_RestClient {
	
	
	public void savePinAin(Pin_Ain pin_Ain);
	public void updatePinAin( Pin_Ain pin_Ain);
	public void deletePinAin(Integer id);
	public void deleteAllPinAin( Pin_Ain pin_Ain);
	public Pin_Ain [] getAllPinAin( Pin_Ain pin_Ain);
	public Pin_Ain  find(Integer id);
	
	public List<Pin_Ain> saveAll(List<Pin_Ain> pin);

}
