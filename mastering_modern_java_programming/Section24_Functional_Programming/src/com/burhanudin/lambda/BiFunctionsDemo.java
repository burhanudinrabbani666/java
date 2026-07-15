package com.burhanudin.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionsDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven = (num1, num2) -> (num1 + num2) % 2 == 0;
        System.out.println(isSumEven.test(4, 9));

        BiFunction<Double, Double, Double> calculatePower = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePower.apply(2.0, 3.0));

        BiConsumer<String, String> appendAndConvert = (str1, str2) -> System.out.println((str1 + str2).toUpperCase());
        appendAndConvert.accept("burhanudin ", "rabbani");

        BiConsumer<String, String> appendAndLength = (str1, str2) -> System.out.println((str1 + str2).length());
        appendAndLength.accept("burhanudin ", "rabbani");

        BinaryOperator<Double> calculatePower1 = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePower1.apply(2.0, 3.0));

        BinaryOperator<Integer> maxOpt = BinaryOperator.maxBy((a, b) -> Integer.compare(a, b));
        System.out.println(maxOpt.apply(16, 23));

        BinaryOperator<Integer> minOpt = BinaryOperator.minBy((a, b) -> Integer.compare(a, b));
        System.out.println(minOpt.apply(16, 23));

    }
}
