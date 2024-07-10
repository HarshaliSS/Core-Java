package com.gv.multithreading.example.deadlock;

class Runnablelock2 implements Runnable{
	Object lock1;
	Object lock2;
	public Runnablelock2(Object lock1, Object lock2) {
		this.lock1=lock1;
		this.lock2=lock2;
	}
	@Override
	public void run() {
		synchronized(lock1) {
			System.out.println("thread-`1 acquires lock1");
			try {
				Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			
			synchronized(lock2) {
				System.out.println("thread-`2 acquires lock1");
			}
		}
		}
	}