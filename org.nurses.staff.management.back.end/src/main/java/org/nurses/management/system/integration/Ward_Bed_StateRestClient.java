package org.nurses.management.system.integration;

import org.nurses.management.system.integration.dto.Ward_Bed_State;

public interface Ward_Bed_StateRestClient {
	
	public void saveWard_Bed_State(Ward_Bed_State bedState);
	public void updateWard_Bed_State( Ward_Bed_State bedState);
	public void deleteWard_Bed_State(Integer id);
	public void deleteAllWard_Bed_State( Ward_Bed_State bedState);
	public Ward_Bed_State [] getAllWard_Bed_State( Ward_Bed_State bedState);
	public Ward_Bed_State  find(Integer id);
	
	
	
	public Ward_Bed_State[] maleMedical();
	
	public Ward_Bed_State[] femaleSurgical();
	
	public Ward_Bed_State[] maleSurgical();
	
	public Ward_Bed_State[] childrens();
	
	public Ward_Bed_State[] maternity();
	
	public Ward_Bed_State[] generalWard();
	
	public Ward_Bed_State[] nicu();
	
	public Ward_Bed_State[] religious();
	
	public Ward_Bed_State[] accident();
	
	public Ward_Bed_State[] femaleMedical();
	
	public Ward_Bed_State[] opd();
	
	
	/**/ 

	
	
	
	
	public String countRemainAtMidnight();
	
	
	
	public String countTotalCriticalIll();
	
	
	
	public String countTotalFloorPatient();
	
	
	
	public String countAbsconded();
}
