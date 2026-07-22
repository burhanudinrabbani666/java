package com.burhanudin.multithread;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PriotityExample("Thread A"));
        Thread t2 = new Thread(new PriotityExample("Thread B"));
        Thread t3 = new Thread(new PriotityExample("Thread C"));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
