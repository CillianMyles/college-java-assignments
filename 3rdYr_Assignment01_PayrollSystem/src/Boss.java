import java.util.Date;

// Boss class derived from Employee.

public final class Boss extends Employee {

    private double weeklySalary;

    // constructor for class Boss
    public Boss(String first, String last, Date join, double salary) {
        super(first, last, join); // call superclass constructor
        setWeeklySalary(salary);
    }

    // set Boss's salary
    public void setWeeklySalary(double salary) {
    	//			   = CONDITION ? STATEMENT1 : STATEMENT2
        weeklySalary = (salary > 0 ? salary : 0);
    }
    
    public double earnings() {
    	return weeklySalary;
    }

    // get String representation of Boss's name
    public String toString() {
        return "Boss: " + super.toString();
    }
} // end class Boss