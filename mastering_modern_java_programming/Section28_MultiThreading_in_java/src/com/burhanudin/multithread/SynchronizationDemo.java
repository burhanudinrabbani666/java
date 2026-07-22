package com.burhanudin.multithread;

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter newCounter = new Counter();
        Runnable unSynchronizedTask = () -> {
            for (int i = 0; i < 100; i++) {
                newCounter.incrementSynchronized();
                // System.out.println(newCounter.getCount());
            }
        };

        Thread newThread1 = new Thread(unSynchronizedTask);
        Thread newThread2 = new Thread(unSynchronizedTask);

        newThread1.start();
        newThread2.start();

        newThread1.join();
        newThread2.join();

        System.out.println("sychronized count value: " + newCounter.getCount());

    }
}
