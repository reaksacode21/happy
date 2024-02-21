/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Student {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] points = new int[numStudents];
        String[] names = new String[numStudents];
        int sum = 0;

        // Input data for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter ID for student " + (i + 1) + ": ");
            int id = input.nextInt();

            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter age for student " + (i + 1) + ": ");
            int age = input.nextInt();

            System.out.print("Enter points for student " + (i + 1) + ": ");
            points[i] = input.nextInt();
            sum += points[i];
        }

        double average = (double) sum / numStudents;
        System.out.println("Average points of all students: " + average);

        // Rank students based on points
        for (int i = 0; i < numStudents - 1; i++) {
            for (int j = i + 1; j < numStudents; j++) {
                if (points[i] < points[j]) {
                    // Swap points
                    int temp = points[i];
                    points[i] = points[j];
                    points[j] = temp;

                    // Swap names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        // Display ranked list
        System.out.println("\nRanking based on points:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Rank " + (i + 1) + ": " + names[i] + " (ID: " + (i + 1) + ") - Points: " + points[i]);
        }

        input.close();
    }
}
