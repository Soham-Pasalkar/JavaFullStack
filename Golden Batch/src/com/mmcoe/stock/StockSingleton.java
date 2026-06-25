package com.mmcoe.stock;

public class StockSingleton {
	
	public StockSingleton() {
	}
	
	private static Stock stk;
	
	public static Stock getStock() {
		if (stk == null) {
			stk = new Stock();
		}
		return stk;
	}
}
