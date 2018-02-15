package com.divya.ecommerce.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class LoginDto implements Serializable {

	private static final long serialVersionUID = 542842658623047539L;

	 @NotEmpty
	 @Email
	  private String email;

	  @NotBlank
	  private String password;

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

	  public LoginDto() {}

	  public LoginDto(String email, String password) {
	    this.email = email;
	    this.password = password;
	  }

	  @Override
	  public String toString() {
	    return "LoginDto [email=" + email + ", password=" + password + "]";
	  }
	
}
