/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 4
Program: User inputted details are writen to console and specified txt file
Version: 1
Start date: 04/10/2013
Date of completion: 04/10/2013
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class StudentDataWriter extends Student {

	public static void main(String args[]) {
		
		Student s1 = new Student();
		
		String fileName = "studentData.txt";
		File studentData = new File("studentData.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(studentData);
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		String inp_str;
		inp_str = JOptionPane.showInputDialog(null, "Please enter your First Name");
		s1.setFirstName(inp_str);
		
		inp_str = JOptionPane.showInputDialog(null, "Please enter your Second Name");
		s1.setLastName(inp_str);
		
		inp_str = JOptionPane.showInputDialog(null, "Please enter your Student ID");
		int id = Integer.parseInt(inp_str);
		s1.setID(id);
		
		inp_str = JOptionPane.showInputDialog(null, "Please enter your Course Code");
		s1.setCourseCode(inp_str);
		
		try {
			bw.write(s1.toString());
			bw.close();
		
			System.out.println(s1);
			System.out.print("The inputted records have be writen to a file called: "
							 + "<" + fileName + ">" + "\nIn the directory: " + studentData.getCanonicalPath());
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
