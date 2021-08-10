package com.school.system.front.end.integration.dto;

public class TeacherAddress {
	
	private Integer teacherAddressId;
	private String town;
	private String city;
	private String postalCode;
	private String resNumber;
	
	
	
	public Integer getTeacherAddressId() {
		return teacherAddressId;
	}
	public void setTeacherAddressId(Integer teacherAddressId) {
		this.teacherAddressId = teacherAddressId;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getResNumber() {
		return resNumber;
	}
	public void setResNumber(String resNumber) {
		this.resNumber = resNumber;
	}
	@Override
	public String toString() {
		return "TeacherAddress [teacherAddressId=" + teacherAddressId + ", town=" + town + ", city=" + city + ", postalCode="
				+ postalCode + ", resNumber=" + resNumber + "]";
	}
	
	

}
