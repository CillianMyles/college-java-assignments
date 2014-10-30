/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 3
Program: Rational numbers arithmetic operations
Version: 1
Start date: 01/10/2013
Date of completion: 02/10/2013
*/

package lab3code;

public class Rational {
	
	private int num;
	private int den;
	
	//Default Constructor
	public Rational() {
		num=1;
		den=1;	
	}

	//Constructor with parameters
	public Rational(int a,int b) {
		num=a;
		den=b;
	}
	
	public int getNumerator() {
		return num;
	}
	
	public int getDenominator() {
		return den;
	}
	
	// Converts integers to strings and returns them in correct format
	public String toString() { 
		String numStr = Integer.toString(num);
		String denStr = Integer.toString(den);
		return numStr + '/' + denStr; //returns string values of int's separated by division sign
	}
	
	public Rational Addition(Rational r2) {
		int numeratorOut = (num*r2.den)+(den*r2.num); 
		int denominatorOut = den*r2.den;
		return new Rational(numeratorOut, denominatorOut); //returns result of 2 Rational's added together
	}
	
	public Rational Subtraction(Rational r2) {
		int numeratorOut = (num*r2.den)-(den*r2.num); 
		int denominatorOut = den*r2.den;
		return new Rational(numeratorOut, denominatorOut); //returns result of 1 Rational minus another
	}
	
	public Rational Multiplication(Rational r2) {
		int numeratorOut = num*r2.num; 
		int denominatorOut = den*r2.den;
		return new Rational(numeratorOut, denominatorOut); //returns result of 2 Rational's multiplied together
	}
	
	public Rational Division(Rational r2) {
		int numeratorOut = num*r2.den; 
		int denominatorOut = den*r2.num;
		return new Rational(numeratorOut, denominatorOut); //returns result of 1 Rational divided by another
	}	
}
