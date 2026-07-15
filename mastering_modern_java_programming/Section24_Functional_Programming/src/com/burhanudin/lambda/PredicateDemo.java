package com.burhanudin.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

        // check if the number is negate
        System.out.println(isEven.negate().test(60)); // false

        // -----------------------------------

        Predicate<Integer> isOdd = Predicate.not(isEven);
        System.out.println(isOdd.test(7)); // true

        Predicate<String> checkEquality = Predicate.isEqual("Burhanudin");
        System.out.println(checkEquality.test("Rabbani")); // false
        System.out.println(checkEquality.test("Burhanudin")); // true

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenList = nums.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        System.out.println(evenList);
    }
}
