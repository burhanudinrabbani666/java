package com.burhanudin.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printName = input -> System.out.println("Hello " + input);
        Consumer<String> printNameUpperCase = input -> System.out.println("Hello " + input.toUpperCase());

        printName.accept("burhanudin rabbani");
        printNameUpperCase.accept("burhanudin rabbani");

        Consumer<Integer> squareOf = num -> System.out.println(num * num);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        nums.forEach(squareOf);

        Consumer<String> appendInput = input -> System.out.println(
                "New value after appending is: HELLO "
                        + input);

        appendInput.andThen(printNameUpperCase).accept("Lamba Expression");

    }
}
