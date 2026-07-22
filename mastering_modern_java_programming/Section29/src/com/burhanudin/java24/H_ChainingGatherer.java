package com.burhanudin.java24;

import java.util.List;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class H_ChainingGatherer {
    public static void main(String[] args) {
        Gatherer<String, ?, String> upper = Gatherer.of(
                (_, el, down) -> down.push(el.toUpperCase()));

        Gatherer<String, ?, String> filter = Gatherer.of((_, el, down) -> {
            if (el.startsWith("J")) {
                down.push(el);
            }

            return true;
        });

        List<String> result = Stream.of("java", "spring", "react")
                .gather(upper.andThen(filter))
                .toList();

        System.out.println(result);
    }
}
