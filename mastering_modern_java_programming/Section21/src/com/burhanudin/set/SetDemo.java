package com.burhanudin.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        Random random = new Random();

        for (int index = 0; index < 10; index++) {
            myList.add(random.nextInt(10));
        }

        Collections.sort(myList);
        System.out.println("Original Array: " + myList);

        Set<Integer> newSet = new HashSet<>(myList);
        System.out.println("HashSet: " + newSet);

        System.out.println("---------------------------------------------");

        Set<String> visitedCountry = new HashSet<>();

        visitedCountry.add("Indonesia");
        visitedCountry.add("Malaysia");
        visitedCountry.add("Thailand");
        visitedCountry.add("Singapore");
        visitedCountry.add("Indonesia");

        System.out.println(visitedCountry.size());
        System.out.println(visitedCountry);

        int count = 1;
        for (String country : visitedCountry) {
            System.out.printf("%d. %s\n", count, country);
            count++;
        }

    }
}
