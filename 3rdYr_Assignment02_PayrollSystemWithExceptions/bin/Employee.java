// Abstract base class Employee.

public abstract class Employee {

    private String firstName;
    private String lastName;

    // constructor
    public Employee(String first, String last) {
        firstName = first;
        lastName = last;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + ' ' + lastName;
    }

    public abstract double earnings();
}
