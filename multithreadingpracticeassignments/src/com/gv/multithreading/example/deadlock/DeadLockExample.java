package com.gv.multithreading.example.deadlock;

public class DeadLockExample {
	public Thread getThread(Object lock1, Object lock2) {
		return new Thread(new Runnablelock1(lock1,lock2));
	}
	public Thread getThread2(Object lock1, Object lock2) {
		return new Thread(new Runnablelock1(lock1,lock2));
	}
}