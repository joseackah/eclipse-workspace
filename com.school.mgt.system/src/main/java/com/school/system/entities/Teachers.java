package com.school.system.entities;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="teachers")
public class Teachers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer teacherId;
	private String firstName;
	private String lastName;
	private String qualification;
	private double salary;
	private Date startDate;
	
	//@OneToOne
	//@JoinColumn(name="Teacher")
	//private TeacherAddress teacherAddress;
	
	
	/*public TeacherAddress getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(TeacherAddress teacherAddress) {
		this.teacherAddress = teacherAddress;
	}*/
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "Teachers [teacherId=" + teacherId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", qualification=" + qualification + ", salary=" + salary + ", startDate=" + startDate
				+ ", teacherAddress=" +/* teacherAddress +*/ "]";
	}
	
	
	

}
