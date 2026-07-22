package com.burhanudin.multithread;

public class SumThread extends Thread {

    private int startIndex;
    private int endIndex;
    private long result;

    public SumThread(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (long i = this.startIndex; i < this.endIndex; i++) {
            this.result = this.result + i;
        }
    }

    public long getResult() {
        return this.result;
    }

}
