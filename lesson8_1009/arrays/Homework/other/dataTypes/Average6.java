package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.dataTypes;

import java.util.Scanner;

public class Average6 {
    public static void main(String[] args) {

        System.out.println("Enter three Numbers to calculate average");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        System.out.println((firstNumber + secondNumber + thirdNumber) / 3);
    }
}
