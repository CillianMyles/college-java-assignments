/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 5
Program: Array of StudentData2 objects read from .txt file, re-constucted as new array and displayed to console
Version: 2
Start date: 18/10/2013
Date of completion: 18/10/2013
*/

import java.io.*;

public class StudentDataReader2 {
	
	public static void main(String[] args) {

		try {
			// Opening FileInputStream and ObjectInputStream to read objects from the .txt file
			FileInputStream fis = new FileInputStream("StudentData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
		
			// Creating new array which is a re-construction of the StudentData2 array from the writer2 class
			StudentData2[] StudentDataRead2 = new StudentData2[4];
			
			for (int i=0; i<=3; i++){
				StudentDataRead2[i] = new StudentData2(); //initialised as StudentData2 object
				StudentDataRead2[i].readObject2(ois); //assigning values red from object in .txt file to newly created StudentData2 object
				System.out.println(StudentDataRead2[i].toString()); //printing new StudentData2 file to console
			}
			
			ois.close();
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
