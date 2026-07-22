package com.burhanudin.multithread;

public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {

        SharedBooleanResource newSharedBooleanResource = new SharedBooleanResource();
        Thread workThread = new Thread(() -> newSharedBooleanResource.goWork());

        Thread stopThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
                newSharedBooleanResource.setStopFlag();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        workThread.start();
        stopThread.start();

        workThread.join();
        stopThread.join();
    }
}
