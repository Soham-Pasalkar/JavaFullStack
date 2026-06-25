package com.mmcoe.String;

public class StringClass {
	
	public static void main(String[] args) {
		 String s1 = "Hello";
		 String s2 = new String("Hello"); // create a new string object with different memory area ; overcomes memory optimization of string pool
		 String s3 = "Hello"; // String Pool being an Optimized area, makes the s3 point to same memory area as s1 since their value is same
		 
		 
		 System.out.println(s1 == s2);
		 System.out.println(s1 == s3); // Checks if String Objects are equal
		 System.out.println(s2 == s3);
		 
		 
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.equals(s3)); // Checks if String Values are equal
		 System.out.println(s2.equals(s3));
		 
		 
		 s1 = s1 + "World";
		 System.out.println(s1); // Strings in Java are Immutable, but we can manipulate string here because we are creating a new string object altogether
		 
		 
		 // REGEX 
		 String name = "Soham";
		 String nameRegex = "[A-Z]{1}[a-z]{3,}";
		 System.out.println(name.matches(nameRegex));
		 
		 String cell = "7083315722";
		 String cellRegex = "[6-9]{1}[0-9]{9}";
		 System.out.println(cell.matches(cellRegex));
		 
		 String email = "sohampasalkar07@gmail.com";
		 String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		 System.out.println(email.matches(emailRegex));
		 
		 
	}

}
