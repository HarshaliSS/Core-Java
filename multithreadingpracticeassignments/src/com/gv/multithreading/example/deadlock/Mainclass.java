package com.gv.multithreading.example.deadlock;

public class Mainclass {
	public static void main(String[] args) {
		Object lock1= new Object();
		Object lock2= new Object();		
		DeadLockExample deadlock = new DeadLockExample();
		
		Thread thread = deadlock.getThread(lock1, lock2);
		Thread thread2 = deadlock.getThread(lock1, lock2);	
		thread.start();
		thread2.start();
	}
	

}
