/*
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Estimating premium for a set of user-inputed data  
Version: 1
Start date: 26/09/2012
Date of completion: 26/09/2012
*/

import javax.swing.JOptionPane;

public class Premium_Estimate {

	public static void main(String[] args){
	 
		// declaring and initialising variables	
		double base_rate=0,rate=0;
	    int age,years;	
	    String age_str,years_str,gender;
	 
		// asking user to input their age
	    age_str = JOptionPane.showInputDialog("Hello, please enter your age...");
	    // converting their inputed (String) age to a number (integer)
	    age = Integer.parseInt(age_str);
	 
	    // defining ages less than 20 and over 75 as un-insurable
	    if (age<20 || age>75){
	    	// printing this message to user and ending program
	    	JOptionPane.showMessageDialog(null, "Sorry... we do not ensure drivers under the age of 20 or over the age of 75 :("); 
	    	System.exit(0); 
	    }
	 
	    // asking user to input String value for their gender
	    gender = JOptionPane.showInputDialog("Are you male or female? Please enter lower case m or f"); 
	 
	    // as long as they incorrectly enter their gender keep asking for correct input
	    while (!gender.equals("f") && !gender.equals("m")){
	    	gender = JOptionPane.showInputDialog("Please enter the letter m or f (in lower case)");
	    }
	 
	    // defining base rates for both male/female and under 25 or over 24
	    if (gender.equals("f") && age<=24) base_rate = 1500;
	    if (gender.equals("f") && age>24) base_rate = 800;
		if (gender.equals("m") && age<=24) base_rate = 1700;
		if (gender.equals("m") && age>24) base_rate = 1000;
	 
		// asking user for another input
		years_str = JOptionPane.showInputDialog("How many years have you had accident-free driving? If none, please enter 0");
		// converting user-input from String to integer
		years = Integer.parseInt(years_str);
	 
		// calculation for premium if accident-free driving is 5 years or more
		if (years>=5) rate = base_rate - (0.5)*base_rate;
		// calculation for premium if accident-free driving is less than 5 years
		if (years<5) rate = base_rate - (0.1)*base_rate*years;
	 
		// if for some reason calculations don't work, better to say try again than display an answer of Û0.00
		if (rate==0){
			JOptionPane.showMessageDialog(null, "Sorry we encountered problems... Please start the prgram again");
			System.exit(0);
		}
	 
		// displaying output to user
		JOptionPane.showMessageDialog(null,"Your estimated premium is Û" + rate);
	}
}