/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 9
Program: BankAccount test class which creates threads to access methods concurrently 
Version: 1
Start date: 21/11/2013
Date of completion: 22/11/2013
*/

package Banking;

public class BankAccountTest extends Thread {

	private BankAccount targetAcc;
	 
	public BankAccountTest(BankAccount account) {
		targetAcc = account;
	}
	 
	public void run () { //runs when thread is started
		targetAcc.makeDeposit(25);
		targetAcc.makeDeposit(75); 
		targetAcc.makeWithdrawal(250);
	}
}
