package com.burhanudin.java24;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class F_ParallelGatherer {
    public static void main(String[] args) {

        Gatherer<Integer, ?, Integer> parellelSum = Gatherer.of(
                AtomicInteger::new, (sum, num, down) -> {
                    System.out.printf("[Integerator] Thread: %s | number: %d\n",
                            Thread.currentThread().getName(), num);

                    sum.addAndGet(num);
                    return true;

                }, (s1, s2) -> {
                    System.out.printf("[Combinator] Thread: %s | combining: %d + %d\n",
                            Thread.currentThread().getName(), s1.get(), s2.get());

                    s1.addAndGet(s2.get());
                    System.out.println(s1.get());
                    return s1;

                }, (sum, downstream) -> downstream.push(sum.get()));

        // parallel stream with gatherer
        var result = Stream.of(10, 20, 30, 40, 50, 60).parallel().gather(parellelSum).toList();
        System.out.println(result);

    }
}
