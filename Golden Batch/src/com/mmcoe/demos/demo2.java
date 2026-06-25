// Another way to do demo 
// Template Conventions
package com.mmcoe.demos;

public class demo2<T>{
	private T data;
	
	public demo2(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		
		demo2 <String> d1 = new demo2 <String> ("Hello");
		System.out.println(d1.getData());
		
		demo2 <Integer> d2 = new demo2 <Integer> (57);
		System.out.println(d2.getData());
		
	}

}
