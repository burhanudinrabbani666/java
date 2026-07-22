package com.burhanudin.java24;

import java.util.List;
import java.util.stream.Gatherer;

public class A_HelloGratherer {
    public static void main(String[] args) {

        List<String> strings = List.of("one", "two", "three", "four", "five");

        // like MIDDLEWARE
        Gatherer<String, ?, String> newGatherer = () -> (
                state, element, downstream) -> downstream.push(element.toUpperCase());

        List<String> result = strings.stream().gather(newGatherer).toList();
        System.out.println(result);
    }
}
