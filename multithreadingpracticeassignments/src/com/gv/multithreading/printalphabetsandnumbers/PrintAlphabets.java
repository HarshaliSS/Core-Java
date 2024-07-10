package com.gv.multithreading.printalphabetsandnumbers;

public class PrintAlphabets implements Runnable{
	
	@Override
	public void run() {
		printAlphabets();
	}
	
	private void printAlphabets() {
		for(char c='A';c<='H';c++)
			System.out.println(c);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
