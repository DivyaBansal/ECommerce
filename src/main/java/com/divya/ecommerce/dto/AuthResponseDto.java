package com.divya.ecommerce.dto;

import java.io.Serializable;

import com.divya.ecommerce.domain.Seller;

public class AuthResponseDto implements Serializable {

private static final long serialVersionUID = 270704667626143534L;

private String token;

  private Seller seller;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

 
  public Seller getSeller() {
	return seller;
}

public void setSeller(Seller seller) {
	this.seller = seller;
}

@Override
  public String toString() {
    return "AuthDto [token=" + token + ", user=" + seller+ "]";
  }

  public AuthResponseDto(String token, Seller seller) {
    this.token = token;
    this.seller = seller;
  }

  public AuthResponseDto() {}

}
