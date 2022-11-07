package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.loops;

import java.util.Scanner;

public class PowerNumbers5 {
    public static void main(String[] args) {

        System.out.println("Enter number, to check power numbers till 100");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int powerNumbers = 1;

        while (powerNumbers <= 100) {
            powerNumbers = powerNumbers * number;
            if (powerNumbers <= 100) {
                System.out.print(powerNumbers + " ");
            }
        }
    }
}
