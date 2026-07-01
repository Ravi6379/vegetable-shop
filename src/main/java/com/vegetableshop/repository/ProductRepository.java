package com.vegetableshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vegetableshop.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}