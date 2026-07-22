package com.burhanudin.multithread;

public class JoinDemo {
    public static void main(String[] args) {
        System.out.println("main thread started...");

        Thread mainThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread A count - " + i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });

        mainThread.start();
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread ended...");
    }
}
