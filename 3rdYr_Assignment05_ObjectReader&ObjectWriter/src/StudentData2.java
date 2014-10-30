/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 5
Program: To create, modify, and print a Student object
Version: 2
Start date: 18/10/2013
Date of completion: 18/10/2013
*/

import java.io.*;

public class StudentData2 implements Serializable{

	private static final long serialVersionUID = 3304393773837743786L;
	private String studentName;
	private String studentDOB;
	private int studentID;
	
	// Default constructor with my information 
	public StudentData2() { 
		studentName = "Cillian Myles";
		studentDOB = "13 May 1993";
		studentID = 11424252;
	}

	// Constructor where user specifies StudentData2 parameters
	public StudentData2(String name, String date, int id) {
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
	
	// Explicitly define writeObject2() to write all objects of StudentData2 objects individually to .txt file
	public void writeObject2(ObjectOutputStream oos) throws IOException {	
		oos.writeObject(studentName);
		oos.writeObject(studentDOB);
		oos.writeInt(studentID);
	}
	
	// Explicitly define readObject2() to read all objects of StudentData2 objects individually from .txt file
	public void readObject2(ObjectInputStream ois) throws IOException, ClassNotFoundException {
			studentName = (String)ois.readObject();
			studentDOB = (String)ois.readObject();
			studentID = (int)ois.readInt();
	}
}

