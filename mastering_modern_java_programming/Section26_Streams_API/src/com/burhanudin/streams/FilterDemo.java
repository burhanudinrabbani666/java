package com.burhanudin.streams;

import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<String> departement = List.of(
                "Supply", "HR", "Sales", "Marketing");

        // FILTER
        departement.stream()
                .filter(dp -> dp.startsWith("S"))
                .map(dp -> dp.toUpperCase())
                .forEach(System.out::println);
    }
}
