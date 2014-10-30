/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 9
Program: BankAccount driver class which implements concurrent threads 
Version: 1
Start date: 21/11/2013
Date of completion: 22/11/2013
*/

package Banking;

public class BankAccountDriver {

	public static void main ( String Args[]) {
		
		BankAccount acc = new BankAccount(1000);
		BankAccountTest thread1 = new BankAccountTest(acc);
		BankAccountTest thread2 = new BankAccountTest(acc);
		 
		thread1.start();
		thread2.start();
	}
}
