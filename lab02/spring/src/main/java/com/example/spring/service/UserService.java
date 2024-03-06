package com.example.spring.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.spring.model.User;

@Service
public interface UserService {
	public List<User> getAllUsers();
	
	public User getUserById(Long userId);
	
	public User saveUser(User user);
	
	public void deleteUserById(Long userId);
	
	public User updateUserById(Long userId, User user);
}
