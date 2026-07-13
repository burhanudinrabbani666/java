package com.burhanudin.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteritorDemo {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("Indonesia");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Vietnam");

        Iterator<String> countryItr = countries.iterator();
        while (countryItr.hasNext()) {
            String country = countryItr.next();

            if (country.equals("Indonesia")) {
                System.out.println("King " + country + " 👑");
                continue;
            }

            System.err.println(country);
        }
    }
}
