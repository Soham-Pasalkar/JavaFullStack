package com.mmcoe.shopping;

public class TestShopping {
	
	public static void main(String[] args) {
		
		Product p1 = new Product("Coffee", 370);
		Product p2 = new Product("Tea", 470);
		Product p3 = new Product("Milk", 200);
		Product p4 = new Product("Sugar", 150);
		Product p5 = new Product("Bread", 250);
		Product p6 = new Product("Butter", 80);
		
		
		/*ShoppingCart c1 = new ShoppingCart();
		try {
			c1.addToCart(p1);
			c1.addToCart(p2);
			c1.addToCart(p3);
			c1.addToCart(p4);
			c1.addToCart(p5);
			c1.addToCart(p6);
		} catch (CartException e) {
			e.printStackTrace();
		}
		
		
		try {
			c1.checkout();
		} catch (EmptyCartException e) {
			e.printStackTrace();
		}*/
		
		ShoppingCart2 c1 = new ShoppingCart2();
		
		try {
			c1.add(p1);
			c1.add(p2);
			c1.add(p3);
			c1.add(p4);
			c1.add(p5);
			c1.add(p6);
		} catch (CartException e) {
			e.printStackTrace();
		}
		
		
		try {
			c1.print();
		} catch (EmptyCartException e) {
			e.printStackTrace();
		
		}
	}

}
