/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 10
Program: 
Version: 1
Start date: 17/01/2014
Date of completion: 17/01/2014
*/

public class IntBufferTest {
	
	public static void main (String Args[]) {
		
		IntBuffer buff1 = new IntBuffer();
		
		Producer producer1 = new Producer(buff1, 1);
		Consumer consumer1 = new Consumer(buff1, 1);
		
		Producer producer2 = new Producer(buff1, 2);
		Consumer consumer2 = new Consumer(buff1, 2);
		
		producer1.start();
		consumer1.start();
		
		producer2.start();
		consumer2.start();
	}
}