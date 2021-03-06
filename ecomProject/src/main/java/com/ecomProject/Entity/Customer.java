package com.ecomProject.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
		@Id
		int cid;
		String name;
		String hometown;
		long phone_no;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getHometown() {
			return hometown;
		}
		public void setHometown(String hometown) {
			this.hometown = hometown;
		}
		public long getPhone_no() {
			return phone_no;
		}
		public void setPhone_no(long phone_no) {
			this.phone_no = phone_no;
		}
		@Override
		public String toString() {
			return "Customer [name=" + name + ", hometown=" + hometown + ", phone_no=" + phone_no + "]";
		}
		public Customer(String name, String hometown, long phone_no) {
			super();
			this.name = name;
			this.hometown = hometown;
			this.phone_no = phone_no;
		}
		public Customer() {
			
		}

}
