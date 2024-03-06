package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Product;
import com.example.spring.repository.ProductRepository;
import com.example.spring.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("/product")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") Long productId) {
		return productService.getProductById(productId);
	}
	
	//@PutMapping("/product/{id}")
	
	
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable("id") Long id) {
		productService.deleteById(id);
		return "Deleted product!!!";
	}
}
