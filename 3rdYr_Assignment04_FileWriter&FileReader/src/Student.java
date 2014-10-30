/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 4
Program: To create, modify, and print a Student object
Version: 1
Start date: 04/10/2013
Date of completion: 04/10/2013
*/

public class Student {
	
	private String firstName;
	private String lastName;
	private int sID;
	private String courseCode;
	
	public Student() {
		firstName = "John";
		lastName = "Smith";
		sID = 12345;
		courseCode = "3BP1";
	}
	
	public Student(String first, String last, int id, String code) {
		setFirstName(first);
		setLastName(last);
		setID(id);
		setCourseCode(code);
	}
	
	public void setFirstName(String first) {
		firstName = first;
	}
	
	public void setLastName(String last) {
		lastName = last;
	}
	
	public void setID(int id) {
		sID = id;
	}
	
	public void setCourseCode(String code) {
		courseCode = code;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getID() {
		return sID;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public String toString() {
		
		String info = "First Name: " + getFirstName() 
					+ "\nLast Name: " + getLastName() 
					+ "\nStudent ID: " + getID()
					+ "\nCourse Code: " + getCourseCode() + "\n";
		
		return info;
	}
}