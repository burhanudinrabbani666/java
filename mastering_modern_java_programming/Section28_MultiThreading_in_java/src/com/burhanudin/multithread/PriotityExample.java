package com.burhanudin.multithread;

public class PriotityExample implements Runnable {

    private final String name;

    public PriotityExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.err.println(name + "- Count: " + i + ". Priority: " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
