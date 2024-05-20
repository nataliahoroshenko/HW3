package org.example.homework11;

import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
    public static void main(String[] args) {
        String inputString = "Homework 11 LetterCounter task";

        countLetterOccurrences(inputString);
    }

    public static void countLetterOccurrences(String inputString) {
        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (char c : inputString.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                letterCountMap.put(c, letterCountMap.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}