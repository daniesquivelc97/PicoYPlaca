package com.uco.dto;

public class User {
	
	public String email;
	
	public String password;
	
	public String token;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String email, String password, String token) {
		super();
		this.email = email;
		this.password = password;
		this.token = token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
