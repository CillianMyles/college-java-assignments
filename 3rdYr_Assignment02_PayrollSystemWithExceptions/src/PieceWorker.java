/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Assignment: 2
Program: Implement Exceptions in given PayrollSystem code
*/

import java.text.DecimalFormat;

public final class PieceWorker extends Employee {

	private DecimalFormat precision2 = new DecimalFormat("0.00");
    private double wagePerPiece; 
    private int quantity; 

    public PieceWorker(String first, String last, double wage, int numberOfItems) {
        super(first, last); 
        setWage(wage);
        setQuantity(numberOfItems);
    }

    // removed if...else (ternary operator) to ensure value is calculated and not simply set to zero
    public void setWage(double wage) {
        wagePerPiece = wage;
    }

    // removed if...else (ternary operator) to ensure value is calculated and not simply set to zero
    public void setQuantity(int numberOfItems) {
        quantity = numberOfItems;
    }

    // earnings() throws generic exception including employee's name, miscalculated wage, and a description of the problem
    public double earnings() throws Exception {
        double weeklyEarnings = quantity*wagePerPiece;
        if((quantity*wagePerPiece)<0) throw new Exception("\n" + toString() + "\nERROR: cannot earn less than zero!\nMiscalcualted Wage: Û"
                + precision2.format(weeklyEarnings) + "\nThe calcuation for wages didn't work due to incorrect values entered\n\n");
        return weeklyEarnings;
    }

    public String toString() {
        return "Piece worker: " + super.toString();
    }
}