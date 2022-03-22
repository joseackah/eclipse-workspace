package org.nurses.management.system.repos;

import java.util.List;

import org.nurses.management.system.entity.Admission_Discharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Admission_DischargeRepository extends JpaRepository<Admission_Discharge, Integer> {
	
	@Query(value = "select * from admission_discharge where ward_name = ?", nativeQuery = true)
	public Admission_Discharge wardSummary(String ward_name);

	@Query(value = "select * from nursesdb.admission_discharge;", nativeQuery = true)
	public List<Admission_Discharge> admissionOnly();

	@Query(value = "select * from nursesdb.admission_discharge;", nativeQuery = true)
	public List<Admission_Discharge> dischargeOnly();
	
	
	@Query(value = "select * from admission_discharge where outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> deathOnly();
	
	
	/* @Query(value = "select * from deliveryRepos where ward_name= ward_name;") */
	
	/* Admission_Discharge 1findByWard_name(String name); */
	@Query(value = "select * from admission_discharge where ward_name= ward_name;", nativeQuery=true)
	public List<Admission_Discharge> findByward_nameName(String name);
	
	@Query(value = "select * from admission_discharge where outcome_of_admission= 'Discharge';", nativeQuery=true)
	public List<Admission_Discharge> findBywardDischarge();
	
	@Query(value= "select id, ward_name, patient_number, patient_name, sex, date_admitted, address, diagnosis, phone_number, outcome_of_admission,final_diagnosis, next_of_kin, next_of_kin_number, insured,insurance_number, date_discharge, age from admission_discharge where outcome_of_admission = outcome_of_admission;", nativeQuery = true)
	public List<Admission_Discharge> discharge();
	
	
	/*>>>>>>>>>>>>>>>>>>===================Admissions======================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	
	
	@Query(value = "select * from admission_discharge where ward_name = 'Male Medical'", nativeQuery=true)
	public List<Admission_Discharge> maleMedical();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Female Surgical'", nativeQuery=true)
	public List<Admission_Discharge> femaleSurgical();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Male Surgical'", nativeQuery=true)
	public List<Admission_Discharge> maleSurgical();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Childrens Ward';", nativeQuery=true)
	public List<Admission_Discharge> childrens();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Maternity'", nativeQuery=true)
	public List<Admission_Discharge> maternity();
	
	@Query(value = "select * from admission_discharge where ward_name = 'General Ward'", nativeQuery=true)
	public List<Admission_Discharge> generalWard();
	
	@Query(value = "select * from admission_discharge where ward_name = 'NICU'", nativeQuery=true)
	public List<Admission_Discharge> nicu();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Religious Ward'", nativeQuery=true)
	public List<Admission_Discharge> religious();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Accident/Emergency'", nativeQuery=true)
	public List<Admission_Discharge> accident();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Female Medical'", nativeQuery=true)
	public List<Admission_Discharge> femaleMedical();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Outpatient Department'", nativeQuery=true)
	public List<Admission_Discharge> opd();
	
	
	/*>>>>>>>>>>>>>>>>>>===================Deaths======================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	
	@Query(value = "select * from admission_discharge where ward_name = 'Male Medical' and outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> maleMedicalDeath();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Female Surgical' and outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> femaleSurgicalDeath();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Male Surgical' and outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> maleSurgicalDeath();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Childrens Ward' and outcome_of_admission = 'Death';", nativeQuery=true)
	public List<Admission_Discharge> childrensDeath();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Maternity' and outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> maternityDeath();
	
	@Query(value = "select * from admission_discharge where ward_name = 'General Ward' and outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> generalWardDeath();
	
	@Query(value = "select * from admission_discharge where ward_name = 'NICU' and outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> nicuDeath();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Religious Ward' and outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> religiousDeath();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Accident/Emergency' and outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> accidentDeath();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Female Medical' and outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> femaleMedicalDeath();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Outpatient Department' and outcome_of_admission = 'Death'", nativeQuery=true)
	public List<Admission_Discharge> opdDeath();
	
	
	
	
	
	
/*>>>>>>>>>>>>>>>>>>===================Discharge======================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	
	@Query(value = "select * from admission_discharge where ward_name = 'Male Medical' and outcome_of_admission = 'Discharge'", nativeQuery=true)
	public List<Admission_Discharge> maleMedicalDischarge();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Female Surgical' and outcome_of_admission = 'Discharge'", nativeQuery=true)
	public List<Admission_Discharge> femaleSurgicalDischarge();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Male Surgical' and outcome_of_admission = 'Discharge'", nativeQuery=true)
	public List<Admission_Discharge> maleSurgicalDischarge();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Childrens Ward' and outcome_of_admission = 'Discharge';", nativeQuery=true)
	public List<Admission_Discharge> childrensDischarge();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Maternity' and outcome_of_admission = 'Discharge'", nativeQuery=true)
	public List<Admission_Discharge> maternityDischarge();
	
	@Query(value = "select * from admission_discharge where ward_name = 'General Ward' and outcome_of_admission = 'Discharge'", nativeQuery=true)
	public List<Admission_Discharge> generalWardDischarge();
	
	@Query(value = "select * from admission_discharge where ward_name = 'NICU' and outcome_of_admission = 'Discharge'", nativeQuery=true)
	public List<Admission_Discharge> nicuDischarge();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Religious Ward' and outcome_of_admission = 'Discharge'", nativeQuery=true)
	public List<Admission_Discharge> religiousDischarge();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Accident/Emergency' and outcome_of_admission = 'Discharge'", nativeQuery=true)
	public List<Admission_Discharge> accidentDischarge();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Female Medical' and outcome_of_admission = 'Discharge'", nativeQuery=true)
	public List<Admission_Discharge> femaleMedicalDischarge();
	
	@Query(value = "select * from admission_discharge where ward_name = 'Outpatient Department' and outcome_of_admission = 'Discharge'", nativeQuery=true)
	public List<Admission_Discharge> opdDischarge();
	
	
	
	
	
	
	/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1)", nativeQuery = true)
	public String countAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2)", nativeQuery = true)
	public String countAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3)", nativeQuery = true)
	public String countAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4)", nativeQuery = true)
	public String countAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5)", nativeQuery = true)
	public String countAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6)", nativeQuery = true)
	public String countAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7)", nativeQuery = true)
	public String countAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8)", nativeQuery = true)
	public String countAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9)", nativeQuery = true)
	public String countAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10)", nativeQuery = true)
	public String countAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11)", nativeQuery = true)
	public String countAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12)", nativeQuery = true)
	public String countAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1)", nativeQuery = true)
	public String countDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2)", nativeQuery = true)
	public String countDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3)", nativeQuery = true)
	public String countDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4)", nativeQuery = true)
	public String countDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5)", nativeQuery = true)
	public String countDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6)", nativeQuery = true)
	public String countDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7)", nativeQuery = true)
	public String countDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8)", nativeQuery = true)
	public String countDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9)", nativeQuery = true)
	public String countDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10)", nativeQuery = true)
	public String countDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11)", nativeQuery = true)
	public String countDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12)", nativeQuery = true)
	public String countDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1)", nativeQuery = true)
	public String countDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2)", nativeQuery = true)
	public String countDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3)", nativeQuery = true)
	public String countDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4)", nativeQuery = true)
	public String countDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5)", nativeQuery = true)
	public String countDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6)", nativeQuery = true)
	public String countDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7)", nativeQuery = true)
	public String countDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8)", nativeQuery = true)
	public String countDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9)", nativeQuery = true)
	public String countDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10)", nativeQuery = true)
	public String countDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11)", nativeQuery = true)
	public String countDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12)", nativeQuery = true)
	public String countDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate())", nativeQuery = true)
	public String countAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate())", nativeQuery=true)
	public String countDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death'", nativeQuery=true)
	public String countDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where date_admitted = curdate();", nativeQuery= true)
	public String countTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge';", nativeQuery=true)
	public String countTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and outcome_of_admission = 'death'", nativeQuery=true)
	public String countTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where date_admitted = curdate() - 1;", nativeQuery= true)
	public String countYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where date_discharge = curdate() - 1 and outcome_of_admission = 'discharge';", nativeQuery=true)
	public String countYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where date_discharge = curdate() - 1 and outcome_of_admission = 'death'", nativeQuery=true)
	public String countYesterdayDeath();
	
	@Query(value="select count(*) from "
			+ "admission_discharge where outcome_of_admission "
			+ "is null or outcome_of_admission=''\r\n"
			+ "", nativeQuery= true)
	public String bedOccupant();
	
	
	
	
	
	/* male medical counting */
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and ward_name = 'Male Medical'", nativeQuery = true)
	public String countMaleMedicalAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'Male Medical'", nativeQuery=true)
	public String countMaleMedicalDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death' and year(date_discharge) = year(curdate()) and ward_name = 'Male Medical'", nativeQuery=true)
	public String countMaleMedicalDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() and ward_name = 'Male Medical';", nativeQuery= true)
	public String countMaleMedicalTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'Male Medical';", nativeQuery=true)
	public String countMaleMedicalTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'death' and ward_name = 'Male Medical'", nativeQuery=true)
	public String countMaleMedicalTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() - 1 and ward_name = 'Male Medical';", nativeQuery= true)
	public String countMaleMedicalYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'Male Medical';", nativeQuery=true)
	public String countMaleMedicalYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'death' and ward_name = 'Male Medical'", nativeQuery=true)
	public String countMaleMedicalYesterdayDeath();
	
	
	/* female medical counting */
	
	
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionSeptember() ;
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and ward_name = 'Female Medical'", nativeQuery = true)
	public String countFemaleMedicalAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'Female Medical'", nativeQuery=true)
	public String countFemaleMedicalDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'Female Medical'", nativeQuery=true)
	public String countFemaleMedicalDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() and ward_name = 'Female Medical'", nativeQuery= true)
	public String countFemaleMedicalTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'Female Medical';", nativeQuery=true)
	public String countFemaleMedicalTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'death' and ward_name = 'Female Medical'", nativeQuery=true)
	public String countFemaleMedicalTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() - 1 and ward_name = 'Female Medical';", nativeQuery= true)
	public String countFemaleMedicalYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'Female Medical';", nativeQuery=true)
	public String countFemaleMedicalYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'death' and ward_name = 'Female Medical'", nativeQuery=true)
	public String countFemaleMedicalYesterdayDeath();
	
	
	
	
	/* male surgical counting */
	
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4)  and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and ward_name = 'Male Surgical'", nativeQuery = true)
	public String countMaleSurgicalAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'Male Surgical'", nativeQuery=true)
	public String countMaleSurgicalDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death' and year(date_discharge) = year(curdate())  and ward_name = 'Male Surgical'", nativeQuery=true)
	public String countMaleSurgicalDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate()  and ward_name = 'Male Surgical';", nativeQuery= true)
	public String countMaleSurgicalTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge'  and ward_name = 'Male Surgical';", nativeQuery=true)
	public String countMaleSurgicalTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and outcome_of_admission = 'death'  and ward_name = 'Male Surgical'", nativeQuery=true)
	public String countMaleSurgicalTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where date_admitted = curdate() - 1  and "
			+ "ward_name = 'Male Surgical';", nativeQuery= true)
	public String countMaleSurgicalYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'discharge'  and ward_name = 'Male Surgical';", nativeQuery=true)
	public String countMaleSurgicalYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'death'  and "
			+ "ward_name = 'Male Surgical'", nativeQuery=true)
	public String countMaleSurgicalYesterdayDeath();
	
	
	
	
	/* female surgical counting */
	
	
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionFebruary();
	
	@Query(value = "select count(*) from admission_discharge where year(date_admitted) = year(current_date) and month(date_admitted) in (3) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and ward_name = 'Female Surgical'", nativeQuery = true)
	public String countFemaleSurgicalAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate())  and ward_name = 'Female Surgical'", nativeQuery=true)
	public String countFemaleSurgicalDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death' and year(date_discharge) = year(curdate())  and ward_name = 'Female Surgical'", nativeQuery=true)
	public String countFemaleSurgicalDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where date_admitted = curdate() and ward_name = 'Female Surgical';", nativeQuery= true)
	public String countFemaleSurgicalTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'Female Surgical';", nativeQuery=true)
	public String countFemaleSurgicalTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and outcome_of_admission = 'death' and ward_name = 'Female Surgical'", nativeQuery=true)
	public String countFemaleSurgicalTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() - 1 and ward_name = 'Female Surgical';", nativeQuery= true)
	public String countFemaleSurgicalYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and outcome_of_admission = 'discharge' and ward_name = 'Female Surgical';", nativeQuery=true)
	public String countFemaleSurgicalYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and outcome_of_admission = 'death' and ward_name = 'Female Surgical'", nativeQuery=true)
	public String countFemaleSurgicalYesterdayDeath();
	
	
	
	
	/* maternity counting */
	
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and ward_name = 'Maternity'", nativeQuery = true)
	public String countMaternityAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'Maternity'", nativeQuery=true)
	public String countMaternityDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death' and year(date_discharge) = year(curdate())  and ward_name = 'Maternity'", nativeQuery=true)
	public String countMaternityDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() and ward_name = 'Maternity';", nativeQuery= true)
	public String countMaternityTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'Maternity';", nativeQuery=true)
	public String countMaternityTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and outcome_of_admission = 'death' and ward_name = 'Maternity'", nativeQuery=true)
	public String countMaternityTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() - 1 and ward_name = 'Maternity';", nativeQuery= true)
	public String countMaternityYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and outcome_of_admission = 'discharge' and ward_name = 'Maternity';", nativeQuery=true)
	public String countMaternityYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and outcome_of_admission = 'death' and ward_name = 'Maternity'", nativeQuery=true)
	public String countMaternityYesterdayDeath();
	
	
	/* nicu counting */
	
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and ward_name = 'NICU'", nativeQuery = true)
	public String countNICUAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'NICU'", nativeQuery=true)
	public String countNICUDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death' and year(date_discharge) = year(curdate())  and ward_name = 'NICU'", nativeQuery=true)
	public String countNICUDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where date_admitted = curdate() and ward_name = 'NICU';", nativeQuery= true)
	public String countNICUTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'NICU';", nativeQuery=true)
	public String countNICUTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and outcome_of_admission = 'death' and ward_name = 'NICU'", nativeQuery=true)
	public String countNICUTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() - 1 and ward_name = 'NICU';", nativeQuery= true)
	public String countNICUYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'NICU';", nativeQuery=true)
	public String countNICUYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'death' and ward_name = 'NICU'", nativeQuery=true)
	public String countNICUYesterdayDeath();
	
	
	
	/* religious ward counting */
	
	
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and ward_name = 'Religious Ward'", nativeQuery = true)
	public String countReligiousWardAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'Religious Ward'", nativeQuery=true)
	public String countReligiousWardDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death' and year(date_discharge) = year(curdate()) and ward_name = 'Religious Ward'", nativeQuery=true)
	public String countReligiousWardDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() and ward_name = 'Religious Ward';", nativeQuery= true)
	public String countReligiousWardTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'Religious Ward';", nativeQuery=true)
	public String countReligiousWardTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and outcome_of_admission = 'death' and ward_name = 'Religious Ward'", nativeQuery=true)
	public String countReligiousWardTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() - 1 and ward_name = 'Religious Ward';", nativeQuery= true)
	public String countReligiousWardYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and outcome_of_admission = 'discharge' and ward_name = 'Religious Ward';", nativeQuery=true)
	public String countReligiousWardYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and outcome_of_admission = 'death' and ward_name = 'Religious Ward'", nativeQuery=true)
	public String countReligiousWardYesterdayDeath();
	
	
	
	/* general ward counting */
	
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and ward_name = 'General Ward'", nativeQuery = true)
	public String countGeneralWardAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'General Ward'", nativeQuery=true)
	public String countGeneralWardDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death' and year(date_discharge) = year(curdate()) and ward_name = 'General Ward'", nativeQuery=true)
	public String countGeneralWardDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() and ward_name = 'General Ward';", nativeQuery= true)
	public String countGeneralWardTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'General Ward';", nativeQuery=true)
	public String countGeneralWardTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and outcome_of_admission = 'death' and ward_name = 'General Ward'", nativeQuery=true)
	public String countGeneralWardTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where date_admitted = curdate() - 1 and "
			+ "ward_name = 'General Ward';", nativeQuery= true)
	public String countGeneralWardYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'General Ward';", nativeQuery=true)
	public String countGeneralWardYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'death' and ward_name = 'General Ward'", nativeQuery=true)
	public String countGeneralWardYesterdayDeath();
	
	
	
	
	/*
	 * children's ward counting
	 */		
	
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and ward_name = 'Childrens Ward'", nativeQuery = true)
	public String countChildrensWardAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'Childrens Ward'", nativeQuery=true)
	public String countChildrensWardDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death' and year(date_discharge) = year(curdate()) and "
			+ "ward_name = 'Childrens Ward'", nativeQuery=true)
	public String countChildrensWardDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() and ward_name = 'Childrens Ward';", nativeQuery= true)
	public String countChildrensWardTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'Childrens Ward';", nativeQuery=true)
	public String countChildrensWardTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'death' and ward_name = 'Childrens Ward'", nativeQuery=true)
	public String countChildrensWardTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() - 1 and ward_name = 'Childrens Ward'; ", nativeQuery= true)
	public String countChildrensWardYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and outcome_of_admission = 'discharge' and "
			+ "ward_name = 'Childrens Ward';", nativeQuery=true)
	public String countChildrensWardYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'death' and ward_name = 'Childrens Ward'", nativeQuery=true)
	public String countChildrensWardYesterdayDeath();
	
	
	
	/* accident/emergency counting */
	
	
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and ward_name = 'Accident/Emergency'", nativeQuery = true)
	public String countAccidentEmergencyAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'Accident/Emergency'", nativeQuery=true)
	public String countAccidentEmergencyDischarge();
	
	@Query(value= "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'death' and "
			+ "year(date_discharge) = year(curdate()) and ward_name = 'Accident/Emergency'", nativeQuery=true)
	public String countAccidentEmergencyDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() and ward_name = 'Accident/Emergency';", nativeQuery= true)
	public String countAccidentEmergencyTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge' and ward_name = 'Accident/Emergency';", nativeQuery=true)
	public String countAccidentEmergencyTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'death' and ward_name = 'Accident/Emergency'", nativeQuery=true)
	public String countAccidentEmergencyTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() - 1 and ward_name = 'Accident/Emergency';", nativeQuery= true)
	public String countAccidentEmergencyYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and outcome_of_admission = 'discharge' and "
			+ "ward_name = 'Accident/Emergency';", nativeQuery=true)
	public String countAccidentEmergencyYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'death' and ward_name = 'Accident/Emergency'", nativeQuery=true)
	public String countAccidentEmergencyYesterdayDeath();
	
	
	/* opd counting */
	
