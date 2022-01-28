package com.school.system.entities;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Students {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")
	private Integer studentId;
	private String firstName;
	private String lastName;
	private String sex;
	private double age;
	private String address;
	@Column(name="class")
	private String classLevel;
	
	
	//@OneToOne
	//@JoinColumn(name="student")
	//private StudentAddress studentAddress;
	
	//@ManyToOne
	//@JoinColumn(name="student")
	//private Parents parent;
	
	
	/*public Parents getParent() {
		return parent;
	}
	public void setParent(Parents parent) {
		this.parent = parent;
	}*/
	
	public Students() {
		super();
	}


	public Students(Integer studentId, String firstName, String lastName, String sex, double age, String address,
			String classLevel) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.age = age;
		this.address = address;
		this.classLevel = classLevel;
	}


	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
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


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public double getAge() {
		return age;
	}


	public void setAge(double age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getClassLevel() {
		return classLevel;
	}


	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}


	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", sex="
				+ sex + ", age=" + age + ", address=" + address + ", classLevel=" + classLevel + "]";
	}
	
	
	
	
	
	

}
