package com.burhanudin.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // LAMBDA EXPRESSIONS
        int sumOfSquaresOfEvents = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(number -> number * number)
                .sum();

        System.out.println("Sum of squares of even numbers (Functional): " + sumOfSquaresOfEvents);

        Stream<Integer> filteredNums = numbers.stream().filter(number -> number % 2 == 0);
        filteredNums.forEach(number -> System.out.println(number));

    }

    @FunctionalInterface
    public interface InnerTestDemo {
        int add(int a, int b);
    }

}
