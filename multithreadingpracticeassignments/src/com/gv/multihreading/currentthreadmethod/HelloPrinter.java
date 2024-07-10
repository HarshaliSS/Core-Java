package com.gv.multihreading.currentthreadmethod;

public class HelloPrinter {
    public static void main(String[] args) {
        // Thread to print "Hello" every second for 10 seconds
        Thread helloThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    // Restore the interrupt status
                    Thread.currentThread().interrupt();
                    // Optionally, handle the interruption (e.g., log it, clean up, or exit loop)
                    e.printStackTrace();
                    break; // Exit the loop if interrupted
                }
            }
        });

        // Start the thread
        helloThread.start();
    }
}
