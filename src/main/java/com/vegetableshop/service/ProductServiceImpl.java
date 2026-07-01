package com.vegetableshop.service;

import org.springframework.stereotype.Service;

import com.vegetableshop.entity.Product;
import com.vegetableshop.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}