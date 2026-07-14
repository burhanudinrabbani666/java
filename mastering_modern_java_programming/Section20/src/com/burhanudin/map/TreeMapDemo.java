package com.burhanudin.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        // natural ordering by KEY 🌲
        // Constructs a new, empty tree map, using the natural ordering of its keys
        Map<Integer, String> numbers = new TreeMap<>();

        numbers.put(4, "four");
        numbers.put(23, "Twenty Three");
        numbers.put(72, "Seventy two");
        numbers.put(99, "Ninety nine");
        numbers.put(13, "Thirteen");
        numbers.put(33, "Thirty three");
        numbers.put(44, "Fourty four");
        numbers.put(9, "Nine");
        numbers.put(54, "Fivety four");

        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
