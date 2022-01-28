package org.nurses.management.system.integration.dto;

public class Users {
	
	
	private Integer id;
	private String name;
	private String userId;
	private String userType;
	private String ward_name;
	private String userPassword;
	private String image;
	private String dateCreated;
	private String createdBy;
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Users(Integer id, String name, String userId, String userType, String userPassword, String image,
			String dateCreated, String createdBy, String ward_name) {
		super();
		this.id = id;
		this.name = name;
		this.userId = userId;
		this.userType = userType;
		this.userPassword = userPassword;
		this.image = image;
		this.dateCreated = dateCreated;
		this.createdBy = createdBy;
		this.ward_name = ward_name;
	}



	public void setWard_name(String ward_name) {
		this.ward_name = ward_name;
	}
	
	public String getWard_name() {
		return ward_name;
	}
	

	public void setImage(String image) {
		this.image = image;
	}
	
	public String getImage() {
		return image;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public String getUserType() {
		return userType;
	}




	public void setUserType(String userType) {
		this.userType = userType;
	}




	public String getUserPassword() {
		return userPassword;
	}




	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}




	public String getDateCreated() {
		return dateCreated;
	}




	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}




	public String getCreatedBy() {
		return createdBy;
	}




	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}




	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", userId=" + userId + ", userType=" + userType + ", ward_name="
				+ ward_name + ", userPassword=" + userPassword + ", image=" + image + ", dateCreated=" + dateCreated
				+ ", createdBy=" + createdBy + "]";
	}
	
	
	
	

}
