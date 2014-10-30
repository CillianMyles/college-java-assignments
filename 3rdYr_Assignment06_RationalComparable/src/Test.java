/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 6
Program: Rational numbers arithmetic operations (COMPARABLE) test class
Version: 1
Start date: 19/10/2013
Date of completion: 29/10/2013
*/

import java.util.ArrayList; 

public class Test {
	
	static ArrayList<Rational> rational = new ArrayList<Rational>();
	static Rational[] sortedArray = new Rational[10];
	
	public static void main(String[] args) throws DenominatorEqualsZero {
		int swaps = 1;
		
		rational.add(new Rational(3,1));
		rational.add(new Rational(2,1));
		rational.add(new Rational(1,3));
		rational.add(new Rational(6,1));
		rational.add(new Rational(1,2));
		rational.add(new Rational(9,1));
		rational.add(new Rational(10,1));
		rational.add(new Rational(11,3));
		rational.add(new Rational(4,7));
		rational.add(new Rational(4,1));

		for(int d=0;d<10;d++) {
			sortedArray[d]=rational.get(d);
		}
		 
		while(swaps!=0) {
			swaps=0;
			
			for(int a=0;a<9;a++) {	
				int b=a+1;
			
				// If in wrong order, re-arrange!
				if((rational.get(a).compareTo(rational.get(a+1))) == 1) {
					sortedArray[a]=rational.get(a+1);
					sortedArray[a+1]=rational.get(a);
					sort();
					swaps++;
				}
				
				else { // if less than or equal to, no change in order occurs
					sortedArray[a]=rational.get(a);
					sortedArray[b]=rational.get(b);
					sort();
				}
			}
			System.out.println("Current Array Value: " + rational);
		}
		System.out.println("ARRAY IS NOW SORTED! :-)");	
	}
	
	// Simple sprting algorithm which clears the array and repopulates it 
	public static void sort() {
		rational.clear();
		for(int d=0;d<10;d++) {
			rational.add(sortedArray[d]);
		}
	}
}