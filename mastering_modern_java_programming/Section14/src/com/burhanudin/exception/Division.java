package com.burhanudin.exception;

public class Division {
    public double divide(String str1, String str2) throws ArithmeticException {
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        return num1 / num2;
    }
}
