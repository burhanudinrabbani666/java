package com.burhanudin.multithread;

public class SharedResource {
    private int data;
    private boolean isEmpty = true;

    // Producer method
    synchronized void produce(int val) {
        while (!isEmpty) {
            try {
                // Buffer is not empty,
                // wait for the customer to consume
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Produce on item
        data = val;
        isEmpty = false;
        System.out.println("Produced: " + val);

        // Notify the waiting consumer
        notify();
    }

    // Consumer method
    synchronized int consume() {
        while (isEmpty) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Consume on item
        int consumedDate = data;
        isEmpty = true;
        System.out.println("Consume: " + consumedDate);

        // Notify the waiting producer
        notify();

        return consumedDate;
    }
}
