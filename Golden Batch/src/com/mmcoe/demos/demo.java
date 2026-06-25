package com.mmcoe.demos;

public class demo {
	private Object data;
	
	 public demo(Object data) {
		 this.data = data;
	 }
	 
	 public Object getData() {
		 return data;
	 }
	 
	 public void setData(Object data) {
		 this.data = data;
	 }
	 
	 public static void main(String[] args) {
		 
		 demo d1 = new demo("Hola");
		 System.out.println(d1.getData());
		 
		 demo d2 = new demo(3.14);
		 System.out.println(d2.getData());
	 }
}
