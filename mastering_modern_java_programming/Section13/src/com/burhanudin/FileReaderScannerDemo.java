package com.burhanudin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String pathFile = "./the-great-gatsby.txt";
        File file = new File(pathFile);

        Scanner scanner = new Scanner(file);
        try (scanner) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            scanner.close();
        }

    }
}
