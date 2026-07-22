package com.burhanudin.java24;

import java.util.List;
import java.util.Optional;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class I_FactoryGatherer {
    public static void main(String[] args) {

        // FOLD
        Optional<Integer> totalDigits = Stream.of(10, 20, 30, 40)
                .gather(Gatherers.fold(
                        () -> 0, (count, num) -> count + String.valueOf(num).length()))
                .findFirst();

        System.out.println(totalDigits.get());

        // SCAN
        List<Integer> runningSum = Stream.of(1, 2, 3, 4, 5)
                .gather(Gatherers.scan(() -> 0, (sum, next) -> sum + next))
                .toList();

        System.out.println(runningSum);

        // MAPCONCURRENT
        List<String> articles = List.of(
                "Java is a high-level, class-based, object-oriented programming language.",
                "Spring Boot makes it easy to create stand-alone, production-grade applications.",
                "Microservices architecture enables better scalability and maintainability.",
                "Text processing is a common use case for functional programming.",
                "Streams in Java provide a modern way to process collections efficiently.");

        List<Integer> wordCounts = articles
                .parallelStream()
                .gather(Gatherers.mapConcurrent(10, article -> article.split("\\s+").length))
                .toList();

        for (int i = 0; i < wordCounts.size(); i++) {
            System.out.printf("Article %d word count: %d%n", i + 1, wordCounts.get(i));
        }

        // WINDOWFIXED
        List<List<Integer>> result = Stream.of(1, 2, 3, 4, 5, 6)
                .gather(Gatherers.windowFixed(2))
                .toList();

        System.out.println(result);

        // WINDOWSLIDING
        List<List<Integer>> result1 = Stream.of(1, 2, 3, 4, 5, 6)
                .gather(Gatherers.windowSliding(2))
                .toList();

        System.out.println(result1);

    }
}
