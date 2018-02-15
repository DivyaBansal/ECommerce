package com.divya.ecommerce.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.mongodb.core.index.Indexed;

public class SellerDto implements Serializable {
	private static final long serialVersionUID = 682941103635076038L;

	public SellerDto() {
		// TODO Auto-generated constructor stub
	}
	@Indexed(unique = true)
	@NotBlank
	@Email	
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

	@Override
	public String toString() {
		return "SellerDto [email=" + email + ", name=" + name + ", password=" + password + "]";
	}

}
