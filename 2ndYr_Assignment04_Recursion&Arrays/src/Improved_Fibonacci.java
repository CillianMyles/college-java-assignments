/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Improve fibonacci sequence  
Version: 1
Start date: 17/10/2012
Date of completion: 18/10/2012
*/

import javax.swing.JOptionPane;

public class Improved_Fibonacci 
{
	static int count = 0;
	static int[] fibonacciterms = new int[200];
	
	public static void main(String[] args){
		
		fibonacciterms[0] = 0;
		fibonacciterms[1] = 1;
	
		for (int i=2; i<200; i++){
			fibonacciterms[i]=-1;
		}
	 
		count = 0;
	  
		String str_inp = JOptionPane.showInputDialog("Which term of the sequence would you like to calculate?");
		int number = Integer.parseInt(str_inp);
	  
		while (number < 0){
			JOptionPane.showMessageDialog(null, "Sorry, cannot calculate negative value");
			str_inp = JOptionPane.showInputDialog("Please enter positve value");
			number = Integer.parseInt(str_inp);
		}
	    
		fibonacciterms[number]= fibonacci(number);
	    
		JOptionPane.showMessageDialog(null, "Fibonacci(" + number + ") = " + fibonacciterms[number] + "\nThis took " + count + " calls");
	}

	static int fibonacci(int n){
		count++;
	    
		if (fibonacciterms[n]>=0) return fibonacciterms[n];

		else{
			fibonacciterms[n]=fibonacci(n-1)+fibonacci(n-2);
			return fibonacciterms[n];
		}
	}
}
