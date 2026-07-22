package com.burhanudin.multithread;

import java.util.Random;

public class VirtualDemo {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        Random random = new Random();
        Runnable runnable = () -> {
            double result = random.nextDouble(1000) * random.nextDouble(1000);
            System.out.println(result);
        };

        for (int i = 0; i < 500000; i++) {

            // VIRTUAL THREAD
            Thread.ofVirtual().start(runnable).join();
            Thread.startVirtualThread(runnable).join();

            // NATIVE THREAD
            // Thread newThread = new Thread(runnable);
            // newThread.start();
            // newThread.join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime));

    }
}
