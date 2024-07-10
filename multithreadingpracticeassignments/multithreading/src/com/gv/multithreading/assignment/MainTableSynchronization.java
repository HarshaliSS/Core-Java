package com.gv.multithreading.assignment;

public class MainTableSynchronization {
	public static void main(String[] args) {
		Table tb=new Table();
		
		RunnableTable runnable1=new RunnableTable(tb, 1);
		RunnableTable runnable2=new RunnableTable(tb, 2);
		
		Thread thread1=new Thread(runnable1);
		Thread thread2=new Thread(runnable2);
		
		thread1.start();
		thread2.start();
		
		//new Thread((->table.printTable(10)).start();
		// shortcut to write 6 line code above using lambda expression
	}
                       
}
