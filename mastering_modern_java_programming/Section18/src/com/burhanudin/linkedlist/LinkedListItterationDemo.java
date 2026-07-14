package com.burhanudin.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListItterationDemo {
    public static void main(String[] args) {
        List<String> countryNames = new LinkedList<>();

        countryNames.add("Indonesia");
        countryNames.add("Malaysia");
        countryNames.add("Thailand");
        countryNames.add("Singapore");
        countryNames.add("Cambodia");
        countryNames.add("Vietnam");

        for (String country : countryNames) {
            if (country.equalsIgnoreCase("indonesia")) {
                System.out.println("King " + country + " 👑");
                continue;
            }

            System.out.println(country);
        }

        // -----------------------------------------------
        System.out.println("------------------------------ iterator");

        Iterator<String> iterator = countryNames.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            if (country.equalsIgnoreCase("indonesia")) {
                System.out.println("King " + country + " 👑");
                continue;
            }

            System.out.println(country.toLowerCase());
        }

        System.out.println("------------------------------ listIterator next");

        ListIterator<String> listIterator = countryNames.listIterator();
        while (listIterator.hasNext()) {
            String country = listIterator.next();
            if (country.equalsIgnoreCase("indonesia")) {
                System.out.println("King " + country + " 👑");
                continue;
            }

            System.out.println(country.toLowerCase());
        }

        System.out.println("------------------------------ listIterator prev");

        while (listIterator.hasPrevious()) {
            String country = listIterator.previous();
            if (country.equalsIgnoreCase("indonesia")) {
                System.out.println("King " + country + " 👑");
                continue;
            }

            System.out.println(country.toLowerCase());
        }
    }
}
