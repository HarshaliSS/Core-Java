package com.gv.multithreading.assignment2;

public class Main {
	public static void main(String[] args) {
		Message msg=new Message();
		
		new Thread(()->msg.printMessage("ABC"),"Thread-1").start();
		new Thread(()->msg.printMessage("cdf"),"Thread-2").start();
	}

}
