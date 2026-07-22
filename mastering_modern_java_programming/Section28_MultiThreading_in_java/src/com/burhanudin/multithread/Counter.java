package com.burhanudin.multithread;

public class Counter {
    private int count = 0;

    public void incrementUnSynchronized() {
        count++;
    }

    public synchronized void incrementSynchronized() {
        count++;
    }

    public int getCount() {
        return count;
    }

}
