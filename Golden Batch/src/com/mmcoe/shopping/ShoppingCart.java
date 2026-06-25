package com.mmcoe.shopping;

public class ShoppingCart {
	
	private Product[] items;
	private int total;
	public int i = 0;
	
	public ShoppingCart() {
		items = new Product[5];
	}
	
	
	public void addToCart(Product p) throws CartException{
		if (i < 5) {
			items[i] = p;
			i += 1;
			total += p.getPrice();
		}
		else
			throw new CartException("Your Cart is Full");
	}
	
	
	public void checkout() throws EmptyCartException{
		if (i == 0){
			throw new EmptyCartException("Your Cart is Empty!");
		}
		
		for(int j = 0; j < i; j++) {
			System.out.println(items[j]);
		}
		System.out.println("Total Bill: " + total);
	}
	
}
