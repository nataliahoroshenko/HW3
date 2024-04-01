package org.example.homework4;

/**
 * Leap Year Checker
 */

public class Task1 {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " is a leap year: " + isLeap);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
