package com.project.ecommerce;

import com.project.ecommerce.model.Product;
import com.project.ecommerce.repository.ProductRepository;
import com.project.ecommerce.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ProductServiceTest {

    private final ProductRepository productRepository = Mockito.mock(ProductRepository.class);
    private final ProductService productService = new ProductService(productRepository);

    @Test
    void testGetAllProducts() {
        List<Product> mockProducts = Arrays.asList(
                new Product("1", "Product1", "Desc1", 100, "cat1"),
                new Product("2", "Product2", "Desc2", 200, "cat2")
        );

        when(productRepository.findAll()).thenReturn(mockProducts);
        List<Product> products = productService.getAllProducts();
        assertEquals(2, products.size());
        assertEquals("Product1", products.get(0).getName());
    }

    @Test
    void testGetProductByCategoryID(){
        List<Product> mockCategoryProducts = Arrays.asList(
                new Product("1", "Product1", "Desc1", 100, "cat1"),
                new Product("3", "Product3", "Desc3", 100, "cat1")
        );
        String category = "cat1";
        when(productRepository.findByCategoryID(category)).thenReturn(mockCategoryProducts);
        List<Product> products = productService.getProductByCategory(category);
        assertEquals(2, products.size());
        assertEquals("Product1", products.get(0).getName());

    }


    @Test
    void testSaveProduct(){
        Product product = new Product("1", "Product1", "Desc1", 100, "cat1");
        when(productRepository.save(product)).thenReturn(product);
        Product products = productService.saveProduct(product);
        assertEquals("Product1", products.getName());

    }



    }

