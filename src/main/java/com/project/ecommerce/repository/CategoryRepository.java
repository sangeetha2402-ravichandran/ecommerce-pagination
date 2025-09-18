package com.project.ecommerce.repository;

import com.project.ecommerce.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {}
