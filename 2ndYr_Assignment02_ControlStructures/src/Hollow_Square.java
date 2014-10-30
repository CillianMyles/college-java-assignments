/*
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Printing hollow square with specified length 
Version: 1
Start date: 26/09/2012
Date of completion: 26/09/2012
*/

import javax.swing.JOptionPane;

public class Hollow_Square {

	public static void main(String[] args){
	
		// declaring and initialising variables
		char asterix[]={'*'},space[]={' '};
		int i,n,side_length;
		String side_length_str;
		
		// asking user to input length of each side of square
		side_length_str = JOptionPane.showInputDialog("Please enter length of one side of square you would like to draw");
		
		// converting from string to integer
		side_length = Integer.parseInt(side_length_str);
		
		// start of first (top) line of asterixes
		// (i<side_length) and not (i<=side_length) because need to skip line after 
		// last asterix but cannot use "println" in the for loop 
		for (i=1;i<side_length;i++){
			System.out.print(asterix);
		}
		
		// "println" skips line after last asterix in top row
		System.out.println(asterix);
		
		// this for loop prints an asterix at start and end of each line with spaces in the middle
		for(n=1;n<=(side_length-2);n++){
			// prints first asterix of each line
			System.out.print(asterix);
		
		
			// for loop prints spaces in between asterixes
			for (i=1;i<=(side_length-2);i++){
				System.out.print(space);
			}
		
		// prints asterix at end of each row with spaces in it 
		System.out.println(asterix);
		}
		
		// prints bottom line of asterixes (same as top line)
		
		for (i=1;i<=side_length;i++){
			System.out.print(asterix);
		}
	}
}
