package com.burhanudin.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // creating linkedlist:

        /*
         * LinkedList<Integer> intNums = new LinkedList<Integer>();
         * LinkedList<Double> doubleNums = new LinkedList<>();
         * var countryNames = new LinkedList<String>();
         * List<Character> characters = new LinkedList<>();
         * List<Person> persons = new LinkedList<>();
         */

        // linkedlist is connected with memory address.
        // each node carry value, next address, prev address

        // LinkedList: [e] -> [e] -> [e] -> [e] -> ....
        // ArrayList: [e,e,e,e,]

        List<String> countryNames = new LinkedList<>();

        countryNames.add("Indonesia");
        countryNames.add("Malaysia");
        countryNames.add("Thailand");
        countryNames.add("Singapore");
        countryNames.add("Cambodia");
        countryNames.add("Vietnam");

        System.out.println(countryNames);

        // replace
        countryNames.set(3, "Timor leste");
        System.out.println(countryNames);

        // remove
        countryNames.remove(3);
        System.out.println(countryNames);

        // get : thorws NoSuchElementException.
        String firstElement = countryNames.getFirst();
        String lastElement = countryNames.getLast();
        System.err.println(firstElement);
        System.err.println(lastElement);

        // reversing
        List<String> reverseCountryNames = countryNames.reversed();
        System.out.println(reverseCountryNames);
    }
}
