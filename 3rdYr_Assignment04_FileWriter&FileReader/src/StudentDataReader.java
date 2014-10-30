/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 4
Program: Reads text file and displays text read and line number
Version: 1
Start date: 04/10/2013
Date of completion: 04/10/2013
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class StudentDataReader {
	
	public static void main(String args[]) {
				
		File studentData = new File("studentData.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(studentData);
		 
			LineNumberReader lnr = new LineNumberReader(fr);
		
			System.out.print("PROGRAM HAS READ TEXT FILE AS FOLLOWS:\n");
		
			while (true) {
				String str = lnr.readLine();
				if (str == null) 
					break;
				System.out.println("(" + lnr.getLineNumber() + ") " + str);	
			}
		
		lnr.close();
		fr.close();
		}
		
		catch (FileNotFoundException e) {
			System.out.println("NO SUCH FILE OR DIRECTORY! Check file name entered matches the actual file");
			e.printStackTrace();
		}
		
		catch (IOException e) {
			System.err.println("UNKNOWN ERROR ENCOUTERED!");
			e.printStackTrace();
		}
	}
}
