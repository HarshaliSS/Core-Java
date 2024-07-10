package com.gv.multithreading.printalphabetsandnumbers;

public class MainPrint {
	public static void main(String[] args) {
		PrintNumber printnum=new PrintNumber();
		
		Thread thread1=new Thread(printnum);
		thread1.start();
		
		PrintAlphabets printalpha = new PrintAlphabets();
		
		Thread thread2=new Thread(printalpha);
		thread2.start();
		
		
	}

}
