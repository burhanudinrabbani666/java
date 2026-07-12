package com.burhanudin.exception;

import java.util.Scanner;

import com.burhanudin.exception.custom.DivideByZeroException;

public class DivideByZero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("""
                    Please enter a numerator value
                    to perform the division
                    """);
            int numerator = scanner.nextInt();

            System.out.println("""
                    Please enter a denominator value
                    to perform the division
                    """);

            int denominator = scanner.nextInt();

            if (denominator == 0) {
                throw new DivideByZeroException(
                        "Denominator cannot be zero");
            }

            int result = numerator / denominator;
            System.out.println(result);

        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
