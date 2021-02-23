package com.demo.Product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="PRODUCT_NAME",nullable=false)
	private String productName;
	
	@Column(name="PRODUCT_IMAGE",nullable=false)
	private String productImage;
	
	@Column(name="COLOR",nullable=false)
	private String color;
	
	@Column(name="PRICE",nullable=false)
	private double price;
	
		public Product() {
			
		}
	
	public Product(String productName, String productImage, String color, double price) {
		super();
		this.productName = productName;
		this.productImage = productImage;
		this.color = color;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productImage=" + productImage + ", color="
				+ color + ", price=" + price + "]";
	}

	
	



	
	
	
	

}
