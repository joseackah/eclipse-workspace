package com.student.enrollment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEnroll {
	@Id
	int id;
	String firstName;
	String lastName;
	String address;
	int academicLevel;
	String programme;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAcademicLevel() {
		return academicLevel;
	}
	public void setAcademicLevel(int academicLevel) {
		this.academicLevel = academicLevel;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	@Override
	public String toString() {
		return "StudentEnroll [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", academicLevel=" + academicLevel + ", programme=" + programme + "]";
	}

	
	
}
