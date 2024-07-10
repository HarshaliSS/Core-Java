package com.gv.multithreading.assignment;

public class Table {
	
	public void printTable(int tableNumber) {
		System.out.println("table number:" + tableNumber);
		synchronized (this) {
		for(int i=0;i<=11;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(tableNumber*i);
	}
	}
	
	}

	

}
