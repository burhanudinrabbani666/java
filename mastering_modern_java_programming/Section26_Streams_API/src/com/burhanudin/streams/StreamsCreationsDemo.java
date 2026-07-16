package com.burhanudin.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsCreationsDemo {
    public static void main(String[] args) {
        List<String> departementList = new ArrayList<>();
        departementList.add("supply");
        departementList.add("hr");
        departementList.add("sales");
        departementList.add("marketing");

        Stream<String> depStream = departementList.stream();
        depStream.forEach(System.out::println);

        System.out.println("--------------------------");

        Stream<String> names = Stream.of("bani", "risaldi", "farhan", "aziz");
        names.forEach(System.out::println);

        // PARALLEL
        Stream<String> paralledStream = departementList.parallelStream();
        paralledStream.forEach(System.out::println);

        // parse array to stream
        String[] arrayOfWord = { "burhanudin", "rabbani" };
        Stream<String> streamOfWords = Arrays.stream(arrayOfWord);
        streamOfWords.forEach(System.out::println);

        // empty stream
        Stream<String> emptyString = Stream.empty();

        // generateEmptyStream
        // Stream.generate(new Random()::nextInt).forEach(System.out::print);
        Stream.iterate(1, n -> n + 1).forEach(System.out::println);
    }
}
