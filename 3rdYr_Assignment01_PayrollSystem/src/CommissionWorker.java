import java.util.Date;

// CommissionWorker class derived from Employee

public final class CommissionWorker extends Employee {

    private double baseSalary; // base salary per week
    private double commission; // amount per item sold
    private int quantity; // total items sold for week
    
    // constructor for class CommissionWorker
    public CommissionWorker(String first, String last, Date join, double salary, double commission, int quantity) {
        super(first, last, join); // call superclass constructor
        setBaseSalary(salary);
        setCommission(commission);
        setQuantity(quantity);
    }

    // set CommissionWorker's weekly base salary
    public void setBaseSalary(double salary) {
    	baseSalary = (salary > 0 ? salary : 0);
    }

    // set CommissionWorker's commission
    public void setCommission(double itemCommission) {
        commission = (itemCommission > 0 ? itemCommission : 0);
    }

    // set CommissionWorker's quantity sold
    public void setQuantity(int totalSold) {
        quantity = (totalSold > 0 ? totalSold : 0);
    }
    
    public double earnings() {
    	return baseSalary + commission*quantity;
    }

    // get String representation of CommissionWorker's name
    public String toString() {
        return "Commission worker: " + super.toString();
    }
} // end class CommissionWorker
