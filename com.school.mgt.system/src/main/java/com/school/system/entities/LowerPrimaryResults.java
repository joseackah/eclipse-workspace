package com.school.system.entities;

import javax.persistence.*;

@Entity
@Table(name="lower_primary_results")
public class LowerPrimaryResults {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer results_id;
	private Integer student_id;
	private String first_name;
	private String last_name;
	private String subjects;
	private double marks;
	private String grade;
	private String level;
	
	
	
	public LowerPrimaryResults() {
		
	}



	public LowerPrimaryResults(Integer results_id, Integer student_id, String first_name, String last_name,
			String subjects, double marks, String grade, String level) {
		super();
		this.results_id = results_id;
		this.student_id = student_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.subjects = subjects;
		this.marks = marks;
		this.grade = grade;
		this.level = level;
	}



	public Integer getResults_id() {
		return results_id;
	}



	public void setResults_id(Integer results_id) {
		this.results_id = results_id;
	}



	public Integer getStudent_id() {
		return student_id;
	}



	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getSubjects() {
		return subjects;
	}



	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}



	public double getMarks() {
		return marks;
	}



	public void setMarks(double marks) {
		this.marks = marks;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public String getLevel() {
		return level;
	}



	public void setLevel(String level) {
		this.level = level;
	}



	@Override
	public String toString() {
		return "LowerPrimaryResults [results_id=" + results_id + ", student_id=" + student_id + ", first_name="
				+ first_name + ", last_name=" + last_name + ", subjects=" + subjects + ", marks=" + marks + ", grade="
				+ grade + ", level=" + level + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
