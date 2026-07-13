package com.burhanudin.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {
    public static void main(String[] args) {
        List<Integer> accountNums = new ArrayList<>();
        accountNums.add(12345);
        accountNums.add(67899);
        accountNums.add(66635);

        accountNums = Collections.unmodifiableList(accountNums);
        addTenDollars(accountNums);

        // ---------------------------------------------------------
        // java 9+

        List<Integer> immutableNums = List.of(12345, 67899, 66635);
        addTenDollars(immutableNums);

        var arrayListObject = new ArrayList<Integer>(immutableNums);
        addTenDollars(arrayListObject);
        // ---------------------------------------------------------
    }

    private static List<Integer> addTenDollars(List<Integer> accountNums) {
        accountNums.add(455643);
        for (Integer account : accountNums) {
            System.out.println("Ten Dollar credited into the  account: " + account);
        }

        return accountNums;
    }
}
