package com.burhanudin.lists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<String>();

        countries.add("Indonesia");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Vietnam");

        for (int i = 0; i < countries.size(); i++) {
            System.out.printf(
                    "%d. %s\n", // 0. Indonesia
                    i,
                    countries.get(i));
        }

        var doubleNums = new ArrayList<Double>();
    }
}
