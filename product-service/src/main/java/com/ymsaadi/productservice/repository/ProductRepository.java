package com.ymsaadi.productservice.repository;

import com.ymsaadi.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}