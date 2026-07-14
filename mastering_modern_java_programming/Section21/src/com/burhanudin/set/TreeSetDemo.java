package com.burhanudin.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> countryNames = new TreeSet<>();

        countryNames.add("Indonesia");
        countryNames.add("Malaysia");
        countryNames.add("Thailand");
        countryNames.add("Thailand");
        countryNames.add("Singapore");
        countryNames.add("Kamboja");
        countryNames.add("Vietnam");
        countryNames.add("Vietnam");

        // countryNames.add(null); // error null pointer ⚠️

        System.out.println("TreeSet: " + countryNames);

        // CONTAINS
        boolean containIndonesia = countryNames.contains("Indonesia");
        System.err.println("contains Indonesia: " + containIndonesia);

        // SIZE
        System.out.println("countryNames size: " + countryNames.size());

        // FIRST ELEMENT
        System.out.println("first element: " + countryNames.first());

        // LAST ELEMENT
        System.out.println("last element: " + countryNames.last());

        // REMOVE
        countryNames.remove("Kamboja");
        System.out.println("remove Kamboja: " + countryNames);

        // CLEAR
        countryNames.clear();
        System.out.println("Clear all: " + countryNames);
    }
}
