package com.burhanudin.streams;

import java.util.List;

public class MapMethodDemo {
    public static void main(String[] args) {
        List<String> names = List.of(
                "rabbani", "risaldi", "aziz", "farhan");

        names.parallelStream()
                .map(name -> name.toUpperCase()) // intermediate operation
                .filter(name -> name.contains("I")) // intermediate operaion
                .forEach(System.out::println); // terminal operation

    }
}
