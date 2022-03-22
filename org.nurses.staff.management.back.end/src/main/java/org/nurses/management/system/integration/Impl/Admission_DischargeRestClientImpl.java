package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.nurses.management.system.integration.Admission_DischargeRestClient;
import org.nurses.management.system.integration.dto.Admission_Discharge;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class Admission_DischargeRestClientImpl implements Admission_DischargeRestClient {
	
	
	Admission_Discharge admission = new Admission_Discharge();
	RestTemplate rest = new RestTemplate();

	@Override
	public void saveAdmission_Discharge(Admission_Discharge discharge) {
		
		admission.setWard_name(discharge.getWard_name());
		admission.setPatient_number(discharge.getPatient_number());
		admission.setPatient_name(discharge.getPatient_name());
		admission.setAddress(discharge.getAddress());
		admission.setAge(discharge.getAge());
		admission.setSex(discharge.getSex());
		admission.setDate_admitted(discharge.getDate_admitted());
		admission.setPhone_number(discharge.getPhone_number());
		admission.setDiagnosis(discharge.getDiagnosis());
		admission.setOutcome_of_admission(discharge.getOutcome_of_admission());
		admission.setNext_of_kin(discharge.getNext_of_kin());
		admission.setNext_of_kin_number(discharge.getNext_of_kin_number());
		admission.setFinal_diagnosis(discharge.getFinal_diagnosis());
		admission.setInsured(discharge.getInsured());
		admission.setInsurance_number(discharge.getInsurance_number());
		admission.setDate_discharge(discharge.getDate_discharge());
		rest.postForObject("http://localhost:8084/admission/saveAdmission_Discharge", admission, Admission_Discharge.class);

	}

	@Override
	public void updateAdmission_Discharge(Admission_Discharge discharge) {
		Map<String, Integer> updateAdmission_Discharge = new HashMap<String, Integer>();
		updateAdmission_Discharge.put("id", discharge.getId());
		rest.put("http://localhost:8084/admission/updateAdmission_Discharge", discharge, updateAdmission_Discharge);
		

	}

	@Override
	public void deleteAdmission_Discharge(Integer id) {
		rest.delete("http://localhost:8084/admission/deleteAdmission_Discharge/"+id);

	}

	@Override
	public void deleteAllAdmission_Discharge(Admission_Discharge discharge) {
		// TODO Auto-generated method stub

	}

	@Override
	public Admission_Discharge[] getAllAdmission_Discharge(Admission_Discharge discharge) {
		Admission_Discharge [] getAdmission_Discharge = rest.getForObject("http://localhost:8084/admission/getAllAdmission_Discharge", Admission_Discharge[].class);
		return getAdmission_Discharge;
	}

	@Override
	public Admission_Discharge findAdmission_Discharge(Integer id) {
		Admission_Discharge leave = rest.getForObject("http://localhost:8084/admission/findById/"+id, Admission_Discharge.class);
		return leave;
	}

	@Override
	public Admission_Discharge[] admissionOnly(Admission_Discharge admissionOnly) {
		Admission_Discharge [] admission = rest.getForObject("http://localhost:8084/admission/admissionOnly", Admission_Discharge[].class);
		return admission;
	}

	@Override
	public Admission_Discharge[] dischargeOnly(Admission_Discharge dischargeOnly) {
		Admission_Discharge[] discharge = rest.getForObject("http://localhost:8084/admission/dischargeOnly", Admission_Discharge[].class);
		return discharge;
	}
	
	
	@Override
	public Admission_Discharge[] deathOnly(Admission_Discharge deathOnly) {
		Admission_Discharge[] death = rest.getForObject("http://localhost:8084/admission/deathOnly", Admission_Discharge[].class);
		return death;
	}
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===================Admissions======================<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	
	
	@Override
	public Admission_Discharge[] maleMedical() {
		Admission_Discharge[] maleMedical = rest.getForObject("http://localhost:8084/admission/maleMedical", Admission_Discharge[].class);
		return maleMedical;
	}

	@Override
	public Admission_Discharge[] femaleSurgical() {
		Admission_Discharge[] femaleSurgical = rest.getForObject("http://localhost:8084/admission/femaleSurgical", Admission_Discharge[].class);		
		return femaleSurgical;
	}

	@Override
	public Admission_Discharge[] maleSurgical() {
		Admission_Discharge[] maleSurgical = rest.getForObject("http://localhost:8084/admission/maleSurgical", Admission_Discharge[].class);
		return maleSurgical;
	}

	@Override
	public Admission_Discharge[] childrens() {
		// TODO Auto-generated method stub
		Admission_Discharge[] childrensWard = rest.getForObject("http://localhost:8084/admission/childrensWard", Admission_Discharge[].class);
		return childrensWard;
	}

	@Override
	public Admission_Discharge[] maternity() {
		// TODO Auto-generated method stub
		Admission_Discharge[] maternity = rest.getForObject("http://localhost:8084/admission/maternity", Admission_Discharge[].class);
		return maternity;
	}

	@Override
	public Admission_Discharge[] generalWard() {
		// TODO Auto-generated method stub
		Admission_Discharge[] generalWard = rest.getForObject("http://localhost:8084/admission/generalWard", Admission_Discharge[].class);
		return generalWard;
	}

	@Override
	public Admission_Discharge[] nicu() {
		// TODO Auto-generated method stub
		Admission_Discharge[] nicu = rest.getForObject("http://localhost:8084/admission/nicu", Admission_Discharge[].class);
		return nicu;
	}

	@Override
	public Admission_Discharge[] religious() {
		// TODO Auto-generated method stub
		Admission_Discharge[] religiousWard = rest.getForObject("http://localhost:8084/admission/religiousWard", Admission_Discharge[].class);
		return religiousWard;
	}

	@Override
	public Admission_Discharge[] accident() {
		// TODO Auto-generated method stub
		Admission_Discharge[] accidentEmergency = rest.getForObject("http://localhost:8084/admission/accidentEmergency", Admission_Discharge[].class);
		return accidentEmergency;
	}

	@Override
	public Admission_Discharge[] femaleMedical() {
		// TODO Auto-generated method stub
		Admission_Discharge[] femaleMedical = rest.getForObject("http://localhost:8084/admission/femaleMedical", Admission_Discharge[].class);
		return femaleMedical;
	}

	@Override
	public Admission_Discharge[] opd() {
		// TODO Auto-generated method stub
		Admission_Discharge[] opd = rest.getForObject("http://localhost:8084/admission/opd", Admission_Discharge[].class);
		return opd;
	}
	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===================Discharge======================<<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	
	@Override
	public Admission_Discharge[] maleMedicalDischarge() {
		Admission_Discharge[] maleMedicalDischarge = rest.getForObject("http://localhost:8084/admission/maleMedicalDischarge", Admission_Discharge[].class);
		return maleMedicalDischarge;
	}

	@Override
	public Admission_Discharge[] femaleSurgicalDischarge() {
		Admission_Discharge[] femaleSurgicalDischarge = rest.getForObject("http://localhost:8084/admission/femaleSurgicalDischarge", Admission_Discharge[].class);		
		return femaleSurgicalDischarge;
	}

	@Override
	public Admission_Discharge[] maleSurgicalDischarge() {
		Admission_Discharge[] maleSurgicalDischarge = rest.getForObject("http://localhost:8084/admission/maleSurgicalDischarge", Admission_Discharge[].class);
		return maleSurgicalDischarge;
	}

	@Override
	public Admission_Discharge[] childrensDischarge() {
		// TODO Auto-generated method stub
		Admission_Discharge[] childrensWardDischarge = rest.getForObject("http://localhost:8084/admission/childrensWardDischarge", Admission_Discharge[].class);
		return childrensWardDischarge;
	}

	@Override
	public Admission_Discharge[] maternityDischarge() {
		// TODO Auto-generated method stub
		Admission_Discharge[] maternityDischarge = rest.getForObject("http://localhost:8084/admission/maternityDischarge", Admission_Discharge[].class);
		return maternityDischarge;
	}

	@Override
	public Admission_Discharge[] generalWardDischarge() {
		// TODO Auto-generated method stub
		Admission_Discharge[] generalWardDischarge = rest.getForObject("http://localhost:8084/admission/generalWardDischarge", Admission_Discharge[].class);
		return generalWardDischarge;
	}

	@Override
	public Admission_Discharge[] nicuDischarge() {
		// TODO Auto-generated method stub
		Admission_Discharge[] nicuDischarge = rest.getForObject("http://localhost:8084/admission/nicuDischarge", Admission_Discharge[].class);
		return nicuDischarge;
	}

	@Override
	public Admission_Discharge[] religiousDischarge() {
		// TODO Auto-generated method stub
		Admission_Discharge[] religiousWardDischarge = rest.getForObject("http://localhost:8084/admission/religiousWardDischarge", Admission_Discharge[].class);
		return religiousWardDischarge;
	}

	@Override
	public Admission_Discharge[] accidentDischarge() {
		// TODO Auto-generated method stub
		Admission_Discharge[] accidentEmergencyDischarge = rest.getForObject("http://localhost:8084/admission/accidentEmergencyDischarge", Admission_Discharge[].class);
		return accidentEmergencyDischarge;
	}

	@Override
	public Admission_Discharge[] femaleMedicalDischarge() {
		// TODO Auto-generated method stub
		Admission_Discharge[] femaleMedicalDischarge = rest.getForObject("http://localhost:8084/admission/femaleMedicalDischarge", Admission_Discharge[].class);
		return femaleMedicalDischarge;
	}

	@Override
	public Admission_Discharge[] opdDischarge() {
		// TODO Auto-generated method stub
		Admission_Discharge[] opdDischarge = rest.getForObject("http://localhost:8084/admission/opdDischarge", Admission_Discharge[].class);
		return opdDischarge;
	}
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===================Deaths======================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	
	
	@Override
	public Admission_Discharge[] maleMedicalDeath() {
		Admission_Discharge[] maleMedicalDeath = rest.getForObject("http://localhost:8084/admission/maleMedicalDeath", Admission_Discharge[].class);
		return maleMedicalDeath;
	}

	@Override
	public Admission_Discharge[] femaleSurgicalDeath() {
		Admission_Discharge[] femaleSurgicalDeath = rest.getForObject("http://localhost:8084/admission/femaleSurgicalDeath", Admission_Discharge[].class);		
		return femaleSurgicalDeath;
	}

	@Override
	public Admission_Discharge[] maleSurgicalDeath() {
		Admission_Discharge[] maleSurgicalDeath = rest.getForObject("http://localhost:8084/admission/maleSurgicalDeath", Admission_Discharge[].class);
		return maleSurgicalDeath;
	}

	@Override
	public Admission_Discharge[] childrensDeath() {
		// TODO Auto-generated method stub
		Admission_Discharge[] childrensWardDeath = rest.getForObject("http://localhost:8084/admission/childrensWardDeath", Admission_Discharge[].class);
		return childrensWardDeath;
	}

	@Override
	public Admission_Discharge[] maternityDeath() {
		// TODO Auto-generated method stub
		Admission_Discharge[] maternityDeath = rest.getForObject("http://localhost:8084/admission/maternityDeath", Admission_Discharge[].class);
		return maternityDeath;
	}

	@Override
	public Admission_Discharge[] generalWardDeath() {
		// TODO Auto-generated method stub
		Admission_Discharge[] generalWardDeath = rest.getForObject("http://localhost:8084/admission/generalWardDeath", Admission_Discharge[].class);
		return generalWardDeath;
	}

	@Override
	public Admission_Discharge[] nicuDeath() {
		// TODO Auto-generated method stub
		Admission_Discharge[] nicuDeath = rest.getForObject("http://localhost:8084/admission/nicuDeath", Admission_Discharge[].class);
		return nicuDeath;
	}

	@Override
	public Admission_Discharge[] religiousDeath() {
		// TODO Auto-generated method stub
		Admission_Discharge[] religiousWardDeath = rest.getForObject("http://localhost:8084/admission/religiousWardDeath", Admission_Discharge[].class);
		return religiousWardDeath;
	}

	@Override
	public Admission_Discharge[] accidentDeath() {
		// TODO Auto-generated method stub
		Admission_Discharge[] accidentEmergency = rest.getForObject("http://localhost:8084/admission/accidentEmergencyDeath", Admission_Discharge[].class);
		return accidentEmergency;
	}

	@Override
	public Admission_Discharge[] femaleMedicalDeath() {
		// TODO Auto-generated method stub
		Admission_Discharge[] femaleMedicalDeath = rest.getForObject("http://localhost:8084/admission/femaleMedicalDeath", Admission_Discharge[].class);
		return femaleMedicalDeath;
	}

	@Override
	public Admission_Discharge[] opdDeath() {
		// TODO Auto-generated method stub
		Admission_Discharge[] opdDeath = rest.getForObject("http://localhost:8084/admission/opdDeath", Admission_Discharge[].class);
		return opdDeath;
	}
	
	
	
	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	

	@Override
	public String countAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionJanuary", String.class);
	}

	@Override
	public String countAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionFebruary", String.class);
	}

	@Override
	public String countAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionMarch", String.class);
	}

	@Override
	public String countAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionApril", String.class);
	}

	@Override
	public String countAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionMay", String.class);
	}

	@Override
	public String countAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionJune", String.class);
	}

	@Override
	public String countAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionJuly", String.class);
	}

	@Override
	public String countAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionAugust", String.class);
	}

	@Override
	public String countAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionSeptember", String.class);
	}

	@Override
	public String countAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionOctober", String.class);
	}

	@Override
	public String countAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionNovember", String.class);
	}

	@Override
	public String countAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionDecember", String.class);
	}
	
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Discharge from january to december========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeJanuary", String.class);
	}

	@Override
	public String countDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeFebruary", String.class);
	}

	@Override
	public String countDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeMarch", String.class);
	}

	@Override
	public String countDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeApril", String.class);
	}

	@Override
	public String countDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeMay", String.class);
	}

	@Override
	public String countDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeJune", String.class);
	}

	@Override
	public String countDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeJuly", String.class);
	}

	@Override
	public String countDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeAugust", String.class);
	}

	@Override
	public String countDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeSeptember", String.class);
	}

	@Override
	public String countDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeOctober", String.class);
	}

	@Override
	public String countDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeNovember", String.class);
	}

	@Override
	public String countDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischargeDecember", String.class);
	}
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===========Death from january to december==========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathJanuary", String.class);
	}

	@Override
	public String countDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathFebruary", String.class);
	}

	@Override
	public String countDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathMarch", String.class);
	}

	@Override
	public String countDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathApril", String.class);
	}

	@Override
	public String countDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathMay", String.class);
	}

	@Override
	public String countDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathJune", String.class);
	}

	@Override
	public String countDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathJuly", String.class);
	}

	@Override
	public String countDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathAugust", String.class);
	}

	@Override
	public String countDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathSeptember", String.class);
	}

	@Override
	public String countDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathOctober", String.class);
	}

	@Override
	public String countDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathNovember", String.class);
	}

	@Override
	public String countDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeathDecember", String.class);
	}

	@Override
	public String countAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAdmissionToDate", String.class);
	}

	@Override
	public String countDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDischarge", String.class);
	}

	@Override
	public String countDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countDeath", String.class);
	}

	@Override
	public String countTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countTodayAdmission", String.class);
	}

	@Override
	public String countTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countTodayDischarge", String.class);
	}

	@Override
	public String countTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countTodayDeath", String.class);
	}

	@Override
	public String countYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countYesterdayAdmission", String.class);
	}

	@Override
	public String countYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countYesterdayDischarge", String.class);
	}

	@Override
	public String countYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countYesterdayDeath", String.class);
	}
	
	
	public String  bedOccupant() {
		return rest.getForObject("http://localhost:8084/admission/bedOccupant", String.class);
		
	}

	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Male Medical counting Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	
	
	
	
	@Override
	public String countMaleMedicalAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionJanuary", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionFebruary", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionMarch", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionApril", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionMay", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionJune", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionJuly", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionAugust", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionSeptember", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionOctober", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionNovember", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionDecember", String.class);
	}
	
	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========counting male medical discharge from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

	@Override
	public String countMaleMedicalDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeJanuary", String.class);
	}

	@Override
	public String countMaleMedicalDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeMarch", String.class);
	}

	@Override
	public String countMaleMedicalDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeMarch", String.class);
	}

	@Override
	public String countMaleMedicalDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeApril", String.class);
	}

	@Override
	public String countMaleMedicalDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeMay", String.class);
	}

	@Override
	public String countMaleMedicalDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeJune", String.class);
	}

	@Override
	public String countMaleMedicalDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeJuly", String.class);
	}

	@Override
	public String countMaleMedicalDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeAugust", String.class);
	}

	@Override
	public String countMaleMedicalDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeSeptember", String.class);
	}

	@Override
	public String countMaleMedicalDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeOctober", String.class);
	}

	@Override
	public String countMaleMedicalDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeNovember", String.class);
	}

	@Override
	public String countMaleMedicalDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischargeDecember", String.class);
	}
	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========counting Male medical death from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

	@Override
	public String countMaleMedicalDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathJanuary", String.class);
	}

	@Override
	public String countMaleMedicalDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathFebruary", String.class);
	}

	@Override
	public String countMaleMedicalDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathMarch", String.class);
	}

	@Override
	public String countMaleMedicalDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathApril", String.class);
	}

	@Override
	public String countMaleMedicalDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathMay", String.class);
	}

	@Override
	public String countMaleMedicalDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathJune", String.class);
	}

	@Override
	public String countMaleMedicalDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathJuly", String.class);
	}

	@Override
	public String countMaleMedicalDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathAugust", String.class);
	}

	@Override
	public String countMaleMedicalDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathSeptember", String.class);
	}

	@Override
	public String countMaleMedicalDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathOctober", String.class);
	}

	@Override
	public String countMaleMedicalDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathNovember", String.class);
	}

	@Override
	public String countMaleMedicalDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeathDecember", String.class);
	}

	@Override
	public String countMaleMedicalAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalAdmissionToDate", String.class);
	}

	@Override
	public String countMaleMedicalDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDischarge", String.class);
	}

	@Override
	public String countMaleMedicalDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalDeath", String.class);
	}

	@Override
	public String countMaleMedicalTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalTodayAdmission", String.class);
	}

	@Override
	public String countMaleMedicalTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalTodayDischarge", String.class);
	}

	@Override
	public String countMaleMedicalTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalTodayDeath", String.class);
	}

	@Override
	public String countMaleMedicalYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalYesterdayAdmission", String.class);
	}

	@Override
	public String countMaleMedicalYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalYesterdayDischarge", String.class);
	}

	@Override
	public String countMaleMedicalYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleMedicalYesterdayDeath", String.class);
	}
	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========female medical Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

	@Override
	public String countFemaleMedicalAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionJanuary", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionFebruary", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionMarch", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionApril", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionMay", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionJune", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionJuly", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionAugust", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionSeptember", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionOctober", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionNovember", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionDecember", String.class);
	}
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========female medical discharge from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

	@Override
	public String countFemaleMedicalDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeJanuary", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeFebruary", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeMarch", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeApril", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeMay", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeJune", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeJuly", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeAugust", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeSeptember", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeOctober", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeNovember", String.class);
	}

	@Override
	public String countFemaleMedicalDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischargeDecember", String.class);
	}

	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========female medical death from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	@Override
	public String countFemaleMedicalDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathJanuary", String.class);
	}

	@Override
	public String countFemaleMedicalDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathFebruary", String.class);
	}

	@Override
	public String countFemaleMedicalDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathMarch", String.class);
	}

	@Override
	public String countFemaleMedicalDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathApril", String.class);
	}

	@Override
	public String countFemaleMedicalDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathMay", String.class);
	}

	@Override
	public String countFemaleMedicalDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathJune", String.class);
	}

	@Override
	public String countFemaleMedicalDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathJuly", String.class);
	}

	@Override
	public String countFemaleMedicalDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathAugust", String.class);
	}

	@Override
	public String countFemaleMedicalDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathSeptember", String.class);
	}

	@Override
	public String countFemaleMedicalDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathOctober", String.class);
	}

	@Override
	public String countFemaleMedicalDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathNovember", String.class);
	}

	@Override
	public String countFemaleMedicalDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeathDecember", String.class);
	}

	@Override
	public String countFemaleMedicalAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalAdmissionToDate", String.class);
	}

	@Override
	public String countFemaleMedicalDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDischarge", String.class);
	}

	@Override
	public String countFemaleMedicalDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalDeath", String.class);
	}

	@Override
	public String countFemaleMedicalTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalTodayAdmission", String.class);
	}

	@Override
	public String countFemaleMedicalTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalTodayDischarge", String.class);
	}

	@Override
	public String countFemaleMedicalTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalTodayDeath", String.class);
	}

	@Override
	public String countFemaleMedicalYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalYesterdayAdmission", String.class);
	}

	@Override
	public String countFemaleMedicalYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalYesterdayDischarge", String.class);
	}

	@Override
	public String countFemaleMedicalYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleMedicalYesterdayDeath", String.class);
	}

	
	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========male surgical Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	

	@Override
	public String countMaleSurgicalAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionJanuary", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionFebruary", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionMarch", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionApril", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionMay", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionJune", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionJuly", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionAugust", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionSeptember", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionOctober", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionNovember", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionDecember", String.class);
	}
	
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Discharge MaleSurgical from january to december========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countMaleSurgicalDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeJanuary", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeFebruary", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeMarch", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeApril", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeMay", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeJune", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeJuly", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeAugust", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeSeptember", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeOctober", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeNovember", String.class);
	}

	@Override
	public String countMaleSurgicalDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischargeDecember", String.class);
	}
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===========MaleSurgical Death from january to december==========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countMaleSurgicalDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathJanuary", String.class);
	}

	@Override
	public String countMaleSurgicalDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathFebruary", String.class);
	}

	@Override
	public String countMaleSurgicalDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathMarch", String.class);
	}

	@Override
	public String countMaleSurgicalDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathApril", String.class);
	}

	@Override
	public String countMaleSurgicalDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathMay", String.class);
	}

	@Override
	public String countMaleSurgicalDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathJune", String.class);
	}

	@Override
	public String countMaleSurgicalDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathJuly", String.class);
	}

	@Override
	public String countMaleSurgicalDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathAugust", String.class);
	}

	@Override
	public String countMaleSurgicalDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathSeptember", String.class);
	}

	@Override
	public String countMaleSurgicalDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathOctober", String.class);
	}

	@Override
	public String countMaleSurgicalDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathNovember", String.class);
	}

	@Override
	public String countMaleSurgicalDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeathDecember", String.class);
	}

	@Override
	public String countMaleSurgicalAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalAdmissionToDate", String.class);
	}

	@Override
	public String countMaleSurgicalDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDischarge", String.class);
	}

	@Override
	public String countMaleSurgicalDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalDeath", String.class);
	}

	@Override
	public String countMaleSurgicalTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalTodayAdmission", String.class);
	}

	@Override
	public String countMaleSurgicalTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalTodayDischarge", String.class);
	}

	@Override
	public String countMaleSurgicalTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalTodayDeath", String.class);
	}

	@Override
	public String countMaleSurgicalYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalYesterdayAdmission", String.class);
	}

	@Override
	public String countMaleSurgicalYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalYesterdayDischarge", String.class);
	}

	@Override
	public String countMaleSurgicalYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaleSurgicalYesterdayDeath", String.class);
	}

	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========female surgical Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	

	@Override
	public String countFemaleSurgicalAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionJanuary", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionFebruary", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionMarch", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionApril", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionMay", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionJune", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionJuly", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionAugust", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionSeptember", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionOctober", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionNovember", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionDecember", String.class);
	}
	
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========FemaleSurgical Discharge from january to december========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countFemaleSurgicalDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeJanuary", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeFebruary", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeMarch", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeApril", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeMay", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeJune", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeJuly", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeAugust", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeSeptember", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeOctober", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeNovember", String.class);
	}

	@Override
	public String countFemaleSurgicalDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischargeDecember", String.class);
	}
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===========FemaleSurgical Death from january to december==========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countFemaleSurgicalDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathJanuary", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathFebruary", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathMarch", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathApril", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathMay", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathJune", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathJuly", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathAugust", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathSeptember", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathOctober", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathNovember", String.class);
	}

	@Override
	public String countFemaleSurgicalDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeathDecember", String.class);
	}

	@Override
	public String countFemaleSurgicalAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalAdmissionToDate", String.class);
	}

	@Override
	public String countFemaleSurgicalDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDischarge", String.class);
	}

	@Override
	public String countFemaleSurgicalDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalDeath", String.class);
	}

	@Override
	public String countFemaleSurgicalTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalTodayAdmission", String.class);
	}

	@Override
	public String countFemaleSurgicalTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalTodayDischarge", String.class);
	}

	@Override
	public String countFemaleSurgicalTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalTodayDeath", String.class);
	}

	@Override
	public String countFemaleSurgicalYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalYesterdayAdmission", String.class);
	}

	@Override
	public String countFemaleSurgicalYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalYesterdayDischarge", String.class);
	}

	@Override
	public String countFemaleSurgicalYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countFemaleSurgicalYesterdayDeath", String.class);
	}

	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Maternity Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	

	@Override
	public String countMaternityAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionJanuary", String.class);
	}

	@Override
	public String countMaternityAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionFebruary", String.class);
	}

	@Override
	public String countMaternityAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionMarch", String.class);
	}

	@Override
	public String countMaternityAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionApril", String.class);
	}

	@Override
	public String countMaternityAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionMay", String.class);
	}

	@Override
	public String countMaternityAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionJune", String.class);
	}

	@Override
	public String countMaternityAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionJuly", String.class);
	}

	@Override
	public String countMaternityAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionAugust", String.class);
	}

	@Override
	public String countMaternityAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionSeptember", String.class);
	}

	@Override
	public String countMaternityAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionOctober", String.class);
	}

	@Override
	public String countMaternityAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionNovember", String.class);
	}

	@Override
	public String countMaternityAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionDecember", String.class);
	}
	
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Maternity Discharge from january to december========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countMaternityDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeJanuary", String.class);
	}

	@Override
	public String countMaternityDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeFebruary", String.class);
	}

	@Override
	public String countMaternityDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeMarch", String.class);
	}

	@Override
	public String countMaternityDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeApril", String.class);
	}

	@Override
	public String countMaternityDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeMay", String.class);
	}

	@Override
	public String countMaternityDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeJune", String.class);
	}

	@Override
	public String countMaternityDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeJuly", String.class);
	}

	@Override
	public String countMaternityDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeAugust", String.class);
	}

	@Override
	public String countMaternityDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeSeptember", String.class);
	}

	@Override
	public String countMaternityDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeOctober", String.class);
	}

	@Override
	public String countMaternityDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeNovember", String.class);
	}

	@Override
	public String countMaternityDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischargeDecember", String.class);
	}
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===========Death from january to december==========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countMaternityDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathJanuary", String.class);
	}

	@Override
	public String countMaternityDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathFebruary", String.class);
	}

	@Override
	public String countMaternityDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathMarch", String.class);
	}

	@Override
	public String countMaternityDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathApril", String.class);
	}

	@Override
	public String countMaternityDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathMay", String.class);
	}

	@Override
	public String countMaternityDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathJune", String.class);
	}

	@Override
	public String countMaternityDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathJuly", String.class);
	}

	@Override
	public String countMaternityDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathAugust", String.class);
	}

	@Override
	public String countMaternityDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathSeptember", String.class);
	}

	@Override
	public String countMaternityDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathOctober", String.class);
	}

	@Override
	public String countMaternityDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathNovember", String.class);
	}

	@Override
	public String countMaternityDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeathDecember", String.class);
	}

	@Override
	public String countMaternityAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityAdmissionToDate", String.class);
	}

	@Override
	public String countMaternityDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDischarge", String.class);
	}

	@Override
	public String countMaternityDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityDeath", String.class);
	}

	@Override
	public String countMaternityTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityTodayAdmission", String.class);
	}

	@Override
	public String countMaternityTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityTodayDischarge", String.class);
	}

	@Override
	public String countMaternityTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityTodayDeath", String.class);
	}

	@Override
	public String countMaternityYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityYesterdayAdmission", String.class);
	}

	@Override
	public String countMaternityYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityYesterdayDischarge", String.class);
	}

	@Override
	public String countMaternityYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countMaternityYesterdayDeath", String.class);
	}

	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>========= NICU Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	

	@Override
	public String countNICUAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionJanuary", String.class);
	}

	@Override
	public String countNICUAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionFebruary", String.class);
	}

	@Override
	public String countNICUAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionMarch", String.class);
	}

	@Override
	public String countNICUAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionApril", String.class);
	}

	@Override
	public String countNICUAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionMay", String.class);
	}

	@Override
	public String countNICUAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionJune", String.class);
	}

	@Override
	public String countNICUAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionJuly", String.class);
	}

	@Override
	public String countNICUAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionAugust", String.class);
	}

	@Override
	public String countNICUAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionSeptember", String.class);
	}

	@Override
	public String countNICUAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionOctober", String.class);
	}

	@Override
	public String countNICUAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionNovember", String.class);
	}

	@Override
	public String countNICUAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionDecember", String.class);
	}
	
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Discharge from january to december========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countNICUDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeJanuary", String.class);
	}

	@Override
	public String countNICUDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeFebruary", String.class);
	}

	@Override
	public String countNICUDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeMarch", String.class);
	}

	@Override
	public String countNICUDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeApril", String.class);
	}

	@Override
	public String countNICUDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeMay", String.class);
	}

	@Override
	public String countNICUDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeJune", String.class);
	}

	@Override
	public String countNICUDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeJuly", String.class);
	}

	@Override
	public String countNICUDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeAugust", String.class);
	}

	@Override
	public String countNICUDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeSeptember", String.class);
	}

	@Override
	public String countNICUDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeOctober", String.class);
	}

	@Override
	public String countNICUDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeNovember", String.class);
	}

	@Override
	public String countNICUDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischargeDecember", String.class);
	}
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===========Death from january to december==========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countNICUDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathJanuary", String.class);
	}

	@Override
	public String countNICUDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathFebruary", String.class);
	}

	@Override
	public String countNICUDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathMarch", String.class);
	}

	@Override
	public String countNICUDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathApril", String.class);
	}

	@Override
	public String countNICUDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathMay", String.class);
	}

	@Override
	public String countNICUDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathJune", String.class);
	}

	@Override
	public String countNICUDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathJuly", String.class);
	}

	@Override
	public String countNICUDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathAugust", String.class);
	}

	@Override
	public String countNICUDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathSeptember", String.class);
	}

	@Override
	public String countNICUDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathOctober", String.class);
	}

	@Override
	public String countNICUDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathNovember", String.class);
	}

	@Override
	public String countNICUDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeathDecember", String.class);
	}

	@Override
	public String countNICUAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUAdmissionToDate", String.class);
	}

	@Override
	public String countNICUDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDischarge", String.class);
	}

	@Override
	public String countNICUDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUDeath", String.class);
	}

	@Override
	public String countNICUTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUTodayAdmission", String.class);
	}

	@Override
	public String countNICUTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUTodayDischarge", String.class);
	}

	@Override
	public String countNICUTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUTodayDeath", String.class);
	}

	@Override
	public String countNICUYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUYesterdayAdmission", String.class);
	}

	@Override
	public String countNICUYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUYesterdayDischarge", String.class);
	}

	@Override
	public String countNICUYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countNICUYesterdayDeath", String.class);
	}

	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========COUNTING RELIEGIOUS WARD Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	

	@Override
	public String countReligiousWardAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionJanuary", String.class);
	}

	@Override
	public String countReligiousWardAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionFebruary", String.class);
	}

	@Override
	public String countReligiousWardAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionMarch", String.class);
	}

	@Override
	public String countReligiousWardAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionApril", String.class);
	}

	@Override
	public String countReligiousWardAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionMay", String.class);
	}

	@Override
	public String countReligiousWardAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionJune", String.class);
	}

	@Override
	public String countReligiousWardAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionJuly", String.class);
	}

	@Override
	public String countReligiousWardAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionAugust", String.class);
	}

	@Override
	public String countReligiousWardAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionSeptember", String.class);
	}

	@Override
	public String countReligiousWardAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionOctober", String.class);
	}

	@Override
	public String countReligiousWardAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionNovember", String.class);
	}

	@Override
	public String countReligiousWardAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionDecember", String.class);
	}
	
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Discharge from january to december========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countReligiousWardDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeJanuary", String.class);
	}

	@Override
	public String countReligiousWardDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeFebruary", String.class);
	}

	@Override
	public String countReligiousWardDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeMarch", String.class);
	}

	@Override
	public String countReligiousWardDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeApril", String.class);
	}

	@Override
	public String countReligiousWardDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeMay", String.class);
	}

	@Override
	public String countReligiousWardDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeJune", String.class);
	}

	@Override
	public String countReligiousWardDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeJuly", String.class);
	}

	@Override
	public String countReligiousWardDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeAugust", String.class);
	}

	@Override
	public String countReligiousWardDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeSeptember", String.class);
	}

	@Override
	public String countReligiousWardDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeOctober", String.class);
	}

	@Override
	public String countReligiousWardDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeNovember", String.class);
	}

	@Override
	public String countReligiousWardDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischargeDecember", String.class);
	}
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===========Death from january to december==========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countReligiousWardDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathJanuary", String.class);
	}

	@Override
	public String countReligiousWardDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathFebruary", String.class);
	}

	@Override
	public String countReligiousWardDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathMarch", String.class);
	}

	@Override
	public String countReligiousWardDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathApril", String.class);
	}

	@Override
	public String countReligiousWardDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathMay", String.class);
	}

	@Override
	public String countReligiousWardDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathJune", String.class);
	}

	@Override
	public String countReligiousWardDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathJuly", String.class);
	}

	@Override
	public String countReligiousWardDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathAugust", String.class);
	}

	@Override
	public String countReligiousWardDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathSeptember", String.class);
	}

	@Override
	public String countReligiousWardDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathOctober", String.class);
	}

	@Override
	public String countReligiousWardDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathNovember", String.class);
	}

	@Override
	public String countReligiousWardDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeathDecember", String.class);
	}

	@Override
	public String countReligiousWardAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardAdmissionToDate", String.class);
	}

	@Override
	public String countReligiousWardDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDischarge", String.class);
	}

	@Override
	public String countReligiousWardDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardDeath", String.class);
	}

	@Override
	public String countReligiousWardTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardTodayAdmission", String.class);
	}

	@Override
	public String countReligiousWardTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardTodayDischarge", String.class);
	}

	@Override
	public String countReligiousWardTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardTodayDeath", String.class);
	}

	@Override
	public String countReligiousWardYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardYesterdayAdmission", String.class);
	}

	@Override
	public String countReligiousWardYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardYesterdayDischarge", String.class);
	}

	@Override
	public String countReligiousWardYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countReligiousWardYesterdayDeath", String.class);
	}

	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>========= counting Childrens Ward Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	

	@Override
	public String countChildrensWardAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionJanuary", String.class);
	}

	@Override
	public String countChildrensWardAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionFebruary", String.class);
	}

	@Override
	public String countChildrensWardAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionMarch", String.class);
	}

	@Override
	public String countChildrensWardAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionApril", String.class);
	}

	@Override
	public String countChildrensWardAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionMay", String.class);
	}

	@Override
	public String countChildrensWardAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionJune", String.class);
	}

	@Override
	public String countChildrensWardAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionJuly", String.class);
	}

	@Override
	public String countChildrensWardAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionAugust", String.class);
	}

	@Override
	public String countChildrensWardAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionSeptember", String.class);
	}

	@Override
	public String countChildrensWardAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionOctober", String.class);
	}

	@Override
	public String countChildrensWardAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionNovember", String.class);
	}

	@Override
	public String countChildrensWardAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionDecember", String.class);
	}
	
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Discharge from january to december========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countChildrensWardDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeJanuary", String.class);
	}

	@Override
	public String countChildrensWardDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeFebruary", String.class);
	}

	@Override
	public String countChildrensWardDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeMarch", String.class);
	}

	@Override
	public String countChildrensWardDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeApril", String.class);
	}

	@Override
	public String countChildrensWardDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeMay", String.class);
	}

	@Override
	public String countChildrensWardDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeJune", String.class);
	}

	@Override
	public String countChildrensWardDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeJuly", String.class);
	}

	@Override
	public String countChildrensWardDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeAugust", String.class);
	}

	@Override
	public String countChildrensWardDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeSeptember", String.class);
	}

	@Override
	public String countChildrensWardDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeOctober", String.class);
	}

	@Override
	public String countChildrensWardDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeNovember", String.class);
	}

	@Override
	public String countChildrensWardDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischargeDecember", String.class);
	}
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===========Death from january to december==========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countChildrensWardDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathJanuary", String.class);
	}

	@Override
	public String countChildrensWardDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathFebruary", String.class);
	}

	@Override
	public String countChildrensWardDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathMarch", String.class);
	}

	@Override
	public String countChildrensWardDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathApril", String.class);
	}

	@Override
	public String countChildrensWardDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathMay", String.class);
	}

	@Override
	public String countChildrensWardDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathJune", String.class);
	}

	@Override
	public String countChildrensWardDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathJuly", String.class);
	}

	@Override
	public String countChildrensWardDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathAugust", String.class);
	}

	@Override
	public String countChildrensWardDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathSeptember", String.class);
	}

	@Override
	public String countChildrensWardDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathOctober", String.class);
	}

	@Override
	public String countChildrensWardDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathNovember", String.class);
	}

	@Override
	public String countChildrensWardDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeathDecember", String.class);
	}

	@Override
	public String countChildrensWardAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardAdmissionToDate", String.class);
	}

	@Override
	public String countChildrensWardDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDischarge", String.class);
	}

	@Override
	public String countChildrensWardDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardDeath", String.class);
	}

	@Override
	public String countChildrensWardTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardTodayAdmission", String.class);
	}

	@Override
	public String countChildrensWardTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardTodayDischarge", String.class);
	}

	@Override
	public String countChildrensWardTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardTodayDeath", String.class);
	}

	@Override
	public String countChildrensWardYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardYesterdayAdmission", String.class);
	}

	@Override
	public String countChildrensWardYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardYesterdayDischarge", String.class);
	}

	@Override
	public String countChildrensWardYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countChildrensWardYesterdayDeath", String.class);
	}

	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>counting GeneralWard Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	

	@Override
	public String countGeneralWardAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionJanuary", String.class);
	}

	@Override
	public String countGeneralWardAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionFebruary", String.class);
	}

	@Override
	public String countGeneralWardAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionMarch", String.class);
	}

	@Override
	public String countGeneralWardAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionApril", String.class);
	}

	@Override
	public String countGeneralWardAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionMay", String.class);
	}

	@Override
	public String countGeneralWardAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionJune", String.class);
	}

	@Override
	public String countGeneralWardAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionJuly", String.class);
	}

	@Override
	public String countGeneralWardAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionAugust", String.class);
	}

	@Override
	public String countGeneralWardAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionSeptember", String.class);
	}

	@Override
	public String countGeneralWardAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionOctober", String.class);
	}

	@Override
	public String countGeneralWardAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionNovember", String.class);
	}

	@Override
	public String countGeneralWardAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionDecember", String.class);
	}
	
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Discharge from january to december========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countGeneralWardDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeJanuary", String.class);
	}

	@Override
	public String countGeneralWardDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeFebruary", String.class);
	}

	@Override
	public String countGeneralWardDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeMarch", String.class);
	}

	@Override
	public String countGeneralWardDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeApril", String.class);
	}

	@Override
	public String countGeneralWardDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeMay", String.class);
	}

	@Override
	public String countGeneralWardDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeJune", String.class);
	}

	@Override
	public String countGeneralWardDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeJuly", String.class);
	}

	@Override
	public String countGeneralWardDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeAugust", String.class);
	}

	@Override
	public String countGeneralWardDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeSeptember", String.class);
	}

	@Override
	public String countGeneralWardDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeOctober", String.class);
	}

	@Override
	public String countGeneralWardDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeNovember", String.class);
	}

	@Override
	public String countGeneralWardDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischargeDecember", String.class);
	}
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===========Death from january to december==========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countGeneralWardDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathJanuary", String.class);
	}

	@Override
	public String countGeneralWardDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathFebruary", String.class);
	}

	@Override
	public String countGeneralWardDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathMarch", String.class);
	}

	@Override
	public String countGeneralWardDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathApril", String.class);
	}

	@Override
	public String countGeneralWardDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathMay", String.class);
	}

	@Override
	public String countGeneralWardDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathJune", String.class);
	}

	@Override
	public String countGeneralWardDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathJuly", String.class);
	}

	@Override
	public String countGeneralWardDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathAugust", String.class);
	}

	@Override
	public String countGeneralWardDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathSeptember", String.class);
	}

	@Override
	public String countGeneralWardDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathOctober", String.class);
	}

	@Override
	public String countGeneralWardDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathNovember", String.class);
	}

	@Override
	public String countGeneralWardDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeathDecember", String.class);
	}

	@Override
	public String countGeneralWardAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardAdmissionToDate", String.class);
	}

	@Override
	public String countGeneralWardDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDischarge", String.class);
	}

	@Override
	public String countGeneralWardDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardDeath", String.class);
	}

	@Override
	public String countGeneralWardTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardTodayAdmission", String.class);
	}

	@Override
	public String countGeneralWardTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardTodayDischarge", String.class);
	}

	@Override
	public String countGeneralWardTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardTodayDeath", String.class);
	}

	@Override
	public String countGeneralWardYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardYesterdayAdmission", String.class);
	}

	@Override
	public String countGeneralWardYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardYesterdayDischarge", String.class);
	}

	@Override
	public String countGeneralWardYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countGeneralWardYesterdayDeath", String.class);
	}

	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>counting Accident/Emergency Admissions from january to december<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	

	@Override
	public String countAccidentEmergencyAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionJanuary", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionFebruary", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionMarch", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionApril", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionMay", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionJune", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionJuly", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionAugust", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionSeptember", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionOctober", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionNovember", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionDecember", String.class);
	}
	
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Discharge from january to december========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countAccidentEmergencyDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeJanuary", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeFebruary", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeMarch", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeApril", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeMay", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeJune", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeJuly", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeAugust", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeSeptember", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeOctober", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeNovember", String.class);
	}

	@Override
	public String countAccidentEmergencyDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischargeDecember", String.class);
	}
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===========Death from january to december==========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countAccidentEmergencyDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathJanuary", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathFebruary", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathMarch", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathApril", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathMay", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathJune", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathJuly", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathAugust", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathSeptember", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathOctober", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathNovember", String.class);
	}

	@Override
	public String countAccidentEmergencyDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeathDecember", String.class);
	}

	@Override
	public String countAccidentEmergencyAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyAdmissionToDate", String.class);
	}

	@Override
	public String countAccidentEmergencyDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDischarge", String.class);
	}

	@Override
	public String countAccidentEmergencyDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyDeath", String.class);
	}

	@Override
	public String countAccidentEmergencyTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyTodayAdmission", String.class);
	}

	@Override
	public String countAccidentEmergencyTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyTodayDischarge", String.class);
	}

	@Override
	public String countAccidentEmergencyTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyTodayDeath", String.class);
	}

	@Override
	public String countAccidentEmergencyYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyYesterdayAdmission", String.class);
	}

	@Override
	public String countAccidentEmergencyYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyYesterdayDischarge", String.class);
	}

	@Override
	public String countAccidentEmergencyYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countAccidentEmergencyYesterdayDeath", String.class);
	}

	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>> counting OPD Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Admissions from january to december=======<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
	

	@Override
	public String countOpdAdmissionJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionJanuary", String.class);
	}

	@Override
	public String countOpdAdmissionFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionFebruary", String.class);
	}

	@Override
	public String countOpdAdmissionMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionMarch", String.class);
	}

	@Override
	public String countOpdAdmissionApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionApril", String.class);
	}

	@Override
	public String countOpdAdmissionMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionMay", String.class);
	}

	@Override
	public String countOpdAdmissionJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionJune", String.class);
	}

	@Override
	public String countOpdAdmissionJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionJuly", String.class);
	}

	@Override
	public String countOpdAdmissionAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionAugust", String.class);
	}

	@Override
	public String countOpdAdmissionSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionSeptember", String.class);
	}

	@Override
	public String countOpdAdmissionOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionOctober", String.class);
	}

	@Override
	public String countOpdAdmissionNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionNovember", String.class);
	}

	@Override
	public String countOpdAdmissionDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionDecember", String.class);
	}
	
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>=========Discharge from january to december========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countOpdDischargeJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeJanuary", String.class);
	}

	@Override
	public String countOpdDischargeFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeFebruary", String.class);
	}

	@Override
	public String countOpdDischargeMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeMarch", String.class);
	}

	@Override
	public String countOpdDischargeApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeApril", String.class);
	}

	@Override
	public String countOpdDischargeMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeMay", String.class);
	}

	@Override
	public String countOpdDischargeJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeJune", String.class);
	}

	@Override
	public String countOpdDischargeJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeJuly", String.class);
	}

	@Override
	public String countOpdDischargeAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeAugust", String.class);
	}

	@Override
	public String countOpdDischargeSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeSeptember", String.class);
	}

	@Override
	public String countOpdDischargeOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeOctober", String.class);
	}

	@Override
	public String countOpdDischargeNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeNovember", String.class);
	}

	@Override
	public String countOpdDischargeDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischargeDecember", String.class);
	}
	
	
	

	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===========Death from january to december==========<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	@Override
	public String countOpdDeathJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathJanuary", String.class);
	}

	@Override
	public String countOpdDeathFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathFebruary", String.class);
	}

	@Override
	public String countOpdDeathMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathMarch", String.class);
	}

	@Override
	public String countOpdDeathApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathApril", String.class);
	}

	@Override
	public String countOpdDeathMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathMay", String.class);
	}

	@Override
	public String countOpdDeathJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathJune", String.class);
	}

	@Override
	public String countOpdDeathJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathJuly", String.class);
	}

	@Override
	public String countOpdDeathAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathAugust", String.class);
	}

	@Override
	public String countOpdDeathSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathSeptember", String.class);
	}

	@Override
	public String countOpdDeathOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathOctober", String.class);
	}

	@Override
	public String countOpdDeathNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathNovember", String.class);
	}

	@Override
	public String countOpdDeathDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeathDecember", String.class);
	}

	@Override
	public String countOpdAdmissionToDate() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdAdmissionToDate", String.class);
	}

	@Override
	public String countOpdDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDischarge", String.class);
	}

	@Override
	public String countOpdDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdDeath", String.class);
	}

	@Override
	public String countOpdTodayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdTodayAdmission", String.class);
	}

	@Override
	public String countOpdTodayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdTodayDischarge", String.class);
	}

	@Override
	public String countOpdTodayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdTodayDeath", String.class);
	}

	@Override
	public String countOpdYesterdayAdmission() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdYesterdayAdmission", String.class);
	}

	@Override
	public String countOpdYesterdayDischarge() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdYesterdayDischarge", String.class);
	}

	@Override
	public String countOpdYesterdayDeath() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/admission/countOpdYesterdayDeath", String.class);
	}
}
