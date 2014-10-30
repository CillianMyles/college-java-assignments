/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 5
Program: Open a .txt file and append an extra line of content onto end of file
Version: 1
Start date: 18/10/2013
Date of completion: 18/10/2013
*/

import java.io.*;
import java.util.Scanner;

public class RandomAccess {
	
	public static void main(String[] args) throws IOException { 
		
		// Using console input to input file name and addition line wished to be entered
		Scanner userinput = new Scanner(System.in);
		String FileName = userinput.next(); //first line is name of .txt file in directory
		String additionalLine = userinput.next(); //second line is additional line user wishes to add to 
		userinput.close();
		
		@SuppressWarnings("resource")
		RandomAccessFile fileName = new RandomAccessFile(FileName, "rw");
	
		fileName.seek(fileName.length());
		fileName.writeBytes(additionalLine); //adding additional line to .txt file 	
	}
}
