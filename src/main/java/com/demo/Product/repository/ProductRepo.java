package com.demo.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Product.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Long> {

	Product findByProductName(String name);
	Product findByColor(String color);
}
