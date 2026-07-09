package com.burhanudin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader inpStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inpStream);

        System.out.println("Type input & press enter when done: ");
        String str = reader.readLine();
        System.out.println("You entered: " + str);
        reader.close();
    }
}
