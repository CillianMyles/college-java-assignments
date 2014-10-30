/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Assignment: 2
Program: Implement Exceptions in given PayrollSystem code
*/

import java.text.DecimalFormat;

public final class HourlyWorker extends Employee {

	private DecimalFormat precision2 = new DecimalFormat("0.00");
    private double wage; 
    private double hours; 

    public HourlyWorker(String first, String last, double wagePerHour, double hoursWorked) {
        super(first, last); 
        setWage(wagePerHour);
        setHours(hoursWorked);
    }

    // removed if...else (ternary operator) to ensure value is calculated and not simply set to zero
    public void setWage(double wagePerHour) {
        wage = wagePerHour;
    }

    // removed if...else (ternary operator) to ensure value is calculated and not simply set to zero
    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }

    // earnings() throws generic exception including employee's name, miscalculated wage, and a description of the problem
    public double earnings() throws Exception {
        double weeklyEarnings = wage*hours;
        if((wage*hours)<0) throw new Exception("\n" + toString() + "\nERROR: cannot earn less than zero!\nMiscalcualted Wage: Û"
                + precision2.format(weeklyEarnings) + "\nThe calcuation for wages didn't work due to incorrect values entered\n\n");
        return weeklyEarnings;
    }

    public String toString() {
        return "Hourly worker: " + super.toString();
    }
}