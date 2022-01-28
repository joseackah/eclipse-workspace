package org.nurses.management.system.integration.dto;

public class Leave {
	
	private Integer id;
	private String ward_name;
	private String staff_id;
	private String name;
	private String staff_cate;
	private String leave_type;
	private Integer leave_day_earn;
	private Integer leave_days_apply;
	private String leave_date;
	private String incharge_recom;
	private String incharge_name;
	private String leave_end_date;
	private String resumption_date;
	private String date_approved;
	private String approved_by;
	private String remarks;
	
	
	
	
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Leave(Integer id, String staff_id, String name, String staff_cate, String leave_type, Integer leave_day_earn,
			Integer leave_days_apply, String leave_date, String leave_end_date, String resumption_date,
			String date_approved, String approved_by, String incharge_recom, String incharge_name, String remarks, String ward_name) {
		super();
		this.id = id;
		this.staff_id = staff_id;
		this.name = name;
		this.staff_cate = staff_cate;
		this.leave_type = leave_type;
		this.leave_day_earn = leave_day_earn;
		this.leave_days_apply = leave_days_apply;
		this.leave_date = leave_date;
		this.incharge_recom = incharge_recom;
		this.incharge_name = incharge_name;
		this.leave_end_date = leave_end_date;
		this.resumption_date = resumption_date;
		this.date_approved = date_approved;
		this.approved_by = approved_by;
		this.remarks = remarks;
		this.ward_name = ward_name;
	}




	public String getWard_name() {
		return ward_name;
	}




	public void setWard_name(String ward_name) {
		this.ward_name = ward_name;
	}




	public Integer getId() {
		return id;
	}




	public String getRemarks() {
		return remarks;
	}




	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getStaff_id() {
		return staff_id;
	}

	public void setIncharge_recom(String incharge_recom) {
		this.incharge_recom = incharge_recom;
	}
	
	public String getIncharge_recom() {
		return incharge_recom;
	}
	
	public void setIncharge_name(String incharge_name) {
		this.incharge_name = incharge_name;
	}
	
	public String getIncharge_name() {
		return incharge_name;
	}


	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getStaff_cate() {
		return staff_cate;
	}




	public void setStaff_cate(String staff_cate) {
		this.staff_cate = staff_cate;
	}




	public String getLeave_type() {
		return leave_type;
	}




	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}




	public Integer getLeave_day_earn() {
		return leave_day_earn;
	}




	public void setLeave_day_earn(Integer leave_day_earn) {
		this.leave_day_earn = leave_day_earn;
	}




	public Integer getLeave_days_apply() {
		return leave_days_apply;
	}




	public void setLeave_days_apply(Integer leave_days_apply) {
		this.leave_days_apply = leave_days_apply;
	}




	public String getLeave_date() {
		return leave_date;
	}




	public void setLeave_date(String leave_date) {
		this.leave_date = leave_date;
	}




	public String getLeave_end_date() {
		return leave_end_date;
	}




	public void setLeave_end_date(String leave_end_date) {
		this.leave_end_date = leave_end_date;
	}




	public String getResumption_date() {
		return resumption_date;
	}




	public void setResumption_date(String resumption_date) {
		this.resumption_date = resumption_date;
	}




	public String getDate_approved() {
		return date_approved;
	}




	public void setDate_approved(String date_approved) {
		this.date_approved = date_approved;
	}




	public String getApproved_by() {
		return approved_by;
	}




	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}




	@Override
	public String toString() {
		return "Leave [id=" + id + ", ward_name=" + ward_name + ", staff_id=" + staff_id + ", name=" + name
				+ ", staff_cate=" + staff_cate + ", leave_type=" + leave_type + ", leave_day_earn=" + leave_day_earn
				+ ", leave_days_apply=" + leave_days_apply + ", leave_date=" + leave_date + ", incharge_recom="
				+ incharge_recom + ", incharge_name=" + incharge_name + ", leave_end_date=" + leave_end_date
				+ ", resumption_date=" + resumption_date + ", date_approved=" + date_approved + ", approved_by="
				+ approved_by + ", remarks=" + remarks + "]";
	}




	
	

}
