/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 10
Program: IntBuffer class
Version: 1
Start date: 17/01/2014
Date of completion: 17/01/2014
*/

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class IntBuffer {

	final ReentrantLock myLock = new ReentrantLock();
	final Condition myLockCondition = myLock.newCondition();
	private int contents;
	private boolean isAvailable = false;

	int get() throws InterruptedException {
	   
		myLock.lock();
		
	   while (isAvailable == false) {
		   myLockCondition.await();
	   }
	   
	   isAvailable = false;
	   myLockCondition.signal();
	   myLock.unlock();
	   return contents;  
	}

	void put(int value) throws InterruptedException {
	  
		myLock.lock();
		
		while (isAvailable == true){
			myLockCondition.await();
		}
		
		contents = value;
		isAvailable = true;
		myLockCondition.signal();
		myLock.unlock();  
	}
}