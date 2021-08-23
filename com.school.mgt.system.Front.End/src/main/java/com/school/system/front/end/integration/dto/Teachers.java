package com.school.system.front.end.integration.dto;

import java.sql.Date;

public class Teachers {
	
	private Integer teacherId;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String qualification;
	private String email;
	private String gender;
	private String phoneNumber;
	private String address;
	private double salary;
	private Date appointmentDate;
	
	
	
	
	
	
	
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
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
		return "Teachers [teacherId=" + teacherId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", qualification=" + qualification + ", email=" + email + ", gender="
				+ gender + ", phoneNumber=" + phoneNumber + ", address=" + address + ", salary=" + salary
				+ ", appointmentDate=" + appointmentDate + "]";
	}
	
	
	
	
	
	
	
	
	

}
