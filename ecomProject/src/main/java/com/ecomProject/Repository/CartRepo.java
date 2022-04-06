package com.ecomProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomProject.Entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {
	
	
}
