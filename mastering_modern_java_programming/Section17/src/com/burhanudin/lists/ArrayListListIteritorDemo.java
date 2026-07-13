package com.burhanudin.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteritorDemo {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("Indonesia");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Vietnam");

        System.out.println("------------------------------------------");
        // BEST APROACH
        ListIterator<String> countryItr = countries.listIterator();
        while (countryItr.hasNext()) {
            String country = countryItr.next();

            if (country.equals("Indonesia")) {
                System.out.println("King " + country + " 👑");
                continue;
            }

            System.err.println(country);
        }
        System.out.println("------------------------------------------");

        while (countryItr.hasPrevious()) {
            String country = countryItr.previous();

            if (country.equals("Indonesia")) {
                System.out.println("King " + country + " 👑");
                continue;
            }

            System.err.println(country);
        }

    }
}
