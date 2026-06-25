// Performing Inheritance in Template Class (demo2 extended)
package com.mmcoe.demos;

public class subdemo <T, P> extends demo2<T> {
	
	private P temp;
	
	public subdemo(T data, P temp) {
		super(data);
		this.temp = temp;
	}
	
	public P getTemp() {
		return temp;
	}
	
	public void setTemp(P temp) {
		this.temp = temp;
	}
	
	public static void main(String[] args) {
		
		subdemo<String, Integer> sd = new subdemo <String, Integer> ("Soham", 35);
		System.out.println(sd.getData() + "\t" + sd.getTemp());
			
	}

}
