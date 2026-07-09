package main;

import java.util.Arrays;
import java.util.Random;

public class ThreeDArrayDemo {
    public static void main(String[] args) {
        int noOfStudents = 2;
        int subject = 4;
        int totalSemester = 5;
        Random random = new Random();

        // students1
        int[][] student1 = new int[4][5];

        // students2
        int[][] student2 = new int[4][5];

        for (int i = 0; i < student1.length; i++) {
            for (int j = 0; j < student1[i].length; j++) {
                student1[i][j] = random.nextInt(100);
                student2[i][j] = random.nextInt(100);
            }
        }

        int[][][] studentsArrays = new int[noOfStudents][subject][totalSemester];

        studentsArrays[0] = student1;
        studentsArrays[1] = student2;

        System.out.println(Arrays.deepToString(studentsArrays));

    }
}
