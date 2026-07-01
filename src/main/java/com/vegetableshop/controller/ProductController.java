package com.vegetableshop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vegetableshop.entity.Product;
import com.vegetableshop.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	
	  private final ProductService productService;

	    public ProductController(ProductService productService) {
	        this.productService = productService;
	    }
	    
	    @PostMapping
	    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {

	        Product savedProduct = productService.saveProduct(product);

	        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	    }
}