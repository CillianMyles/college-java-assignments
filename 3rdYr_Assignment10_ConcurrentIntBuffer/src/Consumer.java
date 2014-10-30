/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 10
Program: Consumer class 
Version: 1
Start date: 17/01/2014
Date of completion: 17/01/2014
*/

public class Consumer extends Thread {
	
	private IntBuffer cubbyhole;
	private int number;
	
	public Consumer(IntBuffer intBuffer, int num) {
		cubbyhole = intBuffer;
		number = num;
	}
	
	public void run() {
		
		int value = 0;
		
		for (int i = 0; i < 10; i++) {
			
			try {
				value = cubbyhole.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Consumer #" + this.number + " GOT: " + value);
		}
	}
}