package org.example.homework3;

/**
 * Program to Convert Celsius to Fahrenheit and Kelvin
 */
public class Task5 {
    public static void main(String[] args) {
        double celsius = 25.0; // Example Celsius temperature

        // Conversion formulas
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}
