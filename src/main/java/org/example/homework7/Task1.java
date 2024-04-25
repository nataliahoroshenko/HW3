package org.example.homework7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the characters to remove (without spaces):");
        String charsToRemoveString = scanner.nextLine();
        char[] charsToRemove = charsToRemoveString.toCharArray();
        String result = removeCharacters(inputString, charsToRemove);
        System.out.println("The modified string is: " + result);
    }

    public static String removeCharacters(String input, char[] charsToRemove) {
        StringBuilder modifiedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!isCharToRemove(currentChar, charsToRemove)) {
                modifiedString.append(currentChar);
            }
        }
        return modifiedString.toString();
    }

    private static boolean isCharToRemove(char character, char[] charsToRemove) {
        for (char c : charsToRemove) {
            if (character == c) {
                return true;
            }
        }
        return false;
    }
}
