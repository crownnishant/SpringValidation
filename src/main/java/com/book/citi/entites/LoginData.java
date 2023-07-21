package com.book.citi.entites;

public class LoginData {

	private String userName;
	private String email;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		System.out.println("setting username");
		this.userName = userName;
	}
	public String getEmail() {
		System.out.println("getting email configuration");
		return email;
	}
	public void setEmail(String email) {
		System.out.println("setting email");
		this.email = email;
	}
	
	
}
