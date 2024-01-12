package com.demo.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.demo.Product.entity.Product;
import com.demo.Product.model.ErrorMessage;
import com.demo.Product.service.ProductService;

@RestController
public class ProductRestController {

	//First Commit Master
	//Second Commit Master
	//Third Commit master
	//4th Commit master
	//5th commit master

	// First commit feature 3


	@Autowired
	private ProductService productservice;
	
	@PostMapping("/addProduct")
	public ResponseEntity<?> getHello(@RequestBody Product prd){
		
		productservice.addProduct(prd);
		
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/searchByProductName/{product}")
	public ResponseEntity<?> searchByProductName(@PathVariable("product") String productname){
		Product prd=productservice.searchProductByName(productname);
		if(prd!=null) {
		return new ResponseEntity<Product>(prd,HttpStatus.OK);
		}
		
			return  new ResponseEntity<ErrorMessage>(new ErrorMessage("Resource not found"),HttpStatus.NOT_FOUND);
		
		
	}
	
	@GetMapping("/searchByColor/{color}")
	public ResponseEntity<?> searchByColor(@PathVariable("color") String color){
		
	Product prd=productservice.searchProductByColor(color);
	if(prd!=null) {
		return new ResponseEntity<Product>(productservice.searchProductByColor(color),HttpStatus.OK);
	}
	
	return  new ResponseEntity<ErrorMessage>(new ErrorMessage("Resource not found"),HttpStatus.NOT_FOUND);
		
		
	}

	@GetMapping("getAllRedProducts")
	public ResponseEntity<?> getAllRedProducts(){

		List<Product> lis=productservice.getAllRedProducts();

		if(lis.size()!=0){
			return new ResponseEntity<List<Product>>(lis,HttpStatus.OK);

		}

		else{
			return new ResponseEntity<ErrorMessage>(new ErrorMessage("No Red Color Product Present"),HttpStatus.NOT_FOUND);
		}


	

	}
	
		
}
