/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Music
Version: 1
Start date: 7/11/2012
Date of completion: 15/11/2012
*/

public class Music extends Product{
	
	private double price;
	private int sales;
	
	// Constructor which specifies the movie title and ID
	// Also initialises the number of sales to 0
	public Music(){
		setSales(0);
		setPrice(0);
	}
	
	public Music(double thePrice, int theSales){
		setSales(theSales);
		setPrice(thePrice);
	}
	
	// Setter which sets object sales
	public void setSales(int theSales){
		sales = theSales;
	}
	
	// Setter which sets object price
	public void setPrice(double thePrice){
		price = thePrice;
	}
	
	// Getter which returns object sales
	public int getSales(){
		return sales;
	}
	
	// Getter which returns object price
	public double getPrice(){
		return price;
	}

	// Calculate and return earnings
	public double GetEarnings(){
		double earnings;
		earnings = price*sales;
		return earnings;
	}
}
