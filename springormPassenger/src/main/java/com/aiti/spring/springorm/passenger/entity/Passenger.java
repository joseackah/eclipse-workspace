package com.aiti.spring.springorm.passenger.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Passenger {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	@Column(name="homeTown")
	private String hTown;
	@Column(name="phoneNumber")
	private String pNumber;
	
	
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
	public String gethTown() {
		return hTown;
	}
	public void sethTown(String hTown) {
		this.hTown = hTown;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", hTown=" + hTown
				+ ", pNumber=" + pNumber + "] \n";
	}
	
	
	
}
