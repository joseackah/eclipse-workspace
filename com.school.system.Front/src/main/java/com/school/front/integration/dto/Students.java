package com.school.front.integration.dto;

public class Students {
	
	private Integer studentId;
	private String firstName;
	private String lastName;
	private String sex;
	private double age;
	private String classLevel;
	
	
	
	
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
	public String getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}
	
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", sex="
				+ sex + ", age=" + age + ", classLevel=" + classLevel + "]";
	}
	
	

}
