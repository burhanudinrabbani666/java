package com.burhanudin.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterationDemo {
    public static void main(String[] args) {
        HashMap<String, String> countryMap = new HashMap<>();

        countryMap.put("Indonesia", "Jakarta");
        countryMap.put("Malaysia", "Kuala lumpur");
        countryMap.put("Thailand", "Bangkok");

        ittr1(countryMap);
        System.out.println("----------");
        ittr2(countryMap);
        System.out.println("----------");
        ittr3(countryMap);

    }

    static void ittr1(HashMap<String, String> countryMap) {
        Set<String> keys = countryMap.keySet();
        for (String key : keys) {
            String capital = countryMap.get(key);
            System.out.println(capital);
        }
    }

    static void ittr2(HashMap<String, String> countryMap) {
        Set<String> keys = countryMap.keySet();
        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(countryMap.get(key));
        }

    }

    static void ittr3(HashMap<String, String> countryMap) {
        Set<Map.Entry<String, String>> entries = countryMap.entrySet();

        // ITERATOR 📌
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            String key = entry.getKey();
            String capital = entry.getValue();

            System.out.println(key + ": " + capital);
        }

        // FOREACH 📌
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String capital = entry.getValue();

            System.out.println(key + ": " + capital);
        }

    }

}
