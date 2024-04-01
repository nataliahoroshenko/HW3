package org.example.homework4;

/**
 * Product Cost Calculator
 */
public class Task3 {
    public static void main(String[] args) {
        double unitPrice = 10.0;
        int quantity = 25;
        double totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);
    }

    public static double calculateTotalCost(double unitPrice, int quantity) {
        double discount = 0.0;
        if (quantity > 10 && quantity <= 20) {
            discount = 0.05;
        } else if (quantity > 20 && quantity <= 30) {
            discount = 0.10;
        } else if (quantity > 30 && quantity <= 80) {
            int additionalUnits = quantity - 30;
            discount = 0.12 + (additionalUnits / 10) * 0.004;
        } else if (quantity > 80) {
            discount = 0.13;
        }
        return unitPrice * quantity * (1 - discount);
    }
}
