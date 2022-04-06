package com.ecomProject.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Electronic {

	
	int eid;
	@Id
	String category;
	public Electronic() {
	}
	public Electronic(int eid, String category) {
		super();
		this.eid = eid;
		this.category = category;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Electronic [eid=" + eid + ", category=" + category + "]";
	}
	
	
}
