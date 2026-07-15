package com.burhanudin.lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryDemo {
    public static void main(String[] args) {
        UnaryOperator<String> convertStr = input -> input.toUpperCase();
        System.out.println(convertStr.apply("burhanudin rabbani"));

        UnaryOperator<String> sameValue = UnaryOperator.identity();
        System.out.println(sameValue.apply("burhanudin rabbani"));

        UnaryOperator<Integer> doubleValue = (num) -> num * 2;
        UnaryOperator<Integer> plusThree = (num) -> num + 3;

        // catch with Function
        Function<Integer, Integer> ouput1 = doubleValue.andThen(plusThree); // executed doubleValue first
        Function<Integer, Integer> ouput2 = doubleValue.compose(plusThree); // executed plusThree first

        System.out.println(ouput1.apply(5)); // 13
        System.out.println(ouput2.apply(5)); // 16

    }
}
