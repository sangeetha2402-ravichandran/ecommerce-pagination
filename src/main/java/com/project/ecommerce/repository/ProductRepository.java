package com.project.ecommerce.repository;

import com.project.ecommerce.model.Order;
import com.project.ecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository  extends MongoRepository<Product, String> {

    List<Product> findByCategoryID(String categoryId);
}
