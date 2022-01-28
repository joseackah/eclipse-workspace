package org.nurses.management.system.repos;

import java.util.List;

import org.nurses.management.system.entity.Ward_Bed_State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Ward_Bed_StateRepository extends JpaRepository<Ward_Bed_State, Integer> {
	
	
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'Male Medical'", nativeQuery=true)
	public List<Ward_Bed_State> maleMedical();
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'Female Surgical'", nativeQuery=true)
	public List<Ward_Bed_State> femaleSurgical();
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'Male Surgical'", nativeQuery=true)
	public List<Ward_Bed_State> maleSurgical();
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'Childrens Ward';", nativeQuery=true)
	public List<Ward_Bed_State> childrens();
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'Maternity'", nativeQuery=true)
	public List<Ward_Bed_State> maternity();
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'General Ward'", nativeQuery=true)
	public List<Ward_Bed_State> generalWard();
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'NICU'", nativeQuery=true)
	public List<Ward_Bed_State> nicu();
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'Religious Ward'", nativeQuery=true)
	public List<Ward_Bed_State> religious();
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'Accident/Emergency'", nativeQuery=true)
	public List<Ward_Bed_State> accident();
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'Female Medical'", nativeQuery=true)
	public List<Ward_Bed_State> femaleMedical();
	
	@Query(value = "select * from Ward_Bed_State where ward_name = 'Outpatient Department'", nativeQuery=true)
	public List<Ward_Bed_State> opd();
	
	
	
	
	
	@Query(value = "select  sum(total_remain_at_midnight) from "
			+ "ward_bed_state where date = curdate() - 1;", 
			nativeQuery = true)
	public String countRemainAtMidnight();
	
	
	@Query(value = "select  sum(total_critical_ill) from "
			+ "ward_bed_state where date = curdate() - 1;", 
			nativeQuery = true)
	public String countTotalCriticalIll();
	
	
	@Query(value = "select  sum(total_floor_patient) from "
			+ "ward_bed_state where date = curdate() - 1;", 
			nativeQuery = true)
	public String countTotalFloorPatient();
	
	
	@Query(value = "select  sum(total_absconded) from "
			+ "ward_bed_state where date = curdate() - 1;", 
			nativeQuery = true)
	public String countAbsconded();
	
	

}
