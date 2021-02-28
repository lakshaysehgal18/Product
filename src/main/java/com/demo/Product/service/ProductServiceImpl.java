package com.demo.Product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.demo.Product.entity.Product;
import com.demo.Product.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productrepository;

	public void addProduct(Product prd) {

		productrepository.save(prd);

	}

	public Product searchProductByName(String name) {
		return productrepository.findByProductName(name);

	}

	public Product searchProductByColor(String color) {
		return productrepository.findByColor(color);

	}

	@Override
	public List<Product> getAllRedProducts() {
		
		return productrepository.getAllRedProducts();
	}


}
