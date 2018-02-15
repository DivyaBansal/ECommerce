package com.divya.ecommerce.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divya.ecommerce.domain.Seller;
import com.divya.ecommerce.dto.LoginDto;
import com.divya.ecommerce.dto.SellerDto;
import com.divya.ecommerce.repository.SellerRepository;
import com.divya.ecommerce.service.SellerService;

@Service
public class SellerServiceImpl implements SellerService{
	@Autowired
	private SellerRepository sellerRepository;

	@Override
	public Seller register(SellerDto sellerDto) {
		Seller seller = sellerRepository.findByEmail(sellerDto.getEmail());
		if (seller == null) {
			seller = new Seller();
			sellerDto.setPassword(sellerDto.getPassword());
			BeanUtils.copyProperties(sellerDto,seller);
			//sendEmail(sellerDto);
			return sellerRepository.save(seller);
			}
	else{
		System.out.println("User already exists");
	}
		return null;
   }
	@Override
	public Seller login(LoginDto loginDto) {
		Seller seller = sellerRepository.findByEmail(loginDto.getEmail());
		if(seller==null){
			System.out.println("User does not exist");
		}
		else{
		if(seller.getPassword()==loginDto.getPassword()){
			return seller;
		}
		else{
			System.out.println("Incorrect password");
		}
		}
		return null;//
	}
		@Override
	public void logout(SellerDto SellerDto) {
		// TODO Auto-generated method stub
		
	}

}
