package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.loops;

import java.util.Scanner;

public class Fibonacci6 {
    public static void main(String[] args) {

        System.out.println("Enter serios of Fibonaci");
        Scanner scanner = new Scanner(System.in);
        int series = scanner.nextInt();

        int firstNumber=0;
        int secondNumber=1;
        int nextNumber;
        System.out.print(firstNumber+" "+secondNumber);

        for (int i = 2; i < series; i++) {
            nextNumber=firstNumber+secondNumber;
            System.out.print(" "+nextNumber);
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
    }
}
