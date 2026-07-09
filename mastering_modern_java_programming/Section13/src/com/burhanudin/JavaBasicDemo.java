package com.burhanudin;

import java.io.IOException;

public class JavaBasicDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("please enter the value...");
        int num = System.in.read(); // return ascii of user input
        System.out.println("User enter the value: " + num); // 53

    }
}
