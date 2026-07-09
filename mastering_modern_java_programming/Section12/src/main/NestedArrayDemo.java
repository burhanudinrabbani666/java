package main;

import java.util.Arrays;
import java.util.Random;

public class NestedArrayDemo {
    public static void main(String[] args) {
        int totalStudent = 3;
        int totalSubject = 6;

        int[][] studentMax = new int[totalStudent][totalSubject];
        Random random = new Random();

        for (int i = 0; i < studentMax.length; i++) {
            for (int j = 0; j < studentMax[i].length; j++) {
                studentMax[i][j] = random.nextInt(100);
            }

            System.out.printf(
                    "Student array %d: %s\n",
                    i, Arrays.toString(studentMax[i]));
        }

    }
}
