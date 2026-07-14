package com.burhanudin.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(4, "four");
        linkedHashMap.put(23, "Twenty Three");
        linkedHashMap.put(72, "Seventy two");
        linkedHashMap.put(99, "Ninety nine");
        linkedHashMap.put(13, "Thirteen");
        linkedHashMap.put(33, "Thirty three");
        linkedHashMap.put(44, "Fourty four");
        linkedHashMap.put(9, "Nine");
        linkedHashMap.put(54, "Fivety four");

        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("------------------------");

        SequencedMap<Integer, String> revLinkedHashMap = linkedHashMap.reversed();
        for (Map.Entry<Integer, String> entry : revLinkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
