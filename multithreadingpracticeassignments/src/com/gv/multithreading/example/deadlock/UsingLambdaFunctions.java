package com.gv.multithreading.example.deadlock;

public class UsingLambdaFunctions {public static void main(String[] args) {
    Object lock1 = new Object();
    Object lock2 = new Object();
    
    // Creating thread 1 using lambda expression
    Thread thread1 = new Thread(() -> {
        synchronized (lock1) {
            System.out.println("Thread 1 acquires lock1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            synchronized (lock2) {
                System.out.println("Thread 1 acquires lock2");
            }
        }
    });
    
    // Creating thread 2 using lambda expression
    Thread thread2 = new Thread(() -> {
        synchronized (lock2) {
            System.out.println("Thread 2 acquires lock2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            synchronized (lock1) {
                System.out.println("Thread 2 acquires lock1");
            }
        }
    });
    
    thread1.start();
    thread2.start();
}

}
