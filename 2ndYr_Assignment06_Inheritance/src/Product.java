/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Product
Version: 1
Start date: 7/11/2012
Date of completion: 15/11/2012
*/

import javax.swing.JOptionPane;

public abstract class Product{
	
	private String title; 
	private int ProductID; 
	
	// Constructor which specifies title and ID
	public Product(){
		setTitle("Example Product");
		setProductID(123456789);
	}
	
	public Product(String theTitle, int theID){
		setTitle(theTitle);
		setProductID(theID);
	}
	
	// Setter which sets object title
	public void setTitle(String theTitle) {
		title = theTitle;
	}

	// Setter which sets object ID
	public void setProductID(int theID){
		ProductID = theID;
	}
	
	// Getter which returns object title
	public String getTitle(){
		return title;
	}
	
	// Getter which returns object ID
	public int getProductID(){
		return ProductID;
	}
	
	// no definition method which will be defined in all classes based on the Product class
	public abstract double GetEarnings();
	   
	// Uses toString() method to output title and earnings
	public void display(){
		JOptionPane.showMessageDialog(null, toString());
	}
	 
	// Returns all variables in string format
	public String toString(){
		return ("Product title: " + title + "\nProduct ID: " + ProductID + "\nProduct earnings: Û"+ GetEarnings());
	}	
}
