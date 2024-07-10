package com.gv.multithreading.examples.interthreadingcommunication;

public class App {
	public static void main(String[] args) {
		

	MessagePrint messagePrint=new MessagePrint();
	
	Thread consumer = new Thread(new MessageConsumer(messagePrint));
    Thread supplier = new Thread(new MessageSupplier(messagePrint));

	consumer.start();
	supplier.start();
	
	}
}