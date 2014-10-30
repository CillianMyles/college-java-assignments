/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Assignment: 2
Program: Implement Exceptions in given PayrollSystem code
*/

import java.text.DecimalFormat;

public final class CommissionWorker extends Employee {

	private DecimalFormat precision2 = new DecimalFormat("0.00");
    private double salary; 
    private double commission; 
    private int quantity; 

    public CommissionWorker(String first, String last, double salary, double commission, int quantity) {
        super(first, last); 
        setSalary(salary);
        setCommission(commission);
        setQuantity(quantity);
    }

    // removed if...else (ternary operator) to ensure value is calculated and not simply set to zero
    public void setSalary(double weeklySalary) {
        salary = weeklySalary;
    }

    // removed if...else (ternary operator) to ensure value is calculated and not simply set to zero
    public void setCommission(double itemCommission) {
        commission = itemCommission;
    }

    // removed if...else (ternary operator) to ensure value is calculated and not simply set to zero
    public void setQuantity(int totalSold) {
        quantity = totalSold;
    }

    // earnings() throws generic exception including employee's name, miscalculated wage, and a description of the problem
    public double earnings() throws Exception {
        double weeklyEarnings = salary + commission*quantity;
    	if((salary + (commission*quantity))<0) throw new Exception("\n" + toString() + "\nERROR: cannot earn less than zero!\nMiscalcualted Wage: Û"
                + precision2.format(weeklyEarnings) + "\nThe calcuation for wages didn't work due to incorrect values entered\n\n");
        return weeklyEarnings;
    }

    public String toString() {
        return "Commission worker: " + super.toString();
    }
}