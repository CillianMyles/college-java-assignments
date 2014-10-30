/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 9
Program: BankAccount class with constructor/accessor methods, & synchronized withdrawal and deposit methods 
Version: 1
Start date: 21/11/2013
Date of completion: 22/11/2013
*/

package Banking;

import java.text.DecimalFormat;

public class BankAccount {
	
	protected double balance = 0;
	private static double odLimit;
	private int accNo;
	private static int nextAccNo = 1111;
	DecimalFormat precision2 = new DecimalFormat("0.00");
	
	public BankAccount(double theBalance) {
		balance = theBalance;
		accNo = nextAccNo;
		nextAccNo++;
		odLimit = 0;
		System.out.println("You've created a new bank account!");
		System.out.println(accountStatus());
	}
	
	public void setBalance(double theBalance) {
		balance = theBalance;
	}

	public void setOdLimit(double theOdLimit){
		odLimit = theOdLimit;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAccNo() {
		return accNo;
	}
	
	public synchronized void makeWithdrawal(double amount) {
		if((balance-amount)>odLimit) {
			balance -= amount;
			System.out.println("You've made a withdrawal of Û" + precision2.format(amount));
			System.out.println(accountStatus());
		} else {
			System.out.println("Insufficient Funds for transaction!");
			System.out.println(accountStatus());
		}
	}
	
	public synchronized void makeDeposit(double amount) {
		balance += amount;		
		System.out.println("You've made a deposit of Û" + precision2.format(amount));
		System.out.println(accountStatus());
	}
	
	public String accountStatus() {
		return "Account Number: " + accNo + "\nBalance: Û" + precision2.format(balance) + "\n";
	}
}
