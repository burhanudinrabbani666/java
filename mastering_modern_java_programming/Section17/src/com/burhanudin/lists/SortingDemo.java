package com.burhanudin.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println(numbers + " - Original");

        // ASC
        Collections.sort(numbers);
        System.out.println(numbers + " - asc");

        // DSC
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers + " - dsc");

        // Comparator Class
        var countries = new ArrayList<String>();
        countries.add("Indonesia");
        countries.add("Vietnam");
        countries.add("Vietnam");
        countries.add("Singapore");
        countries.add("Malaysia");
        countries.add("Thailand");

        System.out.println(countries + " - Original");

        // ASC
        countries.sort(Comparator.naturalOrder());
        System.out.println(countries + " - asc");

        // DSC
        countries.sort(Comparator.reverseOrder());
        System.out.println(countries + " - dsc");

    }
}
