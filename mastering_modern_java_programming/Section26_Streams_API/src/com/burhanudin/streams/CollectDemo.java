package com.burhanudin.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {

        // to List()
        List<Integer> numsArray = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> nums = numsArray
                .stream()
                .map(num -> num * 10)
                .collect(Collectors.toList());

        nums.forEach(System.out::println);

        // toList()
        List<String> names = List.of("bani", "risaldi", "aziz");
        List<String> luckyList = names.stream()
                .map(name -> name + " lucky number: " + randomValue())
                .collect(Collectors.toCollection(ArrayList::new));

        luckyList.forEach(System.out::println);
    }

    private static int randomValue() {
        Random random = new Random();
        return random.nextInt(10000);
    }
}