/* counting admission in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (1) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionJanuary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (2) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionFebruary();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (3) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (4) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (5) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (6) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (7) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (8) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (9) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (10) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (11) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where  "
			+ "year(date_admitted) = year(current_date) and "
			+ "month(date_admitted) in (12) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Discharge' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (1) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathJanuary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (2) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathFebruary();
	
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (3) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (4) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathApril();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (5) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathMay();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (6) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathJune();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (7) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (8) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (9) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (10) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (11) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "admission_discharge where "
			+ "outcome_of_admission='Death' and "
			+ "year(date_discharge) = year(current_date) and "
			+ "month(date_discharge) in (12) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdDeathDecember();
	
	
	
	/* counting admission and discharge up to date */
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "year(date_admitted) = year(curdate()) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery = true)
	public String countOpdAdmissionToDate();
	
	@Query(value = "select count(*) from admission_discharge where "
			+ "outcome_of_admission = 'discharge' and "
			+ "year(date_discharge) = year(curdate()) and "
			+ "ward_name = 'Outpatient Department'", nativeQuery=true)
	public String countOpdDischarge();
	
	@Query(value= "select count(*) from admission_discharge where outcome_of_admission = 'death' and year(date_discharge) = year(curdate()) and ward_name = 'Outpatient Department'", nativeQuery=true)
	public String countOpdDeath();
	
	
	
	/* counting admission and discharge for today */
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() and "
			+ "ward_name = 'Outpatient Department';", nativeQuery= true)
	public String countOpdTodayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'discharge' and "
			+ "ward_name = 'Outpatient Department';", nativeQuery=true)
	public String countOpdTodayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() and "
			+ "outcome_of_admission = 'death' and "
			+ "ward_name = 'Outpatient Department'", nativeQuery=true)
	public String countOpdTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_admitted = curdate() - 1 and "
			+ "ward_name = 'Outpatient Department';", nativeQuery= true)
	public String countOpdYesterdayAdmission();
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'discharge' and "
			+ "ward_name = 'Outpatient Department';", nativeQuery=true)
	public String countOpdYesterdayDischarge();
	
	
	@Query(value="select count(*) from admission_discharge where "
			+ "date_discharge = curdate() - 1 and "
			+ "outcome_of_admission = 'death' and "
			+ "ward_name = 'Outpatient Department'", nativeQuery=true)
	public String countOpdYesterdayDeath();
	
	
	
	
	
}
