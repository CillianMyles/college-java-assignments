/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Converting between data types in Java 
Version: 1
Start date: 11/10/2012
Date of completion: 11/10/2012
*/

public class Converting_Data {
	
	public static void main(String[] args) {
	 
		int I=57;
		float F=2.22f;
		double D=8000;
	 	String S="Hello";

	 	// PART 1: convert from int to String
	 	S = Integer.toString(I);
	 	
	 	System.out.println("PART 1:");
	 	System.out.println("The value of integer is " + I);
	 	System.out.println("The value of String is " + S);
	 
	 	// PART 2: convert from int to float
	 	F = new Float(I);
	 
	 	System.out.println("PART 2:");
	 	System.out.println("The value of integer is " + I);
	 	System.out.println("The value of float is " + F);
	 
	 	// PART 3: convert from float to int
	 	I = (int)F;
	 
	 	System.out.println("PART 3:");
	 	System.out.println("The value of float is " + F);
	 	System.out.println("The value of integer is " + I);
	 
	 	// PART 4: convert from String to float
	 	F = new Float(S);
	 
	 	System.out.println("PART 4:");
	 	System.out.println("The value of String is " + S);
	 	System.out.println("The value of float is " + F);
	 
	 	// PART 5: convert from double to String
	 	S = Double.toString(D);
	 
	 	System.out.println("PART 5:");
	 	System.out.println("The value of double is " + D);
	 	System.out.println("The value of string is " + S);
	 
	 	// PART 6: convert from float to double
	 	D = (double)F;
	 
	 	System.out.println("PART 6:");
	 	System.out.println("The value of float is " + F);
	 	System.out.println("The value of double is " + D);
	}
}

