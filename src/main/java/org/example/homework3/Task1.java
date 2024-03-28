package org.example.homework3;

/**
 * Program to Perform Basic Arithmetic Operations
 */
public class Task1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        int subtraction = num1 - num2;
        System.out.println("Subtraction: " + subtraction);

        int multiplication = num1 * num2;
        System.out.println("Multiplication: " + multiplication);

        double division = (double) num1 / num2;
        System.out.println("Division: " + division);
    }
}