package com.burhanudin.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetDemo {
    public static void main(String[] args) {

        // JAVA 8+
        Set<String> countryNames = new HashSet<>();

        countryNames.add("Indonesia");
        countryNames.add("Malaysia");
        countryNames.add("Thailand");
        countryNames.add("Thailand");
        countryNames.add("Singapore");
        countryNames.add("Kamboja");
        countryNames.add("Vietnam");
        countryNames.add("Vietnam");

        countryNames = Collections.unmodifiableSet(countryNames);
        // printCountry(countryNames); // error UnsupportedOperationException

        // JAVA 9+
        Set<String> stringSet = Set.of("a", "b", "c");
        System.out.println(stringSet);

        // printCountry(stringSet); // error UnsupportedOperationException

    }

    static void printCountry(Set<String> countrySet) {
        countrySet.add("France"); // modify parameter

        for (String country : countrySet) {
            System.out.println(country.toUpperCase());
        }
    }

}
