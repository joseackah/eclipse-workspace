package org.nurses.management.system.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admission_Discharge {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String ward_name;
	private String patient_number;
	private String patient_name;
	private Integer age;
	private String sex;
	private Date date_admitted;
	private String address;
	private String diagnosis;
	private String phone_number;
	private String outcome_of_admission;
	private String final_diagnosis;
	private String next_of_kin;
	private String next_of_kin_number;
	private String insured;
	private Integer insurance_number;
	private Date date_discharge;
	
	
	
	
	public Admission_Discharge() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Admission_Discharge(Integer id, String patient_number, String patient_name, String sex, Date date_admitted,
			String address, String diagnosis, String phone_number, String outcome_of_admission, String final_diagnosis,
			String next_of_kin, String next_of_kin_number, String insured, Integer insurance_number,
			Date date_discharge, String ward_name, Integer age) {
		super();
		this.id = id;
		this.patient_number = patient_number;
		this.patient_name = patient_name;
		this.age = age;
		this.sex = sex;
		this.date_admitted = date_admitted;
		this.address = address;
		this.diagnosis = diagnosis;
		this.phone_number = phone_number;
		this.outcome_of_admission = outcome_of_admission;
		this.final_diagnosis = final_diagnosis;
		this.next_of_kin = next_of_kin;
		this.next_of_kin_number = next_of_kin_number;
		this.insured = insured;
		this.insurance_number = insurance_number;
		this.date_discharge = date_discharge;
		this.ward_name = ward_name;
	}




	public Integer getAge() {
		return age;
	}





	public void setAge(Integer age) {
		this.age = age;
	}





	public String getWard_name() {
		return ward_name;
	}





	public void setWard_name(String ward_name) {
		this.ward_name = ward_name;
	}





	public Date getDate_discharge() {
		return date_discharge;
	}





	public void setDate_discharge(Date date_discharge) {
		this.date_discharge = date_discharge;
	}





	public String getInsured() {
		return insured;
	}




	public void setInsured(String insured) {
		this.insured = insured;
	}




	public Integer getInsurance_number() {
		return insurance_number;
	}




	public void setInsurance_number(Integer insurance_number) {
		this.insurance_number = insurance_number;
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPatient_number() {
		return patient_number;
	}
	public void setPatient_number(String patient_number) {
		this.patient_number = patient_number;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDate_admitted() {
		return date_admitted;
	}
	public void setDate_admitted(Date date_admitted) {
		this.date_admitted = date_admitted;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getOutcome_of_admission() {
		return outcome_of_admission;
	}
	public void setOutcome_of_admission(String outcome_of_admission) {
		this.outcome_of_admission = outcome_of_admission;
	}
	public String getFinal_diagnosis() {
		return final_diagnosis;
	}
	public void setFinal_diagnosis(String final_diagnosis) {
		this.final_diagnosis = final_diagnosis;
	}
	public String getNext_of_kin() {
		return next_of_kin;
	}
	public void setNext_of_kin(String next_of_kin) {
		this.next_of_kin = next_of_kin;
	}
	public String getNext_of_kin_number() {
		return next_of_kin_number;
	}
	public void setNext_of_kin_number(String next_of_kin_number) {
		this.next_of_kin_number = next_of_kin_number;
	}
	
	
	@Override
	public String toString() {
		return "Admission_Discharge [id=" + id + ", ward_name=" + ward_name + ", patient_number=" + patient_number
				+ ", patient_name=" + patient_name + ", age=" + age + ", sex=" + sex + ", date_admitted="
				+ date_admitted + ", address=" + address + ", diagnosis=" + diagnosis + ", phone_number=" + phone_number
				+ ", outcome_of_admission=" + outcome_of_admission + ", final_diagnosis=" + final_diagnosis
				+ ", next_of_kin=" + next_of_kin + ", next_of_kin_number=" + next_of_kin_number + ", insured=" + insured
				+ ", insurance_number=" + insurance_number + ", date_discharge=" + date_discharge + "]";
	}




	
	

}
