/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Assignment: 2
Program: Implement Exceptions in given PayrollSystem code
*/

import java.text.DecimalFormat;

public final class Boss extends Employee {

	private DecimalFormat precision2 = new DecimalFormat("0.00");
    private double weeklySalary;
    
    public Boss(String first, String last, double salary) {
        super(first, last); 
        setWeeklySalary(salary);
    }

    // removed if...else (ternary operator) to ensure value is calculated and not simply set to zero
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    // earnings() throws generic exception including employee's name, miscalculated wage, and a description of the problem
    public double earnings() throws Exception {
    	if(weeklySalary<0) throw new Exception("\n" + toString() + "\nERROR: cannot earn less than zero!\nMiscalcualted Wage: Û"
                + precision2.format(weeklySalary) + "\nThe calcuation for wages didn't work due to incorrect values entered\n\n");
    	return weeklySalary;
    }
    
    public String toString() {
        return "Boss: " + super.toString();
    }
} 