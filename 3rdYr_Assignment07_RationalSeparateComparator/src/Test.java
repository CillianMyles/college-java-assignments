/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 7
Program: Populate, shuffle, sort, & search collection of Rationals
Version: 1
Start date: 29/10/2013
Date of completion: 31/10/2013
*/

import java.util.ArrayList; 
import java.util.Collections;
import javax.swing.JOptionPane;

public class Test {

	// Creating user-implicit order 
	static RationalComparator AscendingOrder = new RationalComparator();
	// Creating collection of rationals
	static ArrayList<Rational> rationalCollection = new ArrayList<Rational>();
	
	public static void main(String[] args) {
		
		// Populating collection
		rationalCollection.add(new Rational(3,1));
		rationalCollection.add(new Rational(2,1));
		rationalCollection.add(new Rational(1,3));
		rationalCollection.add(new Rational(6,1));
		rationalCollection.add(new Rational(1,2));
		rationalCollection.add(new Rational(9,1));
		rationalCollection.add(new Rational(10,1));
		rationalCollection.add(new Rational(11,3));
		rationalCollection.add(new Rational(4,7));
		rationalCollection.add(new Rational(4,1));
		
		// Printing collection of rationals 
		System.out.println("Inputted Collection: " + rationalCollection); 
		
		// Shuffling and printing collection of rationals 
		Collections.shuffle(rationalCollection); 
		System.out.println("Suffled Collection: " + rationalCollection);
		
		// Sortting collection into ascending order and printing
		Collections.sort(rationalCollection, AscendingOrder); 
		System.out.println("Sorted Collection: " + rationalCollection);
		
		check();
	}
	
	// Method to check (using JOptionPane) if a certain rational exists within the collection
	public static void check() {
		
		String inputNumerator = JOptionPane.showInputDialog("Input a fraction to see if it is held in the Collection."
				+ "\nStart by entering the numeator!");
		// Convert inputted string to an integer value
		int numerator = Integer.parseInt(inputNumerator);
		
		String inputDenominator = JOptionPane.showInputDialog("Now enter the Denominator!");
		int denominator = Integer.parseInt(inputDenominator);
		
		// Taking inputted values and creating new rational for varification
		Rational inputFraction = new Rational(numerator, denominator);
		
		// Using binarySearch to see if inputted rational exists with collection
		int location = Collections.binarySearch(rationalCollection, inputFraction, AscendingOrder);
		System.out.println("Found '" + inputFraction + "' at location '" + location + "' in sorted Collection");
	}
}
