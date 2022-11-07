package com.company.javaFundamentals.lesson8_1009.arrays.Homework;

import java.util.Scanner;

public class PowerNumbers5 {

    private static final int UPPER_MARGIN = 10000;

    public static void main(String[] args) {

        System.out.println("Enter number, to check power numbers till 100");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int powerNumbers = 1;

        while (powerNumbers <= UPPER_MARGIN) {
            powerNumbers = powerNumbers * number;
            if (powerNumbers <= UPPER_MARGIN) {
                System.out.print(powerNumbers + " ");
            }
        }
    }
}
