package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.loops;

import java.util.Scanner;

public class Multiplication1 {
    public static void main(String[] args) {

        System.out.println("Enter the number for multiplication");
        Scanner scanner = new Scanner(System.in);

        int multiplicationNumber = scanner.nextInt();
        int resultMultiplication = 0;

        for (int i = 0; i < 10; i++) {
            resultMultiplication = (resultMultiplication + multiplicationNumber);
            System.out.print(resultMultiplication + " ");
        }
    }
}
