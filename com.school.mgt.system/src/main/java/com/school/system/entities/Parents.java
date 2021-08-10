package com.school.system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parents")
public class Parents {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer parentId;
	private String firstName;
	private String lastName;
	private String occupation;
	private String contact;
	@Column(name="residenceNumber")
	private String resNumber;
	
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy="parent")
	//private List<Students> student = new ArrayList<>();
	
	
	
	/*public List<Students> getStudent() {
		return student;
	}
	public void setStudent(List<Students> student) {
		this.student = student;
	}*/
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
				+ occupation + ", contact=" + contact + ", resNumber=" + resNumber + ", student=" + /*student +*/ "]";
	}
	
	

}
