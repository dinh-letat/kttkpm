package com.ledinh.springCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ledinh.springCRUD.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
