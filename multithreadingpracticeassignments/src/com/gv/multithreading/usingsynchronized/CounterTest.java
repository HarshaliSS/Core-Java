package com.gv.multithreading.usingsynchronized;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create a runnable that increments the counter 1000 times
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        };

        // Create two threads that run the task
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        // Start both threads
        thread1.start();
        thread2.start();
        
        try {
			thread1.join();
			 thread2.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
       
        
        System.out.println(counter.getCounter());
}
}