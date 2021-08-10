package com.hospital.staff.bunglaw.allocation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="staff_table")
public class StaffRoll {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int staffId;
	private String staffFirstName;
	private String stafLastName;
	private String department;
	
	@OneToOne
	@JoinColumn(name="bunglawId")
	private BunglawSlot bunglawSlot;

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStafLastName() {
		return stafLastName;
	}

	public void setStafLastName(String stafLastName) {
		this.stafLastName = stafLastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public BunglawSlot getBunglawSlot() {
		return bunglawSlot;
	}

	public void setBunglawSlot(BunglawSlot bunglawSlop) {
		this.bunglawSlot = bunglawSlop;
	}

	@Override
	public String toString() {
		return "StaffRoll [staffId=" + staffId + ", staffFirstName=" + staffFirstName + ", stafLastName=" + stafLastName
				+ ", department=" + department + ", bunglawSlot=" + bunglawSlot + "]";
	}
	

}
