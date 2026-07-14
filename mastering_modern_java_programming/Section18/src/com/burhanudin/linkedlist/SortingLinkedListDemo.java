package com.burhanudin.linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortingLinkedListDemo {
    public static void main(String[] args) {
        List<String> countryNames = new LinkedList<>();

        countryNames.add("Indonesia");
        countryNames.add("Malaysia");
        countryNames.add("Thailand");
        countryNames.add("Singapore");
        countryNames.add("Cambodia");
        countryNames.add("Vietnam");

        // ASC
        Collections.sort(countryNames);
        System.out.println(countryNames);

        // DSC
        Collections.sort(countryNames, Comparator.reverseOrder());
        System.out.println(countryNames);

        // NATURAL ORDER
        Collections.sort(countryNames, Comparator.naturalOrder());
        System.out.println(countryNames);
    }
}
