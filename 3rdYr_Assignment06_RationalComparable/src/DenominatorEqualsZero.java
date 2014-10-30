/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 6
Program: Exception class checking for denominator of zero
Version: 1
Start date: 01/10/2013
Date of completion: 04/10/2013
*/

public class DenominatorEqualsZero extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;
	
	public DenominatorEqualsZero(String message) {
		this.message = message;		
	}
	
	public String getMessage() {
		return message;	
	}
}