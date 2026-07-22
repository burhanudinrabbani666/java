package com.burhanudin.multithread;

public class SumOfIntsThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        long result = 0;

        SumThread newThread1 = new SumThread(0, Integer.MAX_VALUE / 2);
        SumThread newThread2 = new SumThread((Integer.MAX_VALUE / 2) + 1, Integer.MAX_VALUE);
        newThread1.start();
        newThread2.start();

        // this make other code wait
        newThread1.join();
        newThread2.join();

        result = newThread1.getResult() + newThread2.getResult();
        System.out.println(result);

        long end = System.currentTimeMillis();
        System.out.println("Total time taken by multithread java class is: " + (end - start));

    }
}
