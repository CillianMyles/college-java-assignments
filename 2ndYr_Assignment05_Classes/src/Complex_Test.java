/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Complex number test program
Version: 1
Start date: 06/09/2013
Date of completion: 06/09/2013
*/
 
public class Complex_Test extends Complex{
	
	static Complex a = new Complex(5f,6f);
	static Complex b = new Complex(4f,3f);
	
	public static void main(String[] args) {
		
		System.out.println(performArithmetic());
	}
	
	public static String performArithmetic() {
		
		return "First Complex Number = " + a.toString()
				+ "\nSecond Complex Number = " + b.toString()
				+ "\n\nAddition = " + add(a,b) 
				+ "\nSubtraction = " + subtract(a,b) 
				+ "\nMultiplication = " + multiply(a,b) 
				+ "\nDivision = " + divide(a,b) + "\n";
	}
}
