/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Music_Test
Version: 1
Start date: 15/11/2012
Date of completion: 15/11/2012
*/

public class Music_Test extends Music{
	
	public static void main(String[] args){

		Music mySong = new Music();
	
		mySong.setTitle("Out For Blood");
		mySong.setProductID(1387);
		mySong.setPrice(1.99);
		mySong.setSales(3);
		mySong.display();
	}
}
