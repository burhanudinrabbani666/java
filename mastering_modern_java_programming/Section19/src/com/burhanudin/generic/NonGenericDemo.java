package com.burhanudin.generic;

public class NonGenericDemo {
    public static void main(String[] args) {
        Pair stringIntPair = new Pair("Hello", 34);

        stringIntPair.setFirst(12);

        String myString = (String) stringIntPair.getFirst(); // required casting
        int myInt = (int) stringIntPair.getSecond();

        System.out.println(myString);
        System.out.println(myInt);
    }
}
