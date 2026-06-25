package com.mmcoe.shopping;

public class Product {
	
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product [Name = " + name + ", Price = " + price + "]";
	}
	
	public int getPrice() {
		return price;
	}
	
	
}
