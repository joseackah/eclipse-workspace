package com.school.system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="error_testing", uniqueConstraints={@UniqueConstraint(columnNames={"student_id"})})
public class StudentsStudentTest {
	
	@Id
	@Column(name="student_id")
	private String studentId;
	private String firstName;
	private String lastName;
	private String sex;
	private double age;
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
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
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
	public String getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}
	
	
	/*public StudentAddress getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}*/
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", sex="
				+ sex + ", age=" + age + ", classLevel=" + classLevel + ", studentAddress=" + /*studentAddress + */"]";
	}
	
	
	

}
