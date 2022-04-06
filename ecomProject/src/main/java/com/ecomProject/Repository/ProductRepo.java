package com.ecomProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecomProject.Entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
		@Query(value = "SELECT * FROM product where category='mobile'",nativeQuery = true)
		public List<Product> findBymobile();
		
		@Query(value = "SELECT * FROM product where category='laptop'",nativeQuery = true)
		public List<Product> findBylaptop(); 
		
		@Query(value = "SELECT * FROM product where category='ac'",nativeQuery = true)
		public List<Product> findByac(); 
		
//		@Query(value = "SELECT * FROM product where category='mobile'",nativeQuery = true)
//		public List<Product> findByMobilebrand(String brand);
//		
//		@Query(value = "SELECT * FROM product where category='laptop'",nativeQuery = true)
//		public List<Product> findByLaptopbrand(String brand);
//		
//		@Query(value = "SELECT * FROM product where category='ac'",nativeQuery = true)
//		public List<Product> findByAcbrand(String brand);
//		
		
}
