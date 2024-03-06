package com.example.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.model.Product;

@Service
public interface ProductService {
	public Product saveProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(Long productId);
	
	public void deleteById(Long productId);
	
	public Product updateProductById(Long productId, Product product);
}
