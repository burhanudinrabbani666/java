package com.burhanudin.multithread;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedResource newSharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                newSharedResource.produce(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();

        Thread consumerThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                newSharedResource.consume();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        consumerThread.start();

    }
}
