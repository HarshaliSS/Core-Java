package com.gv.multithreading.exmples.threads;

public class RunnableDemo implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
			printRunnable(i);
	}

	private void printRunnable(int i) {
		System.out.println("runnable" +i);
		// TODO Auto-generated method stub
		
	}

}