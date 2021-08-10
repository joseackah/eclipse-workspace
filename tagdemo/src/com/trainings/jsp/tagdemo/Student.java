package com.trainings.jsp.tagdemo;

public class Student {
	private String firstName;
	private String lastName;
	private boolean feesDiscount;
	public Student(String firstName, String lastName, boolean feesDiscount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.feesDiscount = feesDiscount;
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
	public boolean getFeesDiscount() {
		return feesDiscount;
	}
	public void setFeesDiscount(boolean feesDiscount) {
		this.feesDiscount = feesDiscount;
	}
	
	
	
	

}
