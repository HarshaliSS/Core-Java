package com.gv.multithreading;

public class ThreadCreation extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println(10*i);
	}
		public static void main(String[] args) {
			ThreadCreation thread1 = new ThreadCreation();
			ThreadCreation thread2 = new ThreadCreation();
			thread1.start();
			thread2.start();
			
		}

}
