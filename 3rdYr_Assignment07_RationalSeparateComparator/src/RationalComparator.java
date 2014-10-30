/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 7
Program: Makes Rational objects comparable
Version: 1
Start date: 29/10/2013
Date of completion: 30/10/2013
 */

public class RationalComparator implements java.util.Comparator<Rational> {

	// Compare method compares rationals and returns specific integer values to indentify re-arrangement
	public int compare(Rational rational1, Rational rational2) {
		
		// If return value for this if statement is true, return a positive integer value
		// This implies rational1 is greater than rational2, and a switch in positions needs to occur
		if (rational1.getNumerator()*rational2.getDenominator() > 
				rational2.getNumerator()*rational1.getDenominator()) {
			return 1;
		}
		
		// If return value for this if statement is true, return a negative integer value
		// This implies rational1 is smaller than rational2, and no switch in positions needs to occur
		else if (rational1.getNumerator()*rational2.getDenominator() < 
				rational2.getNumerator()*rational1.getDenominator()) {
			return -1;
		}
		
		// The only case left is if the rationals are the exact same value, no switch needed
		else return 0;
	}
}
