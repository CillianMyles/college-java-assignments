/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Assignment: 2
Program: Implement Exceptions in given PayrollSystem code
*/

public abstract class Employee {

    private String firstName;
    private String lastName;

    public Employee(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + ' ' + lastName;
    }

    // abstract class throws generic exception
    public abstract double earnings() throws Exception;
}