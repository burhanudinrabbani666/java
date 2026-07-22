package com.burhanudin.java24;

import java.util.List;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class G_InterruptGatherer {
    public static void main(String[] args) {
        List<Integer> largeList = Stream.iterate(1, i -> i + 1).limit(1000).toList();

        Gatherer<Integer, ?, Integer> limiGatherer = Gatherer.of((_, num, downstream) -> {
            System.out.println(num);
            return downstream.push(num);
        });

        List<Integer> result = largeList.stream().gather(limiGatherer).limit(10).toList();
        System.out.println(result);
    }
}
