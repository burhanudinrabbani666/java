package com.burhanudin.lambda;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        System.out.println(isEven.test(16)); // true
        System.out.println(isEven.test(13)); // false

        Predicate<Integer> isGreaterThan50 = num -> num > 50;
        System.out.println(isGreaterThan50.test(16)); // false
        System.out.println(isGreaterThan50.test(80)); // true

        // check if the number is even AND greate than 50
        System.out.println(isEven.and(isGreaterThan50).test(62)); // true
        System.out.println(isEven.and(isGreaterThan50).test(20)); // false

        // check if the number is even OR greate than 50
        System.out.println(isEven.or(isGreaterThan50).test(62)); // true
        System.out.println(isEven.or(isGreaterThan50).test(13)); // false

    }
}
