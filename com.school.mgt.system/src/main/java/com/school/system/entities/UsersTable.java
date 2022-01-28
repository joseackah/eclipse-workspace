package com.school.system.entities;

import javax.persistence.*;

@Entity
@Table(name="users_table")
public class UsersTable  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name= "firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="userName")
	private String userName;
	@Column(name="email")
	private String email;
	private String userType;
	
	
	
	public UsersTable() {
		super();
		
	}



	public UsersTable(int id, String firstName, String lastName, String userName, String email, String userType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.userType = userType;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	@Override
	public String toString() {
		return "UsersTable [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", email=" + email + ", userType=" + userType + "]";
	}
	
	
	
	
	

}
