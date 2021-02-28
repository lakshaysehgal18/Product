package com.demo.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.demo.Product.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Long> {

	Product findByProductName(String name);
	Product findByColor(String color);


	@Query(value="Select * from Product where color='RED'",nativeQuery=true)
	List<Product> getAllRedProducts();
}
