package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.dataTypes;

import java.util.Scanner;

public class SumInteger10 {
    public static void main(String[] args) {

        System.out.println("Enter digits to compute");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        int s = 0;

        for (int i = 0; i < string.length(); i++) {
            char x = string.charAt(i);
            s = s + Character.getNumericValue(x);
        }
        System.out.println("Sum of digits = " + s);
    }
}
