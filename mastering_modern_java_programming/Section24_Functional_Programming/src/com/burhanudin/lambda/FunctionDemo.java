package com.burhanudin.lambda;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, String> convertStr = (input) -> input.toUpperCase();
        System.out.println(convertStr.apply("burhanudin"));

        Function<String, Integer> getStrLength = (input) -> input.length();
        System.out.println(getStrLength.apply("burhanudin"));

        Function<String, String> sameValue = Function.identity();
        System.out.println(sameValue.apply("Hi burhanudin"));

        Function<Integer, Integer> doubleValue = (num) -> num * 2;
        Function<Integer, Integer> plusThree = (num) -> num + 3;

        Function<Integer, Integer> ouput1 = doubleValue.andThen(plusThree); // executed doubleValue first
        Function<Integer, Integer> ouput2 = doubleValue.compose(plusThree); // executed plusThree first

        System.out.println(ouput1.apply(5)); // 13
        System.out.println(ouput2.apply(5)); // 16

    }

}
