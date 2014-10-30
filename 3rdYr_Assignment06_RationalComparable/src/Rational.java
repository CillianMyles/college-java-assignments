/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 6
Program: Rational numbers arithmetic operations (COMPARABLE)
Version: 1
Start date: 19/10/2013
Date of completion: 29/10/2013
*/

public class Rational implements Comparable<Rational> {
	
	private int numerator;
	private int denominator;
	
	//Default Constructor
	public Rational() {
		numerator=1;
		denominator=1;	
	}

	//Constructor with parameters
	public Rational(int a,int b) {
		numerator=a;
		denominator=b;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	// Converts integers to strings and returns them in correct format
	public String toString() { 
		String numStr = Integer.toString(numerator);
		String denStr = Integer.toString(denominator);
		return numStr + '/' + denStr; //returns string values of int's separated by division sign
	}
	
	public Rational Addition(Rational r2) {
		int numeratorOut = (numerator*r2.getDenominator())+(denominator*r2.getNumerator()); 
		int denominatorOut = denominator*r2.getDenominator();
		return new Rational(numeratorOut, denominatorOut); //returns result of 2 Rational's added together
	}
	
	public Rational Subtraction(Rational r2) {
		int numeratorOut = (numerator*r2.getDenominator())-(denominator*r2.getNumerator()); 
		int denominatorOut = denominator*r2.getDenominator();
		return new Rational(numeratorOut, denominatorOut); //returns result of 1 Rational minus another
	}
	
	public Rational Multiplication(Rational r2) {
		int numeratorOut = numerator*r2.getNumerator(); 
		int denominatorOut = denominator*r2.getDenominator();
		return new Rational(numeratorOut, denominatorOut); //returns result of 2 Rational's multiplied together
	}
	
	public Rational Division(Rational r2) {
		int numeratorOut = numerator*r2.getDenominator(); 
		int denominatorOut = denominator*r2.getNumerator();
		return new Rational(numeratorOut, denominatorOut); //returns result of 1 Rational divided by another
	}

	public int compareTo(Rational rational2) {

		if ((numerator*rational2.getDenominator())>(denominator*rational2.getNumerator())) { 
			return 1;
		} 
		else if ((numerator*rational2.getDenominator())<(denominator*rational2.getNumerator())) { 
			return -1;
		} 
		else return 0;
	}	
}
