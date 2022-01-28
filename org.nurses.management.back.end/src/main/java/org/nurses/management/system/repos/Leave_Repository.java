package org.nurses.management.system.repos;

import java.util.List;

import org.nurses.management.system.entity.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Leave_Repository extends JpaRepository<Leave, Integer> {
	
	
	/*
	 * @Query(value="select * from leave_table where ward_name = ward_name",
	 * nativeQuery=true) public List<String> wardLeave(String name);
	 */
	
	@Query(value="select * from leave_table where ward_name = 'Female Surgical'", nativeQuery=true)
	public List<Leave> femaleSurgical();

	
	@Query(value="select * from leave_table where ward_name = 'Female Medical'", nativeQuery=true)
	public List<Leave> femaleMedical();

	
	@Query(value="select * from leave_table where ward_name = 'Male Surgical'", nativeQuery=true)
	public List<Leave> maleSurgical();

	
	@Query(value="select * from leave_table where ward_name = 'Male Medical'", nativeQuery=true)
	public List<Leave> maleMedical();

	
	@Query(value="select * from leave_table where ward_name = 'Childrens Ward'", nativeQuery=true)
	public List<Leave> childrenWard();

	
	@Query(value="select * from leave_table where ward_name = 'maternity'", nativeQuery=true)
	public List<Leave> maternity();

	
	@Query(value="select * from leave_table where ward_name = 'General Ward'", nativeQuery=true)
	public List<Leave> generalWard();

	
	@Query(value="select * from leave_table where ward_name = 'NICU'", nativeQuery=true)
	public List<Leave> nicu();

	
	@Query(value="select * from leave_table where ward_name = 'Religious Ward'", nativeQuery=true)
	public List<Leave> religious();

	
	@Query(value="select * from leave_table where ward_name = 'Accident/Emergency'", nativeQuery=true)
	public List<Leave> accident();
	
	@Query(value = "select * from leave_table where ward_name = 'Outpatient Department'", nativeQuery=true)
	public List<Leave> opd();

	
	

}
