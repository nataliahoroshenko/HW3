package org.example.homework3;

/**
 * Program to Find Minimum and Maximum
 */
public class Task2 {
    public static void main(String[] args) {
        // Declare two integer variables
        int num1 = 10;
        int num2 = 20;

        // Find the minimum value
        int min = (num1 < num2) ? num1 : num2;

        // Find the maximum value
        int max = (num1 > num2) ? num1 : num2;

        // Print the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
