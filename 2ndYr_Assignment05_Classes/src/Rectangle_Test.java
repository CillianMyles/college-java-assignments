/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Complex number test program
Version: 1
Start date: 06/09/2013
Date of completion: 06/09/2013
*/

public class Rectangle_Test extends Rectangle{

	static Rectangle rec1 = new Rectangle(4f,3f);
	
	public static void main(String args[]){
		System.out.println(performArithmetic());
	}
	
	public static String performArithmetic() {
		return "Length = " + rec1.getLength()
				+ "\nWidth = " + rec1.getWidth()
				+ "\nPerimeter = " + rec1.Perimeter() 
				+ "\nArea = " + rec1.Area(); 
	}
}
