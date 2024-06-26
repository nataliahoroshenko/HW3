package org.example.homework6;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculations = true;

        while (continueCalculations) {
            System.out.print("Enter a number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            System.out.print("Enter another number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please enter +, -, *, or /.");
                    continue;
            }

            System.out.println("Result: " + result);

            boolean validChoice = false;
            while (!validChoice) {
                System.out.print("Do you want to perform another calculation? (yes/no): ");
                String userChoice = scanner.next().toLowerCase();
                try {
                    if (userChoice.equals("yes")) {
                        validChoice = true;
                    } else if (userChoice.equals("no")) {
                        validChoice = true;
                        continueCalculations = false;
                    } else {
                        throw new IllegalArgumentException("Invalid choice. Please enter 'yes' or 'no'.");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("Exiting the calculator.");
        scanner.close();
    }
}
