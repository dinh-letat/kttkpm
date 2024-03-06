package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.User;
import com.example.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	public UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long userId) {
		return userRepository.getUserById(userId);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public User updateUserById(Long userId, User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
