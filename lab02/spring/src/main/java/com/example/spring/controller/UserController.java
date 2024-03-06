package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Product;
import com.example.spring.model.User;
import com.example.spring.repository.ProductRepository;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.ProductService;
import com.example.spring.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") Long userId) {
		return userService.getUserById(userId);
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUserById(@PathVariable("id") Long id) {
		userService.deleteUserById(id);
		return "Deleted user!!!";
	}
}
