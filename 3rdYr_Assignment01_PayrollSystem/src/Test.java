import java.text.DecimalFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Test {
	
	private static double bonus=200;

    // test Employee hierarchy
    @SuppressWarnings("deprecation")
	public static void main(String args[]) {
        
    	Employee employee[] = new Employee[4]; // superclass reference
    	String output = "";

        employee[0] = new Boss("John", "Smith", new Date(104,0,1), 800.0);
        employee[1] = new CommissionWorker("Sue", "Jones", new Date(103,0,1), 400.0, 3.0, 150);
        employee[2] = new PieceWorker("Bob", "Lewis", new Date(109,4,13), 2.5, 200);
        employee[3] = new HourlyWorker("Karen", "Price", new Date(112,1,22), 13.75, 40);

        // format for currency 
        DecimalFormat precision2 = new DecimalFormat("0.00");

        for (Employee e1 : employee) {
        	if (e1.earnsBonus() == true) {
				output += e1.toString() + "\n" +  "Earnings: Û" 
						+ precision2.format(e1.getMonthlyEarnings())
						+ "\n" + "Weekly salary: Û" 
						+ precision2.format(e1.earnings()) + "\n"
						+ "Bonus: Û" + precision2.format(bonus) + "\n" + "\n";
			}
			
        	else {
        		output += e1.toString() + "\n" +  "Earnings: Û" 
						+ precision2.format(e1.getMonthlyEarnings())
						+ "\n" + "Weekly salary: Û" 
						+ precision2.format(e1.earnings()) + "\n"
						+ "Bonus: none :'(" + "\n" + "\n";
			}
		}

        JOptionPane.showMessageDialog(null, output, "Demonstrating Polymorphism", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}