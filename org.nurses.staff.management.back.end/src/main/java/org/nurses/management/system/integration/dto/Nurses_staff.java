package org.nurses.management.system.integration.dto;

public class Nurses_staff {
	
	private int id;
	private String staff_id;
	private String name;
	private String category;
	private String address;
	private String ssnit;
	private String date_of_birth;
	private String sex;
	private String assumption_date;
	private String basic_qualification;
	private String additional_qualification;
	private String status;
	private String grade;
	
	
	public Nurses_staff() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Nurses_staff(int id, String staff_id, String name, String category, String address, String ssnit,String grade,
			String date_of_birth, String sex, String assumption_date, String basic_qualification, String additional_qualification, String status) {
		super();
		this.id = id;
		this.staff_id = staff_id;
		this.name = name;
		this.category = category;
		this.address = address;
		this.ssnit = ssnit;
		this.date_of_birth = date_of_birth;
		this.sex = sex;
		this.assumption_date = assumption_date;
		this.basic_qualification = basic_qualification;
		this.additional_qualification = additional_qualification;
		this.status = status;
		this.grade = grade;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getAdditional_qualification() {
		return additional_qualification;
	}


	public void setAdditional_qualification(String additional_qualification) {
		this.additional_qualification = additional_qualification;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getSsnit() {
		return ssnit;
	}


	public void setSsnit(String ssnit) {
		this.ssnit = ssnit;
	}


	public String getDate_of_birth() {
		return date_of_birth;
	}


	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getAssumption_date() {
		return assumption_date;
	}


	public void setAssumption_date(String assumption_date) {
		this.assumption_date = assumption_date;
	}


	public String getBasic_qualification() {
		return basic_qualification;
	}


	public void setBasic_qualification(String basic_qualification) {
		this.basic_qualification = basic_qualification;
	}


	@Override
	public String toString() {
		return "Nurses_staff [id=" + id + ", staff_id=" + staff_id + ", name=" + name + ", category=" + category
				+ ", address=" + address + ", ssnit=" + ssnit + ", date_of_birth=" + date_of_birth + ", sex=" + sex
				+ ", assumption_date=" + assumption_date + ", basic_qualification=" + basic_qualification
				+ ", additional_qualification=" + additional_qualification + ", status=" + status + ", grade=" + grade
				+ "]";
	}


	


	
		
	

}
