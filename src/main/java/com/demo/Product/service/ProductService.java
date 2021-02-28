package com.demo.Product.service;

import java.util.List;

import com.demo.Product.entity.Product;


public interface ProductService {
	
	public void addProduct(Product prd);
	public Product searchProductByName(String name);
	public Product searchProductByColor(String color);
	public List<Product> getAllRedProducts();


}
