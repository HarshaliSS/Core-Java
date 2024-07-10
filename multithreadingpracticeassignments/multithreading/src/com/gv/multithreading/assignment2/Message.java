package com.gv.multithreading.assignment2;

public class Message {
	
	public void printMessage(String Msg) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("[");
		synchronized (this) {
			System.out.println(Msg);
			System.out.println("]");
		}

	}
  
}
