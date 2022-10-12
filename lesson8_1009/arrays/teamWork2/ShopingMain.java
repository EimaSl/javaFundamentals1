package com.company.javaFundamentals.lesson8_1009.arrays.teamWork2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ShopingMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ShopingCartService shopingCartService = new ShopingCartService();

        shopingCartService.welcomeToShop();
        System.out.print("How many products we need to buy?  ");
        int noOfProduct = scanner.nextInt();

        Product[] productCart = new Product[noOfProduct];

        int productNo = 0;
        while (productNo < noOfProduct) {

            System.out.print("Product name:                      ");
            String productName = scanner.next();
            System.out.print("Product price:                     ");
            double productPrice = scanner.nextDouble();
            System.out.print("Product quantity:                  ");
            int productQuantity = scanner.nextInt();

            productCart[productNo++] = new Product(productName, productPrice, productQuantity);
            System.out.println();

        }
        shopingCartService.productCartPrint(productCart);
    }
}
