package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User getUserById(Long userId);

}
