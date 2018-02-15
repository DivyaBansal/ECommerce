package com.divya.ecommerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.divya.ecommerce.domain.Seller;

public interface SellerRepository extends MongoRepository<Seller, String>{
	Seller findByEmail(String email);
}
