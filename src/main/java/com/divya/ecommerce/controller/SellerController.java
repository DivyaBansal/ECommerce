package com.divya.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.divya.ecommerce.domain.Seller;
import com.divya.ecommerce.dto.SellerDto;

@RestController
@RequestMapping(value = "user")
public class SellerController {

	public SellerController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public Seller register(@RequestBody @Valid SellerDto seller){
		return sellerService.register(seller);

	}
}
