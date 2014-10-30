/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Assignment: 2
Program: Implement Exceptions in given PayrollSystem code
*/

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Test {

	static DecimalFormat precision2 = new DecimalFormat("0.00");
	
    public static void main(String args[]) throws Exception {
    	
        String output = "";
        
        Boss boss = new Boss("John", "Smith", -800.0);
        CommissionWorker commissionWorker = new CommissionWorker("Sue", "Jones", 400.0, 3.0, 150);
        PieceWorker pieceWorker = new PieceWorker("Bob", "Lewis", 2.5, 200);
        HourlyWorker hourlyWorker = new HourlyWorker("Karen", "Price", -13.75, 40);

        output += varifyEmployee(boss);
        output += varifyEmployee(commissionWorker);
        output += varifyEmployee(pieceWorker);
        output += varifyEmployee(hourlyWorker);

        JOptionPane.showMessageDialog(null, output, "Assignment 02 Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
    public static String varifyEmployee(Employee employee2) {   
    	String toDisplay ="";

    	try {
        	toDisplay += employee2.toString() + "\nEarned Û"
            + precision2.format(employee2.earnings()) + " this week\n\n";
        } catch (Exception e) {
        	toDisplay += e.toString();
        }
        return toDisplay; 
    } 
}
