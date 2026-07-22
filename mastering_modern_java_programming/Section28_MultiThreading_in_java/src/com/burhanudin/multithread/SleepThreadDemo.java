package com.burhanudin.multithread;

public class SleepThreadDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Hello from main method" + i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
    }
}
