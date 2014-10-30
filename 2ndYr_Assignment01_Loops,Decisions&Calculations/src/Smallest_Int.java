/*
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Finding smallest integer entered by user
Version: 1
Start date: 19/09/2012
Date of completion: 21/09/2012
*/

import javax.swing.JOptionPane;

public class Smallest_Int {

	public static void main(String[] args){
		// declaring variables
		int i, num_of_ints, int_min, num;
		String inp, inputs, num_string;

		// asking user to input how many numbers they wish to enter
		inp = JOptionPane.showInputDialog("How many numbers do you want to enter?");

		// telling program that the number just entered is amount of integers to be inputed
		num_of_ints = Integer.parseInt(inp);
		// ensuring user enters a value greater than zero

		// if not, keep asking user to input acceptable value
		while(num_of_ints <= 0){
			inp = JOptionPane.showInputDialog("Please enter a number greater than zero");
			num_of_ints = Integer.parseInt(inp);
		}

		// opening dialogue box so user can input numbers
		inputs = JOptionPane.showInputDialog("Enter a number");

		// initialise first entry as smallest value
		int_min = Integer.parseInt(inputs);

		// check if each new variable is smaller than the last
		// if so it is the new minimum value
		for(i = 1 ; i < num_of_ints ; i++){
			num_string = JOptionPane.showInputDialog("Enter a number");
			num = Integer.parseInt(num_string);
			if (num < int_min) int_min = num;
		}

		// outputting smallest number entered to user
		JOptionPane.showMessageDialog(null, "The smallest number you entered is " + int_min); 
	}
}