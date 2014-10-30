/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Palindrome 
Version: 1
Start date: 17/10/2012
Date of completion: 18/10/2012
*/

import javax.swing.JOptionPane;

public class Palindrome 
{
	public static void main(String[] args){

		// asking user to enter a sentence
		String str = JOptionPane.showInputDialog("Enter a sentence please");
	 
		// converting all upper case letters to lower and closing all spaces
		str = str.toLowerCase().replaceAll(" ", "");
	 
		if(palindromeCheck(str)){
			// prints out true statement for palindrome
			JOptionPane.showMessageDialog(null, str + " is a palindrome");
		}
	 
		else{
			// prints out false statement for palindrome
			JOptionPane.showMessageDialog(null, str + " is not a palindrome");
		}	
	}
	
	//checking if the sentence is a palindrome
	public static boolean palindromeCheck(String string){
		
		// declaring variables
		int a=0, b=string.length()-1;                                             

		while (a < b){
			if (string.charAt(a) != string.charAt(b)) return false;                                           
	  
			a++;
			b--;
		}
		
		return true;                                           
    }
}
