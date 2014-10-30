/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 5
Program: User specified StudentData objects are writen specified .txt file as an array of objects
Version: 1
Start date: 18/10/2013
Date of completion: 18/10/2013
*/

import java.io.*;
import java.sql.Date;

public class StudentDataWriter {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		try {
			// Creating array with 4 StudentData elements
			StudentData[] StudentArray = new StudentData[4];
			
			//Scott Mescudi (Kid Cudi), January 30, 1984 (age 29)
			StudentArray[0] = new StudentData("Scott Mescudi", new Date(84,0,30), 11223344);
			
			//Ben Drew (Plan B), 22 October 1983 (age 29)
			StudentArray[1] = new StudentData("Ben Drew", new Date(83,9,22), 11223345);
			
			//Kanye Omari West (Kanye West), June 8, 1977 (age 36)
			StudentArray[2] = new StudentData("Kanye West", new Date(77,5,8), 11223346);
			
			//Joel Thomas Zimmerman (Deadmau5), January 5, 1981 (age 32)
			StudentArray[3] = new StudentData("Joel Zimmerman", new Date(81,0,5), 11223347);
			
			// Opening FileOutputStream and ObjectOutputStream to output StudentData objects to .txt file
			FileOutputStream fos = new FileOutputStream("StudentData.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(StudentArray); //writing array of StudentData elements to .txt file 
			oos.close(); 
		}
		
		// Catchting IO Exceptions
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
