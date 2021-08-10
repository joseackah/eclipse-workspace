package com.school.system.entities;

import javax.persistence.*;

@Entity
@Table(name="student_address")
public class StudentAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="s_adrs_id")
	private Integer studentAddId;
	private String town;
	private String city;
	@Column(name="postal_code")
	private String postalCode;
	@Column(name="residence_number")
	private String resNumber;
	
	//@OneToOne
	//@JoinColumn(name="student")
	//private Students students;
	
	
	public Integer getStudentAddId() {
		return studentAddId;
	}
	public void setStudentAddId(Integer studentAddId) {
		this.studentAddId = studentAddId;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getResNumber() {
		return resNumber;
	}
	public void setResNumber(String resNumber) {
		this.resNumber = resNumber;
	}
	
	/*public Students getStudents() {
		return students;
	}
	public void setStudents(Students students) {
		this.students = students;
	}*/
	@Override
	public String toString() {
		return "StudentAddress [studentAddId=" + studentAddId + ", town=" + town + ", city=" + city + ", postalCode="
				+ postalCode + ", resNumber=" + resNumber + ", students=" + /*students +*/ "]";
	}
	
	

}
