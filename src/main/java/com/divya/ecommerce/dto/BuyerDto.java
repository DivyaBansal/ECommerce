package com.divya.ecommerce.dto;

import java.io.Serializable;

public class BuyerDto implements Serializable {

	private static final long serialVersionUID = -1127440754079536221L;

	public BuyerDto() {
		// TODO Auto-generated constructor stub
	}
	private String email;
	
	private String name;
	
	private String password;
	
	private Integer mobile;
		
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	
}
