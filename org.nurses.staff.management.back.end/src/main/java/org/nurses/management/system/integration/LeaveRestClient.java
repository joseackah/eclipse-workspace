package org.nurses.management.system.integration;

import org.nurses.management.system.integration.dto.Leave;

public interface LeaveRestClient {
	
	public void saveLeave(Leave leave);
	public void updateLeave( Leave leave);
	public void deleteLeave(Integer id);
	public void deleteAll( Leave leave);
	public Leave [] getAllLeave( Leave leave);
	public Leave  find(Integer id);
	
	public Leave[] femaleSurgical();

	
	public Leave[] femaleMedical();

	
	public Leave[] maleSurgical();

	
	public Leave[] maleMedical();

	
	public Leave[] childrenWard();

	
	public Leave[] maternity();

	
	public Leave[] generalWard();

	
	public Leave[] nicu();

	
	public Leave[] religious();

	
	public Leave[] accident();
	
	public Leave[] opd();


}
