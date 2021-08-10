package com.school.front.integration.dto;

public class Parents {
	
	private Integer parentId;
	private String firstName;
	private String lastName;
	private String occupation;
	private String contact;
	private String resNumber;
	
	
	
	
	
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
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
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getResNumber() {
		return resNumber;
	}
	public void setResNumber(String resNumber) {
		this.resNumber = resNumber;
	}
	@Override
	public String toString() {
		return "Parents [parentId=" + parentId + ", firstName=" + firstName + ", lastName=" + lastName + ", occupation="
				+ occupation + ", contact=" + contact + ", resNumber=" + resNumber + "]";
	}
	
	
	

}
