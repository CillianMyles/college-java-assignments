/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Perimeter & Area Calculation for initiated Rectangle object
Version: 1
Start date: 06/09/2013
Date of completion: 06/09/2013
*/

public class Rectangle {
	
	public static float length, width, perimeter, area;
	
	// Default constructor which defaults values to 1 for length and width 
	public Rectangle() { 
		setLength(1f);
		setWidth(1f);
	}
	
	// Constructor which allows users to specify values for length and width
	public Rectangle(float l, float w) {
		setLength(l);
		setWidth(w);
	}
	
	public void setLength(float theLength) {
		length = theLength;
	}
	
	public void setWidth(float theWidth) {
		width = theWidth;
	}

	public float getLength() {
		return length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public float Perimeter() {
		perimeter = 2*getLength() + 2*getWidth();
		return perimeter;
	}
	
	public float Area() {
		area = getLength()*getWidth();
		return area;
	}
}
