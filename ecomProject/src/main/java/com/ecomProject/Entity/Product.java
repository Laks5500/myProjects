package com.ecomProject.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	int pid;
	String brand;
	String model;
	String price;
	@OneToOne
	@JoinColumn(name = "category",referencedColumnName = "category")
	Electronic category;
	public Product() {
	}
	public Product(int pid, String brand, String model, String price, Electronic category) {
		super();
		this.pid = pid;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.category = category;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Electronic getCategory() {
		return category;
	}
	public void setCategory(Electronic category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", brand=" + brand + ", model=" + model + ", price=" + price + ", category="
				+ category + "]";
	}
	
	
}
