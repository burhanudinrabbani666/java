package com.burhanudin.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapsDemo {
    public static void main(String[] args) {
        // java 8+
        Map<Integer, String> nums = new HashMap<Integer, String>();
        nums.put(4, "four");
        nums.put(23, "Twenty Three");
        nums.put(72, "Seventy two");

        nums = Collections.unmodifiableMap(nums);

        // java 9+
        Map<String, Integer> stringMap = Map.of("a", 1, "b", 2);
        proccessMap(stringMap);

        Map<Integer, String> integerStringMap = Map.ofEntries(
                Map.entry(1, "Risaldi"),
                Map.entry(2, "Angga"),
                Map.entry(3, "Marcus"));

        proccessMap1(integerStringMap);

    }

    static void proccessMap(Map<String, Integer> stringIntegermap) {
        // stringIntegermap.remove("a"); // Error UnsupportedOperationExecption

        for (Map.Entry<String, Integer> entry : stringIntegermap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static void proccessMap1(Map<Integer, String> integerStringmap) {
        // integerStringmap.put(4, "jhon");

        for (Map.Entry<Integer, String> entry : integerStringmap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
