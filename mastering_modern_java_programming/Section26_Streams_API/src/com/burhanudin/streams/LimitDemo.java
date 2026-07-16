package com.burhanudin.streams;

import java.util.Random;
import java.util.stream.Stream;

public class LimitDemo {
    public static void main(String[] args) {
        Stream
                .generate(new Random()::nextInt)
                .limit(10)
                .forEach(System.out::println);
    }
}
