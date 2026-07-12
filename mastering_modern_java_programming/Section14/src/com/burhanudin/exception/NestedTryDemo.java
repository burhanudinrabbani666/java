package com.burhanudin.exception;

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            nestedBlock();
        } catch (Exception e) {
            System.out.println("chaugt in main method: " + e.getMessage());
        }
    }

    static void nestedBlock() {
        try {
            System.out.println("this is outer block");

            try {
                System.out.println("this is inner block");

                int nums = 10 / 0;
                System.out.println("this is nums inner block" + nums);
            } catch (ArithmeticException e) {
                System.out.println("this is inner catch" + e.getMessage());
            } finally {
                System.out.println("this is finally inner");
            }

        } catch (ArithmeticException e) {
            System.out.println("this is outer catch" + e.getMessage());
        } finally {
            System.out.println("this is finally outer");
        }

    }
}
