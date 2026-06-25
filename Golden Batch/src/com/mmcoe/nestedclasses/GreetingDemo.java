package com.mmcoe.nestedclasses;
interface Greeting{
	void sayHello();
}
public class GreetingDemo {
	
	class GreetingInner implements Greeting{  //INNER CLASS
		@Override
		public void sayHello() {
			System.out.println("Inside Greeting Inner Class");
		}	
	}
	
	public void anotherDemo() {
		class GreetingNested implements Greeting{  //NESTED CLASS
			@Override
			public void sayHello() {
				System.out.println("Inside Greeting Nested Class");
			}
		};
		new GreetingNested().sayHello();
	}
	
	
	public static void main(String[] args) {
		
		GreetingDemo demo = new GreetingDemo();
		
		Greeting g1 = demo.new GreetingInner();
		g1.sayHello();
		
		demo.anotherDemo();
	}
	
	
}
