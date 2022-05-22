package com.keep.googlekeepspringboot.user.Entity;

import java.util.UUID;

public class User {
    private final UUID userId;
    private String userName;
    private String password;
    private String mobileNumber;
    private String email;
    public User() {
    	this.userId=UUID.randomUUID();
    }
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UUID getUserId() {
		return userId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", mobileNumber="
				+ mobileNumber + ", email=" + email + "]";
	}
    
}
