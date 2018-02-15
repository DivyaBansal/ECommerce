package com.divya.ecommerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.divya.ecommerce.domain.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

	
}
