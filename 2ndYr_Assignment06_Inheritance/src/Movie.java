/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Movie
Version: 1
Start date: 7/11/2012
Date of completion: 15/11/2012
*/

public class Movie extends Product{
	
	private static double price;
	private double sales; 
	private double earnings;
	
	// Constructor which specifies the movie title and ID
	// Also initialises the number of sales to 0
	public Movie(){
		setPrice(0);
	}
	
	public Movie(int thePrice){
		setPrice(thePrice);
	}

	// Setter which sets object price
	public static void setPrice(double thePrice){
		price = thePrice;
	}

	// Increments sales
	public void newSale(){
		sales++;  
	}
	
	// Getter which returns object price
	public static double getPrice(){
		return price;
	}

	// Getter which returns object sales
	public double getSales(){
		return sales;
	}

	// Calculate and return earnings
	public double GetEarnings() {	
		earnings = price*sales;
		return earnings;
	}
}
