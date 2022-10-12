package com.company.javaFundamentals.lesson8_1009.arrays.teamWork2;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShopingCartService {

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date currentDate = new Date();
    final DecimalFormat round = new DecimalFormat("0.00");

    public double getCartTotal(Product[] products) {
        double cartTotal = 0;

        for (Product product : products) {
            cartTotal += product.price * product.quantity * 1.21;
        }
        return cartTotal;
    }


    public void productCartPrint(Product[] products) {
        System.out.println("*************************************");
        System.out.println("\t Receipt ");
        System.out.println("\t\t NAME \t QUANTITY \t PRICE ");
        System.out.println("\t\t -----\t----------\t-------");
        for (Product product : products) {
            System.out.println("\t\t " + product.name.toUpperCase()
                    + "\t\t " + product.quantity + "\t\t " + round.format(product.quantity * product.price));


        }
        System.out.println("\n\t\tTotal price with 21%:\t\t" + round.format(getCartTotal(products)) + " \u20ac");
        System.out.println("\t\tTotal price without VAT:\t" + round.format(getCartTotal(products) / 1.21) + " \u20ac");
        System.out.println("\t\t" + dateFormat.format(currentDate));
        System.out.println("************************************");
    }

    public void welcomeToShop() {
        System.out.println("***************************************");
        System.out.println("*********WELCOME TO TSD SHOP***********");
        System.out.println("***************************************");
    }
}

