package com.mmcoe.shopping;

public interface ShoppingInterface {
	void addToCart(Product p) throws CartException;
	void checkout() throws EmptyCartException;

}
