package main;

import java.util.Arrays;

public class ArraySerchingDemo {
    public static void main(String[] args) {
        int[] numbers = { 36, 9, 42, 18, 73 };
        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted arrays: " + Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 9);
        System.out.println("Found index of 9: " + index);

        int index2 = Arrays.binarySearch(numbers, 666);
        System.out.println("Found index of 666: " + index2); // not found = -<number>

    }
}
