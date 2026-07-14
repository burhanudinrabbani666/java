package com.burhanudin.generic;

public class GenericMethodDemo {
    public static void main(String[] args) {

        String[] stringArray = { "Hello", "World" };
        printArray(stringArray);

    }

    static <T> void printArray(T[] array) {
        for (T string : array) {
            System.out.println(string);
        }
    }
}
