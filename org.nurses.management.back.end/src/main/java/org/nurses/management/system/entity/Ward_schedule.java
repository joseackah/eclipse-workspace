package org.nurses.management.system.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Ward_schedule {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String staff_id;
	private String ward_name;
	private String nurse_cate;
	private Date effective_date;
	
	
	public Ward_schedule() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ward_schedule(int id, String staff_id, String ward_name, String nurse_cate, Date effective_date) {
		super();
		this.id = id;
		this.staff_id = staff_id;
		this.ward_name = ward_name;
		this.nurse_cate = nurse_cate;
		this.effective_date = effective_date;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStaff_id() {
		return staff_id;
	}


	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}


	public String getWard_name() {
		return ward_name;
	}


	public void setWard_name(String ward_name) {
		this.ward_name = ward_name;
	}


	public String getNurse_cate() {
		return nurse_cate;
	}


	public void setNurse_cate(String nurse_cate) {
		this.nurse_cate = nurse_cate;
	}
	
	


	public Date getEffective_date() {
		return effective_date;
	}


	public void setEffective_date(Date effective_date) {
		this.effective_date = effective_date;
	}


	@Override
	public String toString() {
		return "Ward_schedule [id=" + id + ", staff_id=" + staff_id + ", ward_name=" + ward_name + ", nurse_cate="
				+ nurse_cate + ", effective_date=" + effective_date + "]";
	}
	
	
	

}
