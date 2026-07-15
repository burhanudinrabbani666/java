package com.burhanudin.lambda;

public class LexicalScopeDemo {
    public static void main(String[] args) {
        String input = "Hello world";
        Printer printer = input1 -> {
            // input = "Hi"; // error
            String msg = "HI";

            System.out.println(input1 + input + msg);
        };

        printer.print(input);
    }
}
