package org.example.homework5;
/**
 * Even Digits Sum
 */
public class Task1 {
    public static void main(String[] args) {
        int number = 123456789;
        System.out.println("Number: " + number + "\nEven digits sum: " + getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int evenSum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number /= 10;
        }

        return evenSum;
    }
}
