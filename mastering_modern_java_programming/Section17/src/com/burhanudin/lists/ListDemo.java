package com.burhanudin.lists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<String>();

        countries.add("Indonesia");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Vietnam");
        countries.add(1, "Timor Leste");

        countries.set(2, "Kamboja");

        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i) == "Indonesia") {
                System.err.println("👑 King " + countries.get(i));
            } else {
                System.out.printf(
                        "%d. %s\n", // 0. Indonesia
                        i,
                        countries.get(i));
            }
        }

        System.out.println(countries.reversed().toString());
        // var doubleNums = new ArrayList<Double>();
    }
}
