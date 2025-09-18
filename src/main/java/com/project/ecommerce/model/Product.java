package com.project.ecommerce.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "products")

public class Product {

    @Id
    private String id;
    @NotBlank(message = "Product name is required")
    private String name;

    private String description;

    private double price;

    private String categoryId;




}
