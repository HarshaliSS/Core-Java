package com.gv.multithreading.counter;

public class Counter {
    private int counter = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        counter++;
    }

    // Method to get the current counter value
    public int getCounter() {
        return counter;
    }
}
