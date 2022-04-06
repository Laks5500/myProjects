package com.ecomProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomProject.Entity.Product;
import com.ecomProject.Repository.ProductRepo;

@Service
public class ProductService {
	

	@Autowired
	public ProductRepo productRepo;
	
	public List<Product> getmobile() {		
		return productRepo.findBymobile();
	}
	public List<Product> getlaptop() {		
		return productRepo.findBylaptop();
	}
	public List<Product> getac() {		
		return productRepo.findByac();
	}
	
//	public List<Product> mobilename(String brand) {
//		return productRepo.findByMobilebrand(brand);
//	}
//	public List<Product> laptopname(String brand) {
//		return productRepo.findByLaptopbrand(brand);
//	}
//	public List<Product> acname(String brand) {
//		return productRepo.findByAcbrand(brand);
//	}
	
public List<Product> GetAllProducts(){
	return productRepo.findAll();
}
	
	
}
