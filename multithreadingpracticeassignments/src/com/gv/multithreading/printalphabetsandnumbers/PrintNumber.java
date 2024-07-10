package com.gv.multithreading.printalphabetsandnumbers;

public class PrintNumber implements Runnable{

	@Override
	public void run() {
		printNumber();
	}

	private void printNumber() {
		for(int i=0;i<=10;i++)
			System.out.println(i);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	}

}
