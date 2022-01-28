package org.nurses.management.system.repos;

import org.nurses.management.system.entity.Nurses_staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Nurses_staff_Repository extends JpaRepository<Nurses_staff, Integer> {
	
	
	@Query(value="select count(*) from nurses_staff;", nativeQuery=true)
	public String countNurses();
	
	@Query(value="select count(*) from nurses_staff where sex = 'male'", nativeQuery = true)
	public String countMaleNurses();
	@Query(value="select count(*) from nurses_staff where sex = 'female'", nativeQuery = true)
	public String countFemaleNurses();
	

}
