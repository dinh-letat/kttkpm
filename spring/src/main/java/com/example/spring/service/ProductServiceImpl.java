package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.Product;
import com.example.spring.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	@Override
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long productId) {
		return productRepository.getProductById(productId);
	}

	@Override
	public void deleteById(Long productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public Product updateProductById(Long productId, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
