/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 5
Program: User specified StudentData objects are writen specified .txt file as an array of objects
Version: 2
Start date: 18/10/2013
Date of completion: 18/10/2013
*/

import java.io.*;

public class StudentDataWriter2 {
	
	public static void main(String[] args) {
		
		try {
			StudentData2[] StudentArray2 = new StudentData2[4];
			
			//Scott Mescudi (Kid Cudi), January 30, 1984 (age 29)
			StudentArray2[0] = new StudentData2("Scott Mescudi", "30 Jan 1984", 11223344);
			
			//Ben Drew (Plan B), 22 October 1983 (age 29)
			StudentArray2[1] = new StudentData2("Ben Drew", "22 Oct 1983", 11223345);
			
			//Kanye Omari West (Kanye West), June 8, 1977 (age 36)
			StudentArray2[2] = new StudentData2("Kanye West", "8 June 1977", 11223346);
			
			//Joel Thomas Zimmerman (Deadmau5), January 5, 1981 (age 32)
			StudentArray2[3] = new StudentData2("Joel Zimmerman", "5 Jan 1981", 11223347);
			
			// Opening FileOutputStream and ObjectOutputStream to output StudentData2 objects to .txt file
			FileOutputStream fos = new FileOutputStream("StudentData.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// Enhanced for loop which iterates writes objects of StudentArray2 objects to .txt file 
			for (int i=0; i<=3; i++){
				StudentArray2[i].writeObject2(oos);
			}
			
			oos.close(); 
		}
		
		// Catchting IO Exceptions
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
