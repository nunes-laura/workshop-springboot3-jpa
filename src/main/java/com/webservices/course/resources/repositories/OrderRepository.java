package com.webservices.course.resources.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.course.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
