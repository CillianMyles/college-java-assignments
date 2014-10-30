/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 3
Program: Rational numbers arithmetic operations TEST CODE
Version: 1
Start date: 01/10/2013
Date of completion: 04/10/2013
*/

package lab3test;

import lab3code.DenominatorEqualsZero;
import lab3code.Rational; //imports this so Rational objects can be accessed

import java.util.StringTokenizer;

public class Test {
	
	private static int num;
	private static int den;
	private static Rational currentFraction = null;
	private static Rational previousFaction = null; //set to null so arithmetic with first fraction and 'nothing' won't be carried out
													//intuitively enough, arithmetic operations can only be carried out with 2 fractions
	
	public static void main(String[] args) throws DenominatorEqualsZero {

		// Enhanced for loop which carries out arithmetic operations on fractions
		for (String arg : args) {
			
			// Tokenizes the string using a backslash as the divider instead of spaces 
			StringTokenizer tokens = new StringTokenizer(arg, "/"); 
			
			num = Integer.parseInt(tokens.nextToken()); //distinguishes the numerator as the number before the backslash
			den = Integer.parseInt(tokens.nextToken()); //distinguishes the denumerator as the number after the backslash
			
			currentFraction = new Rational(num, den);
			
			try {
				separation();
			}
			
			catch(DenominatorEqualsZero ex) {
				System.out.println(ex.getMessage());
			}
		}	
	}

	public static void separation() throws DenominatorEqualsZero{
		
		if (den==0) {
			throw new DenominatorEqualsZero("DENOMINATOR CANNOT EQUAL ZERO\n"
					+ "CALCULATIONS CANNOT BE CARRIED OUT FOR THIS PARTICULAR PAIR OF ARGUMENTS\n");
		}
		
		else {
			
			if (previousFaction != null) { 
				
				System.out.printf("First fraction: %s \n", previousFaction);
				System.out.printf("Second fraction: %s \n", currentFraction);
				
				// Arithmetic operations
				Rational reslultAdd = previousFaction.Addition(currentFraction);
				System.out.printf("Addtion: %d/%d \n", reslultAdd.getNumerator(), reslultAdd.getDenominator());
					
				Rational resultSubtract = previousFaction.Subtraction(currentFraction);
				System.out.printf("Subtraction: %d/%d \n", resultSubtract.getNumerator(), resultSubtract.getDenominator());
					
				Rational resultMultiplication = previousFaction.Multiplication(currentFraction);
				System.out.printf("Multiplication: %d/%d \n", resultMultiplication.getNumerator(), resultMultiplication.getDenominator());
					
				Rational resultDivision = previousFaction.Division(currentFraction);
				System.out.printf("Division: %d/%d \n\n", resultDivision.getNumerator(), resultDivision.getDenominator());		
			}
			
			previousFaction = currentFraction; //assigns value of second fraction to previousFraction for next calulation
		}
	}
}
