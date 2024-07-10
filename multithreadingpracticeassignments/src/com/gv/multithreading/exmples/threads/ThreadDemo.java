package com.gv.multithreading.exmples.threads;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		printHello();
	}

	private void printHello() {
		for(int i=0;i>=0;i--)
			System.out.println("Hello" +i);
		
	}

}