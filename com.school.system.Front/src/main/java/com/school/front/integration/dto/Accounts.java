package com.school.front.integration.dto;

public class Accounts {
	
	
	private Integer account_id;
	private Integer student_id;
	private String first_name;
	private String last_name;
	private double amount_due;
	private double amount_paid;
	private double balance;
	
	

	public Integer getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
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
	public double getAmount_due() {
		return amount_due;
	}
	public void setAmount_due(double amount_due) {
		this.amount_due = amount_due;
	}
	public double getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(double amount_paid) {
		this.amount_paid = amount_paid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accounts [account_id=" + account_id + ", student_id=" + student_id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", amount_due=" + amount_due + ", amount_paid=" + amount_paid
				+ ", balance=" + balance + "]";
	}
	
	

}
