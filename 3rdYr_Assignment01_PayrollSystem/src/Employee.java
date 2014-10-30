import java.util.Date;

// Abstract base class Employee
public abstract class Employee {

    private String firstName;
    private String lastName;
    private Date joinDate;
    private int ID;
    private static int nextID=1111;
    
    // Constructor
    public Employee(String first, String last, Date join) {
        firstName = first;
        lastName = last;
        joinDate = join;
        ID = nextID;
        nextID++;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }

    // get date joined
    public Date getJoinDate() {
    	return joinDate;
    }
    
    // get employee ID
    public int getID() {
    	return ID;
    }
    
    // get next employee ID
    public static int getNextID() {
    	return nextID;
    }
    
    // convert to single string
    public String toString() {
        return firstName + " " + lastName + "\n" + "Employee ID: " + ID; 
    }
    
    @SuppressWarnings("deprecation")
	public boolean earnsBonus() {
    	if(getJoinDate().before(new Date(105,0,1))) return true;
    	else return false; 	
    }
    
    public abstract double earnings();
    
    public double getMonthlyEarnings(){
    	if (earnsBonus() == true) return (earnings()*4) + 200.0;
    	else return earnings()*4;
    }
}