package com.burhanudin.generic;

import java.util.ArrayList;
import java.util.List;

public class LowerBondDemo {
    public static void main(String[] args) {
        addNumbers(new ArrayList<>());

    }

    static void addNumbers(List<? super Integer> ints) {
        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }

        // ints.add(3.14); // error different super class
        System.out.println(ints);
    }

}
