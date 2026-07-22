package com.burhanudin.java24;

import java.util.List;
import java.util.stream.Gatherer;

public class B_DevFriendlyGratherer {
    public static void main(String[] args) {
        List<String> strings = List.of("ONE", "TWO", "THREE", "FOUR", "FIVE");

        // like MIDDLEWARE
        Gatherer<String, ?, String> newGatherer = Gatherer
                .of((_, elment, downstream) -> downstream.push(elment.toLowerCase()));

        List<String> result = strings.stream().gather(newGatherer).toList();
        System.out.println(result);

    }
}
