package com.burhanudin.Wrapper;

public class AutoDemo {
    public static void main(String[] args) {
        int num = 16;

        Integer numObj = num; // <- auto boxing
        int num1 = numObj; // <- auto unboxing

        System.out.println(num1);

        // beware of null values
        Integer numObj2 = null;
        int num2 = numObj2; // null pointer exception

        System.out.println(num2);
    }
}
