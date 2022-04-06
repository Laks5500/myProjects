package com.ecomProject.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	int billid;
	long amount;
	@OneToOne
	@JoinColumn(name = "pid",referencedColumnName = "pid")
	Product pid;
	@OneToOne
	@JoinColumn(name = "cid",referencedColumnName = "cid")
	Customer cid;
	public Cart() {
		
	}
	public Cart(int billid, long amount, Product pid, Customer cid) {
		super();
		this.billid = billid;
		this.amount = amount;
		this.pid = pid;
		this.cid = cid;
	}
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Product getPid() {
		return pid;
	}
	public void setPid(Product pid) {
		this.pid = pid;
	}
	public Customer getCid() {
		return cid;
	}
	public void setCid(Customer cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Cart [billid=" + billid + ", amount=" + amount + ", pid=" + pid + ", cid=" + cid + "]";
	}
	
	
}
