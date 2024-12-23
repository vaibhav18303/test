package com.hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
public Mobile() {
		super();
	}
@Id
	public int mobileid;
	private String brandname;
	private String price;
	public Mobile(int mobileid, String brandname, String price) {
		super();
		this.mobileid = mobileid;
		this.brandname = brandname;
		this.price = price;
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [mobileid=" + mobileid + ", brandname=" + brandname + ", price=" + price + "]";
	}
	
	

}
