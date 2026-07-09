package main;

public class ArrayLengthDemo {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] mobileNumbers = new int[10];
        String[] names = new String[] { "bani", "nico", "heri" };

        System.out.println(nums.length); // 5
        System.out.println(names.length); // 3
        System.out.println(mobileNumbers.length);// 10

        for (int i = 0; i < names.length; i++) {
            System.out.printf("name%d: %s\n", i + 1, names[i]);
        }

        double[] prices = new double[Integer.MAX_VALUE];
        System.out.println(prices.length);
    }
}
