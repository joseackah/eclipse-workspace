package org.nurses.management.system.entity;

import javax.persistence.*;

@Entity
public class Ward {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String ward_name;
	private int total_staff;
	private int bed_capacity;
	private String ward_incharge;
	
	
	public Ward() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ward(int id, String ward_name, int total_staff, int bed_capacity, String ward_incharge) {
		super();
		this.id = id;
		this.ward_name = ward_name;
		this.total_staff = total_staff;
		this.bed_capacity = bed_capacity;
		this.ward_incharge = ward_incharge;
	}

	public String getWard_incharge() {
		return ward_incharge;
	}
	
	public void setWard_incharge(String ward_incharge) {
		this.ward_incharge= ward_incharge;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getWard_name() {
		return ward_name;
	}


	public void setWard_name(String ward_name) {
		this.ward_name = ward_name;
	}


	public int getTotal_staff() {
		return total_staff;
	}


	public void setTotal_staff(int total_staff) {
		this.total_staff = total_staff;
	}


	public int getBed_capacity() {
		return bed_capacity;
	}


	public void setBed_capacity(int bed_capacity) {
		this.bed_capacity = bed_capacity;
	}


	@Override
	public String toString() {
		return "Ward [id=" + id + ", ward_name=" + ward_name + ", total_staff=" + total_staff + ", bed_capacity="
				+ bed_capacity + ", ward_incharge=" + ward_incharge + "]";
	}
	
	
	

}
