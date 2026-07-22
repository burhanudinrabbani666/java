package com.burhanudin.java24;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class D_MutableStateDemo {
    public static void main(String[] args) {

        Gatherer<Integer, AtomicInteger, Integer> cumulativeSum = Gatherer
                .ofSequential(AtomicInteger::new,
                        (state, num, downstrem) -> {
                            int result = state.addAndGet(num);
                            return downstrem.push(result);
                        });

        var result = Stream.of(10, 20, 30).gather(cumulativeSum).toList();
        System.out.println(result);
    }
}
