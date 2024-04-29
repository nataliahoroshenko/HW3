package org.example.homework8.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, true);
        Printer printer2 = new Printer(80, false);

        int addedToner1 = printer1.addToner(30);
        System.out.println("Toner level in printer1 after adding: " + addedToner1);

        int pagesPrinted1 = printer1.printPages(10);
        System.out.println("Pages printed by printer1: " + pagesPrinted1);

        int addedToner2 = printer2.addToner(20);
        System.out.println("Toner level in printer2 after adding: " + addedToner2);

        int pagesPrinted2 = printer2.printPages(15);
        System.out.println("Pages printed by printer2: " + pagesPrinted2);

        System.out.println("Total pages printed by printer1: " + printer1.getPagesPrinted());
        System.out.println("Total pages printed by printer2: " + printer2.getPagesPrinted());
    }
}
