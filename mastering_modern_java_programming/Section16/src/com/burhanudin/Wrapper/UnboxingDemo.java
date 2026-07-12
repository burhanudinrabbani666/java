package com.burhanudin.Wrapper;

public class UnboxingDemo {
    public static void main(String[] args) {
        int num = 16;

        // Boxing
        Integer integer1 = Integer.valueOf(num);
        Double double2 = Double.valueOf(num);
        Long long3 = Long.valueOf("95657");

        // Unboxing
        int integer2 = integer1.intValue();
        double double3 = double2.doubleValue();
        double long4 = long3.longValue();

        System.out.println(integer2);
        System.out.println(double3);
        System.out.println(long4);

    }
}
