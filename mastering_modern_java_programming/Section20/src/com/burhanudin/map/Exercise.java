package com.burhanudin.map;

import java.util.*;

public class Exercise {

    public static void main(String[] args) {
        System.out.println(wordsLength());
    }

    public static Map<String, Integer> wordsLength() {

        List<String> words = List.of("apple", "banana", "orange", "grape", "kiwi");

        // Write your code below
        Map<String, Integer> fruits = new HashMap<>();

        for (String word : words) {
            fruits.put(word, word.length());
        }

        return fruits;

    }

}