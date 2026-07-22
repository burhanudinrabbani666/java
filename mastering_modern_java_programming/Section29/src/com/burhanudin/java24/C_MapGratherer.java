package com.burhanudin.java24;

import java.util.List;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class C_MapGratherer {
    public static void main(String[] args) {
        Gatherer<String, ?, String> filterAndMap = Gatherer.of((_, element, downstream) -> {
            if (element.startsWith("a")) {
                return downstream.push(element.toUpperCase());
            }
            return true;
        });

        List<String> result = Stream.of("apple", "banana", "avocado").gather(filterAndMap).toList();
        System.out.println(result);
    }
}
