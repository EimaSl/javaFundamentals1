package com.company.javaFundamentals.lesson5_1001.teamWork2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainTW2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Add product name: ");
        String productName = scanner.next();
        System.out.print("Add product quantity: ");
        int productQuantity = scanner.nextInt();
        System.out.print("Add product unit price: ");
        double unitPrice = scanner.nextDouble();

        Product product = new Product(productName, productQuantity, unitPrice);

        if (isInputValid(product)) {
            processProduct(product);
        } else {
            printErrorMessage();
        }
//        System.out.println(product);
    }

    private static void printErrorMessage() {
        System.out.println("Quantity or price is wrong number, should be > 0 and < 20");
    }

    private static void processProduct(Product product) {
        final DecimalFormat round = new DecimalFormat("0.00");
        TotalCalculationService totalCalculation = new TotalCalculationService();
        double totalPrice = totalCalculation.calculateTotal(product);

        invoiceSplit();
        System.out.println("\n        Printing details");
        System.out.println("Product type:            " + product.productName.toUpperCase()
                + "\nQuantity:                 " + product.productQuantity
                + "\nTotal price for purchase: " + round.format(totalPrice) + " Euro (15% VAT included).");
        System.out.println();
        invoiceSplit();
    }

    private static void invoiceSplit() {
        System.out.println("------------------------------------------------------------");
    }

    private static boolean isInputValid(Product product) {
        return product.productQuantity >= 0 && product.unitPrice >= 0 && product.unitPrice < 20;
    }
}