package com.burhanudin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderWithBFR {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String filePath = "./the-great-gatsby.txt";
        try (
                FileReader fileReader = new FileReader(filePath);
                BufferedReader reader = new BufferedReader(fileReader);) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            fileReader.close();
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
