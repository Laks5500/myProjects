package com.ecomProject.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecomProject.Entity.Product;
import com.ecomProject.Service.ProductService;

@RestController
public class MainRestController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllCategory(){
		return productService.GetAllProducts();
	}
	@GetMapping("/mobile")
	public List<Product> findmobile(){
		return productService.getmobile();
	}
	@GetMapping("/ac")
	public List<Product> findac(){
		return productService.getac();
	}
	@GetMapping("/laptop")
	public List<Product> findlaptop(){
		return productService.getlaptop();
	}
	
	
//	@GetMapping("/mobile/{brand}")
//	public List<Product> findbymobilebrand(@PathVariable String brand){
//		return productService.mobilename(brand);
//	}
//	@GetMapping("/ac/{brand}")
//	public List<Product> findbyacbrand(@PathVariable String brand){
//		return productService.acname(brand);
//	}
//	@GetMapping("/laptop/{brand}")
//	public List<Product> findlaptopbrand(@PathVariable String brand){
//		return productService.laptopname(brand);
//	}
}
