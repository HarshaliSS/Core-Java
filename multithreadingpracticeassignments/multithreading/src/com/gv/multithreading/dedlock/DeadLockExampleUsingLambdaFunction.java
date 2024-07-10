package com.gv.multithreading.dedlock;

public class DeadLockExampleUsingLambdaFunction {
	public static void main(String[] args) {
		Object lock1=new Object();
		Object lock2=new Object();
		
	  new Thread(
				()->{
					synchronized (lock1){
						System.out.println("thread 2 acquires lock1");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						synchronized (lock2) {
							System.out.println("thread 1 acquires lock2");
						}
					}
				}).start();
	  
	  new Thread(
				()->{
					synchronized (lock1){
						System.out.println("thread 2 acquires lock2");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						synchronized (lock2) {
							System.out.println("thread 1 acquires lock1");
						}
					}
				}).start();
	}

}
