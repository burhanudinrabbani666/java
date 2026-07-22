package com.burhanudin.multithread;

public class SumOfIntsDemo {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        long result = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            result = result + i;
        }

        System.out.println(result);
        long end = System.currentTimeMillis();
        System.out.println("Total time taken by normal java class is: " + (end - start));

    }
}
