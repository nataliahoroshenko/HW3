package org.example.homework3;

/**
 * Program to Find Minimum and Maximum
 */
public class Task2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int min = (num1 < num2) ? num1 : num2;
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
