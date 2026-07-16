package com.burhanudin.streams;

import java.util.Random;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        int sum = Stream
                .generate(new Random()::nextInt)
                .limit(10)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
