package com.burhanudin.multithread;

public class SharedBooleanResource {

    private volatile boolean stopFlag = false;

    public void setStopFlag() {
        stopFlag = true;
    }

    public void goWork() {
        while (!stopFlag) {
            System.err.println("Working...");
        }

        System.out.println("Work Stopped");
    }

}
