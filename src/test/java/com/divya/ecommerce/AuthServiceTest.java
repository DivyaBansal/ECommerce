package com.divya.ecommerce;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.divya.ecommerce.domain.Seller;
import com.divya.ecommerce.dto.SellerDto;
import com.divya.ecommerce.service.SellerService;

public class AuthServiceTest {
	@Autowired
	SellerService sellerService;
	
	@Test
	public void shouldBeableToRegister() {
		SellerDto seller = buildUser();
		Seller registeredUser = sellerService.register(seller);
		System.out.println("user" + registeredUser);
		Assert.notNull(registeredUser);
		Assert.isTrue(registeredUser.getEmail().equals("divyalb8@yahoo.co.in"));

	}
	
	private SellerDto buildUser() {
		SellerDto seller = new SellerDto();
		seller.setEmail("divyalb8@yahoo.co.in");
		seller.setName("divya");
		seller.setPassword("1234dfj");
		seller.setMobile(01234);
		return seller;
	}
	
}
