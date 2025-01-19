/*
 * 20. Write a program to declare & instantiate an 2D-array to hold marks obtained by students in different 
 *     subjects in a class. Assume that there are up to 10 students in a class & there are 5 subjects. Find out 
 *     the best student according to average marks of all subjects and display all the marks of him/her.

 */

import java.util.Scanner;

public class P20_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[10][5];
        double[] averages = new double[10];
        int bestStudentIndex = -1;
        double highestAverage = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ": ");
            int totalMarks = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                totalMarks += marks[i][j];
            }
            averages[i] = totalMarks / 5.0;
        }

        for (int i = 0; i < 10; i++) {
            if (averages[i] > highestAverage) {
                highestAverage = averages[i];
                bestStudentIndex = i;
            }
        }

        if (bestStudentIndex != -1) {
            System.out.println("\nBest Student: Student " + (bestStudentIndex + 1));
            System.out.println("Average Marks: " + highestAverage);
            System.out.println("Marks in each subject:");
            for (int j = 0; j < 5; j++) {
                System.out.println("Subject " + (j + 1) + ": " + marks[bestStudentIndex][j]);
            }
        }

        sc.close(); 
    }
}
