package main;

import java.util.Arrays;

public class ArrayCopyDemo {

    public static void main(String[] args) {

        int[] oldArray = { 1, 2, 3, 4, 5 };

        // int[] newArray = new int[oldArray.length + 5];

        // using copyOf
        int[] newArray = Arrays.copyOf(oldArray, oldArray.length + 5);

        // newArray = copyArrayUsingLoop(oldArray, newArray);

        // arraycopy method
        // System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

        for (int i : newArray) {
            System.out.println(i);
        }

    }

    // copy array using for loop
    private static int[] copyArrayUsingLoop(int[] oldArray, int[] newArray) {
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }
}