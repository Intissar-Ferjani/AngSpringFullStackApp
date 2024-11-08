package com.intissar.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intissar.demo.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
