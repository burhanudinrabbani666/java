package com.burhanudin.generic;

public class GenericMethodDemo {
    public static void main(String[] args) {

        String[] stringArray = { "Hello", "World" };
        printArray(stringArray);

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        printArray(intArray);
    }

    static <T> void printArray(T[] array) {
        for (T string : array) {
            System.out.println(string);
        }
    }
}
