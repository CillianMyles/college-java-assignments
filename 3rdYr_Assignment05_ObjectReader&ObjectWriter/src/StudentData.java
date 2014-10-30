/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 5
Program: To create, modify, and print a Student object
Version: 1
Start date: 18/10/2013
Date of completion: 18/10/2013
*/

import java.io.Serializable;
import java.util.Date;

public class StudentData implements Serializable {
	
	private static final long serialVersionUID = -4527141530759299024L;
	private String studentName;
	private Date studentDOB;
	private int studentID;
	
	// Default constructor with my information 
	@SuppressWarnings("deprecation")
	public StudentData() { 
		studentName = "Cillian Myles";
		studentDOB = new Date(93,4,13);
		studentID = 11424252;
	}

	// Constructor where user specifies StudentData parameters
	public StudentData(String name, Date date, int id) {
		studentName = name;
		studentDOB = date;
		studentID = id;
	}
	
	// toString method which overrides to print out all variables in string format
	public String toString() {
		return "STUDENT NAME: " + studentName 
				+ "\nDATE OF BIRTH: " + studentDOB 
				+ "\nSTUDENT ID: " + studentID + "\n";
	}
}


