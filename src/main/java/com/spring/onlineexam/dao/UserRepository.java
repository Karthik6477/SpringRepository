package com.spring.onlineexam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.onlineexam.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	@Query("from Users where email = ?1 and password = ?2")
	Object loginCheck(String email,String password);
}
