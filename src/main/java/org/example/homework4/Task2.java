package org.example.homework4;

/**
 * Minutes to Years and Days Calculator
 */
public class Task2 {
    public static void main(String[] args) {
        long minutes = 1535625;
        printYearsAndDays(minutes);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long days = minutes / (60 * 24);
        long years = days / 365;
        long remainingDays = days % 365;
        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
}
