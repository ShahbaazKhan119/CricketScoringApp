package com.ecw.cricket.user;

//Entity is used to store user information
public class User {

	private int userId;
	private UserType userType;
	
	public User(int userId, UserType userType) {
		super();
		this.userId = userId;
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	
	
}
