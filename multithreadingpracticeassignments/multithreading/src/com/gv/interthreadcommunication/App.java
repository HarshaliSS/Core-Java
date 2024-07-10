package com.gv.interthreadcommunication;

public class App {
	public static void main(String[] args) {
		

	MessagePrint mp=new MessagePrint();
	
//	Runnable run1=new Runnable();
//	Runnable run2=new Runnable();
//	
//	Thread customer=new Thread(run1);
//	Thread supplier=new Thread(run2);
//	
//	customer.start();
//	supplier.start();
	
   new Thread(()->new MessageConsumer(mp)).start();
   new Thread(()->new MessageSupplier(mp)).start();
   
	}
}
