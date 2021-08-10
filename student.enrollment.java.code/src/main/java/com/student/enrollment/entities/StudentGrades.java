package com.student.enrollment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentGrades {
	@Id
	int id;
	String course;
	double ccgpa;
	double finalGpa;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getCcgpa() {
		return ccgpa;
	}
	public void setCcgpa(double ccgpa) {
		this.ccgpa = ccgpa;
	}
	public double getFinalGpa() {
		return finalGpa;
	}
	public void setFinalGpa(double finalGpa) {
		this.finalGpa = finalGpa;
	}

	
	
}
