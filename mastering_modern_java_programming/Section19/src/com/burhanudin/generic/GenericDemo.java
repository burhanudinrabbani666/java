package com.burhanudin.generic;

public class GenericDemo {

    public static void main(String[] args) {

        GenericPair<String, Integer> stringIntPair = new GenericPair<>(
                "Hello", 123);

        stringIntPair.setFirst("World");

        // not required casting
        String myString = stringIntPair.getFirst();
        int myInt = stringIntPair.getSecond();

        System.out.println(myString);
        System.out.println(myInt);
    }
}
