package org.example.homework3;

/**
 * Program to Calculate Integer Part and Remainder after Division
 */
public class Task4 {
    public static void main(String[] args) {
        int dividend = 25;
        int divisor = 7;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Integer part of division: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
