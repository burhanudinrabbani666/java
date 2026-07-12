package com.burhanudin.Wrapper;

public class WrapperObjectChacingDemo {
    public static void main(String[] args) {

        Integer num1 = new Integer(23);
        Integer num2 = new Integer(23);

        System.out.println(num1 == num2); // false
        System.out.println(num1.equals(num2)); // true

        // ----------------------------------------------------

        Integer num3 = Integer.valueOf(23);
        Integer num4 = Integer.valueOf(23);

        System.out.println(num3 == num4); // true
        System.out.println(num1.equals(num4)); // true

        // ----------------------------------------------------

    }
}
