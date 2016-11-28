package com.hm.ata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Credentials")
public class Credentials{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userID")
	private String userID;
	
	@Column(name="password")
	String password;
	
	@Column(name="userType")
	String userType;
	
	@Column(name="loginStatus")
	int loginStatus;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	
	
}
