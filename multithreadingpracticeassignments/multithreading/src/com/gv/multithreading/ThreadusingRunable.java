package com.gv.multithreading;

import com.gv.mutltithrading.classes.RunableDemo;

public class ThreadusingRunable {
public static void main(String[] args) {
	RunableDemo runnable1 = new RunableDemo();
	RunableDemo runnable2 = new RunableDemo();
	
	Thread thread1 = new Thread(runnable1);
	Thread thread2 = new Thread(runnable2);
	
	thread1.start();
	thread2.start();
}
}
