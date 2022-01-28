package org.nurses.management.system.repos;

import java.util.List;

import org.nurses.management.system.entity.Ward_schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Ward_schedule_Repository extends JpaRepository<Ward_schedule, Integer> {
	
	@Query(value="select * from Ward_schedule where ward_name = 'Female Surgical'", nativeQuery=true)
	public List<Ward_schedule> femaleSurgical();

	
	@Query(value="select * from Ward_schedule where ward_name = 'Female Medical'", nativeQuery=true)
	public List<Ward_schedule> femaleMedical();

	
	@Query(value="select * from Ward_schedule where ward_name = 'Male Surgical'", nativeQuery=true)
	public List<Ward_schedule> maleSurgical();

	
	@Query(value="select * from Ward_schedule where ward_name = 'Male Medical'", nativeQuery=true)
	public List<Ward_schedule> maleMedical();

	
	@Query(value="select * from Ward_schedule where ward_name = 'Childrens Ward'", nativeQuery=true)
	public List<Ward_schedule> childrenWard();

	
	@Query(value="select * from Ward_schedule where ward_name = 'maternity'", nativeQuery=true)
	public List<Ward_schedule> maternity();

	
	@Query(value="select * from Ward_schedule where ward_name = 'General Ward'", nativeQuery=true)
	public List<Ward_schedule> generalWard();

	
	@Query(value="select * from Ward_schedule where ward_name = 'NICU'", nativeQuery=true)
	public List<Ward_schedule> nicu();

	
	@Query(value="select * from Ward_schedule where ward_name = 'religious Ward'", nativeQuery=true)
	public List<Ward_schedule> religious();

	
	@Query(value="select * from Ward_schedule where ward_name = 'Accident/Emergency'", nativeQuery=true)
	public List<Ward_schedule> accident();
	
	@Query(value = "select * from Ward_schedule where ward_name = 'Outpatient Department'", nativeQuery=true)
	public List<Ward_schedule> opd();


}
