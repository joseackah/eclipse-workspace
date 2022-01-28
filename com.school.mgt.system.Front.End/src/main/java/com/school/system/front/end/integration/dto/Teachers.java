package com.school.system.front.end.integration.dto;

import java.sql.Date;

public class Teachers {
	
	private Integer teacherId;
	private String fName;
	private String lName;
	private Date dateOfBirth;
	private String qualification;
	private String email;
	private String gender;
	private String phoneNumber;
	private String address;
	private double salary;
	private Date appointmentDate;
	
	
	public Teachers() {
		super();
	}


	public Teachers(Integer teacherId, String fName, String lName, Date dateOfBirth, String qualification, String email,
			String gender, String phoneNumber, String address, double salary, Date appointmentDate) {
		super();
		this.teacherId = teacherId;
		this.fName = fName;
		this.lName = lName;
		this.dateOfBirth = dateOfBirth;
		this.qualification = qualification;
		this.email = email;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
		this.appointmentDate = appointmentDate;
	}
	
	
	


	public Integer getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Date getAppointmentDate() {
		return appointmentDate;
	}


	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	@Override
	public String toString() {
		return "Teachers [teacherId=" + teacherId + ", fName=" + fName + ", lName=" + lName + ", dateOfBirth="
				+ dateOfBirth + ", qualification=" + qualification + ", email=" + email + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", salary=" + salary + ", appointmentDate="
				+ appointmentDate + "]";
	}
	
	

}
