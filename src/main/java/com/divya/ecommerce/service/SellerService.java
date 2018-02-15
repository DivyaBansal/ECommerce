package com.divya.ecommerce.service;

import com.divya.ecommerce.domain.Seller;
import com.divya.ecommerce.dto.LoginDto;
import com.divya.ecommerce.dto.SellerDto;

public interface SellerService {

	Seller register(SellerDto sellerDto);

	Seller login(LoginDto loginDto);

	void logout(SellerDto SellerDto);
	
	
}
