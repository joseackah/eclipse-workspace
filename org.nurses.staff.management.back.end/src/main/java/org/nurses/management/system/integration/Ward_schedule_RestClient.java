package org.nurses.management.system.integration;

import org.nurses.management.system.integration.dto.Ward_schedule;

public interface Ward_schedule_RestClient {
	
	
	public void saveWardSchedule(Ward_schedule wardSchedule);
	public void updateWardSchedule( Ward_schedule wardSchedule);
	public void deleteWardSchedule(Integer id);
	public void deleteAllWardSchedule(Ward_schedule wardSchedule);
	public Ward_schedule [] getAllWardSchedule(Ward_schedule wardSchedule);
	public Ward_schedule  find(Integer id);
	
	
public Ward_schedule[] maleMedical();
	
	public Ward_schedule[] femaleSurgical();
	
	public Ward_schedule[] maleSurgical();
	
	public Ward_schedule[] childrens();
	
	public Ward_schedule[] maternity();
	
	public Ward_schedule[] generalWard();
	
	public Ward_schedule[] nicu();
	
	public Ward_schedule[] religious();
	
	public Ward_schedule[] accident();
	
	public Ward_schedule[] femaleMedical();
	
	public Ward_schedule[] opd();
	
	
	
/* counting number of nurses in a particular ward */
	
	public String countNurseInMaternity();
	public String countNurseInMaleMedical();
	public String countNurseInMaleSurgical();
	public String countNurseInFemaleMedical();
	public String countNurseInFemaleSurgical();
	public String countNurseInReligiousWard();
	public String countNurseInChildrensWard();
	public String countNurseInGeneralWard();
	public String countNurseInNICU();
	public String countNurseInOpd();
	public String countNurseInAccidentEmergency();

}
