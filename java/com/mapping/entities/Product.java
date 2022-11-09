package com.mapping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int Pid;
	private String productName;
	private int qty;
	private int price;
	
	Product(){
		
	}
	
	
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int pid, String productName, int qty, int price) {
		super();
		Pid = pid;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", productName=" + productName + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	

}
