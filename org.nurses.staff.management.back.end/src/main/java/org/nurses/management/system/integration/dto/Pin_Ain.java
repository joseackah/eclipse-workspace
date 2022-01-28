package org.nurses.management.system.integration.dto;

import java.util.List;

public class Pin_Ain {
	
	private int id;
	private String staff_id;
	private String pin_ain_number;
	private String type;
	private String date_issue;
	private String renewal_date;
	private String expire_date;
	
	
	public Pin_Ain() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	  public Pin_Ain (List<Pin_Ain> pin1) {
	  
	  }
	  
	  public Pin_Ain (Pin_Ain[] pin) {
	  
	  }
	 


	public Pin_Ain(int id, String staff_id, String pin_ain_number, String type, String date_issue, String renewal_date,
			String expire_date) {
		super();
		this.id = id;
		this.staff_id = staff_id;
		this.pin_ain_number = pin_ain_number;
		this.type = type;
		this.date_issue = date_issue;
		this.renewal_date = renewal_date;
		this.expire_date = expire_date;
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


	public String getPin_ain_number() {
		return pin_ain_number;
	}


	public void setPin_ain_number(String pin_ain_number) {
		this.pin_ain_number = pin_ain_number;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDate_issue() {
		return date_issue;
	}


	public void setDate_issue(String date_issue) {
		this.date_issue = date_issue;
	}


	public String getRenewal_date() {
		return renewal_date;
	}


	public void setRenewal_date(String renewal_date) {
		this.renewal_date = renewal_date;
	}


	public String getExpire_date() {
		return expire_date;
	}


	public void setExpire_date(String expire_date) {
		this.expire_date = expire_date;
	}


	@Override
	public String toString() {
		return "Pin_Ain [id=" + id + ", staff_id=" + staff_id + ", pin_ain_number=" + pin_ain_number + ", type=" + type
				+ ", date_issue=" + date_issue + ", renewal_date=" + renewal_date + ", expire_date=" + expire_date
				+ "]";
	}


			
	

}
