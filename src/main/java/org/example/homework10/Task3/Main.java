package org.example.homework10.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sentence = "This is a test sentence for splitting";
        splitAndPrint(sentence);
    }

    public static void splitAndPrint(String sentence) {
        String[] words = sentence.split(" ");

        Arrays.stream(words).forEach(word -> System.out.println(word));
    }
}
