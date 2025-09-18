package com.project.ecommerce.controller;


import com.project.ecommerce.model.Product;
import com.project.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(@RequestBody Product product){
        return productService.getAllProducts();

    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getProductByCateogryId(@PathVariable String categoryId){
        return productService.getProductByCategory(categoryId);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }


}
