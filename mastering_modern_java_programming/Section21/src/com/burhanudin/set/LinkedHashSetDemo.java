package com.burhanudin.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> countryNames = new LinkedHashSet<>();

        countryNames.add("Indonesia");
        countryNames.add("Malaysia");
        countryNames.add("Thailand");
        countryNames.add("Thailand");
        countryNames.add("Singapore");
        countryNames.add("Kamboja");
        countryNames.add("Vietnam");
        countryNames.add("Vietnam");

        for (String county : countryNames) {
            System.out.println(county);
        }

    }
}
