package com.webservices.course.resources.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.course.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
