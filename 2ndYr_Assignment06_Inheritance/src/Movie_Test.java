/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Movie_Test
Version: 1
Start date: 15/11/2012
Date of completion: 15/11/2012
*/

public class Movie_Test extends Movie{
	
	public static void main(String[] args){
		
		Movie Taken_2 = new Movie();
	
		Taken_2.setTitle("Taken 2");
		Taken_2.setProductID(1421);
		Movie.setPrice(13.99);
		Taken_2.newSale();
		Taken_2.display();
	}
}
