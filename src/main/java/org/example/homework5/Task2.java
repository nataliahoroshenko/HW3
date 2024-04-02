package org.example.homework5;

import java.util.Random;
/**
 * Generate Sort and Print Array
 */

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        System.out.println("Original array:");
        printArray(numbers);

        int[] sortedNumbers = sortIntegers(numbers);
        System.out.println("\nSorted array (descending order):");
        printArray(sortedNumbers);
    }
    public static int[] getIntegers(int size) {
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = unsortedArray.clone(); // Create a copy to avoid modifying the original array

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    // Swap elements
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        return sortedArray;
    }
}
