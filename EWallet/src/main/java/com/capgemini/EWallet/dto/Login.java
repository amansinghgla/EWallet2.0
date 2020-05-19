package com.capgemini.EWallet.dto;

public class Login {

	Integer userId;
	String password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(Integer userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
