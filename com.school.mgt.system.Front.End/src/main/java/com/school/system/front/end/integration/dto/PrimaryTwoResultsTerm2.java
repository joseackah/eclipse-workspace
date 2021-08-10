package com.school.system.front.end.integration.dto;

public class PrimaryTwoResultsTerm2 {
	
	
	private Integer results_id;
	private Integer student_id;
	private String first_name;
	private String last_name;
	private String subjects;
	private double marks;
	private String grade;
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
	@Override
	public String toString() {
		return "PrimaryTwoResultsTerm2 [results_id=" + results_id + ", student_id=" + student_id + ", first_name="
				+ first_name + ", last_name=" + last_name + ", subjects=" + subjects + ", marks=" + marks + ", grade="
				+ grade + "]";
	}
	
	
	

}
