package main;

public class ArrayForEachLoopDemo {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int num : numbers) {
            System.out.println(num);
        }

        String[] names = { "bani", "nico", "heri" };

        for (String name : names) {
            System.out.println(name.toUpperCase());
        }
    }
}
