package com.gv.multithreading.exmples.threads;


public class ThreadUsingThreadClass extends Thread {
	public static void main(String[] args) {
		ThreadDemo thread1=new ThreadDemo();
		thread1.start();
		ThreadDemo thread2=new ThreadDemo();
		thread2.start();
	}
	
}