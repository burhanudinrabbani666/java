package com.burhanudin.generic;

import java.util.Arrays;
import java.util.List;

public class UnBondDemo {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("hello", "world");

        printList(li);
        printList(ls);

    }

    // ? is unbond wildcard
    static void printList(List<?> lists) {
        for (Object obj : lists) {
            System.out.println(obj);
        }
        System.out.println(lists);
    }
}
