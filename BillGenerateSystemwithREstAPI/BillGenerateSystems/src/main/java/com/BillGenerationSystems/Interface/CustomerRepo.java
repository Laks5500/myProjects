package com.BillGenerationSystems.Interface;


import org.springframework.data.jpa.repository.JpaRepository;


import com.BillGenerationSystems.Entity.Customer;

public interface CustomerRepo extends  JpaRepository<Customer, Integer> {



	
	
}
