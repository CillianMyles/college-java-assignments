/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 10
Program: Producer class
Version: 1
Start date: 17/01/2014
Date of completion: 17/01/2014
*/

public class Producer extends Thread {
	
	private IntBuffer cubbyhole;
	private int number;

	public Producer(IntBuffer intBuffer, int num) {
		cubbyhole = intBuffer;
		number = num;
	}

	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			try {
				cubbyhole.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Producer #" + number + " PUT: " + i);
			
			try {
				sleep((int)(Math.random()*100));
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
	}
}