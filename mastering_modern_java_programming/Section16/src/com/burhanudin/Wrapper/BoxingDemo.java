package com.burhanudin.Wrapper;

public class BoxingDemo {
    public static void main(String[] args) {
        // primitve data value
        int num = 16;

        // approach 1 - with the help of constructor // DEPRECATED ⚠️
        Integer integer = new Integer(num);
        Double double1 = new Double(3.14);
        Long long1 = new Long("95657");

        // approach 2 - with Object.valuOf
        Integer integer1 = Integer.valueOf(num);
        Double double2 = Double.valueOf(num);
        Long long3 = Long.valueOf("95657");

        int num1 = Integer.parseInt("20");
        System.out.println(num1);

    }
}
