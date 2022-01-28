package org.nurses.management.system.integration;

import org.nurses.management.system.integration.dto.Nurses_staff;

public interface Nurses_staff_RestClient {
	
	
	
	public void saveNursesStaff(Nurses_staff nursesStaff);
	public void updateNursesStaff( Nurses_staff nursesStaff);
	public void deleteNursesStaff(Integer id);
	public void deleteAllNursesStaff( Nurses_staff nursesStaff);
	public Nurses_staff [] getAllNursesStaff( Nurses_staff nursesStaff);
	public Nurses_staff  findNursesStaff(Integer id);
	
	
	public String countNurses();
	
	public String countMaleNurses();
	public String countFemaleNurses();

}
