/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Approximation of pi using infinite series
Version: 1
Start date: 19/09/2012
Date of completion: 21/09/2012
*/

import javax.swing.JOptionPane;

public class Calculating_PI{

	public static void main(String[] args){
		
		// declaring variables and setting initial values
		double sum = 0, pi = 0, num_to_add;
		int i, iterations;
		String input;

		// asking user to input amount of terms to be used to approximate pi
		input = JOptionPane.showInputDialog("How many terms of the infinite series would you like to use to approximate PI?");

		// defining user-inputed data
		iterations = Integer.parseInt(input);

		// while-loop ensures user cannot enter value less than zero for amount of iterations
		// message will keep appearing until user enters value greater than zero
		while(iterations <= 0){
			input = JOptionPane.showInputDialog("Please enter a number greater than zero");
			iterations = Integer.parseInt(input);
		}

		// for-loop which uses user-inputed amount of iterations as amount of terms in infinite series
		for (i = 1; i <= iterations; i++){
			// "*2" to makes it even ... "-1" to make it odd
			num_to_add = (1.0 / ((i * 2) - 1));  

			// if the remainder of i/2 is >0 then add the previous number to the new one
			if (i%2 > 0) sum = sum + num_to_add;

			// if the remainder of i/2 is not >0 then subtract the previous number to the new one
			else sum = sum - num_to_add;
		} 

		pi = sum * 4; 
		JOptionPane.showMessageDialog(null, "The approximation for PI is " + pi);
	}
}