package com.burhanudin.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachDemo {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("Indonesia");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Vietnam");

        for (String country : countries) {
            if (country == "Indonesia") {
                System.out.println("King " + country + " 👑");
            } else {
                System.out.println(country);
            }

        }
    }
}
