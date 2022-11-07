package com.company.javaFundamentals.lesson8_1009.arrays.Homework;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Calculate factorial of given number n = ");
        Scanner scanner = new Scanner(System.in);
        int valueOfGivenNumber = scanner.nextInt();

        int count = 1;

        for (int i = 1; i <= valueOfGivenNumber; i++) {
            count = count * i;
        }
        System.out.println("Output = " + count);
        return;
    }
}

