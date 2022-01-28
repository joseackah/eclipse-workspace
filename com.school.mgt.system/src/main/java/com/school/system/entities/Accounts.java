package com.school.system.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="accounts")
public class Accounts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer account_id;
	@Column(name= "student_id")
	private Integer id;
	private String first_name;
	private String last_name;
	private double amount_due;
	private double amount_paid;
	private double balance;
	private String level;
	private Date date_paid;
	
	

	public Accounts() {
		
	}



	public Accounts(Integer account_id, Integer id, String first_name, String last_name, double amount_due,
			double amount_paid, double balance, String level, Date date_paid) {
		super();
		this.account_id = account_id;
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.amount_due = amount_due;
		this.amount_paid = amount_paid;
		this.balance = balance;
		this.level = level;
		this.date_paid = date_paid;
	}



	public Integer getAccount_id() {
		return account_id;
	}



	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
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



	public String getLevel() {
		return level;
	}



	public void setLevel(String level) {
		this.level = level;
	}



	public Date getDate_paid() {
		return date_paid;
	}



	public void setDate_paid(Date date_paid) {
		this.date_paid = date_paid;
	}



	@Override
	public String toString() {
		return "Accounts [account_id=" + account_id + ", id=" + id + ", first_name=" + first_name + ", last_name="
				+ last_name + ", amount_due=" + amount_due + ", amount_paid=" + amount_paid + ", balance=" + balance
				+ ", level=" + level + ", date_paid=" + date_paid + "]";
	}



	
	

}
