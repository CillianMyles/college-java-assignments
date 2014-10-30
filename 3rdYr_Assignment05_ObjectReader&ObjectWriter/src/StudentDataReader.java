/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 5
Program: Array of StudentData objects read from .txt file, re-constucted as new array and displayed to console
Version: 1
Start date: 18/10/2013
Date of completion: 18/10/2013
*/

import java.io.*;

public class StudentDataReader {
	
	public static void main(String[] args) {

		try {
			// Opening FileInputStream and ObjectInputStream to read objects from the .txt file
			FileInputStream fis = new FileInputStream("StudentData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
		
			// Creating new array which is a re-construction of the StudentData array from the writer class
			StudentData[] StudentDataRead = (StudentData[])ois.readObject();
			ois.close();
			
			// Iterating through the new array printing the objects to the console
			for (int i=0; i<=3; i++){
				System.out.println(StudentDataRead[i].toString());
			}
		}
		
		// Will dislay exception if .txt file does not exist in directory 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Catching IO Exceptions 
		catch (IOException e) {
			e.printStackTrace();
		} 
		
		// Will display Exception if StudentDataWriter.class cannot be accessed
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
