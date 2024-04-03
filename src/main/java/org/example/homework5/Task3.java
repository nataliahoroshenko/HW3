package org.example.homework5;

import java.util.Random;

/**
 * Number Generator
 */
public class Task3 {
    public static void main(String[] args) {
        // Array to track occurrences of each number
        int[] occurrences = new int[101];

        int sum = 0;
        int count = 0;

        Random random = new Random();

        while (true) {
            int randomNumber = random.nextInt(100) + 1;

            System.out.println("Generated number: " + randomNumber);

            sum += randomNumber;
            count++;

            if (occurrences[randomNumber] == 1) {
                break;
            }

            occurrences[randomNumber]++;

        }

        System.out.println("Total sum of generated numbers: " + sum);
        System.out.println("Total amount of numbers generated: " + count);
    }
}
