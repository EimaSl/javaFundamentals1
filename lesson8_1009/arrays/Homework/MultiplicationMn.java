package com.company.javaFundamentals.lesson8_1009.arrays.Homework;

import java.util.Scanner;

public class MultiplicationMn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myNumber = 8;

        //1
        System.out.print("Multiplication table up to 10: 8 => Output ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * myNumber + " ");
        }
        //2
        System.out.print("\n\nAll even numbers from 0 - 100 => Output ");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        //3
//
        System.out.print("\n\nAccepts integer (n) and displays n,nn,nnn,nnnn,nnnnn");
//        System.out.print("\nInput number: ");
//        String inputNumber = scanner.nextLine();
//        System.out.println("Output : " + inputNumber + " + " + inputNumber + inputNumber + " + " + inputNumber
//                + inputNumber + inputNumber + " + " + inputNumber + inputNumber + inputNumber + inputNumber + " + " +
//                 inputNumber + inputNumber + inputNumber +inputNumber+inputNumber);

        //4
        System.out.println("\n\nNumbers 1-100 divisible by 3 and 5 ");

        System.out.print("Divisible by 5: \t ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n\nDivisible by 3: \t ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n\nDivisible by 5 & 10: \t");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        //5
        System.out.println("\n\nPrinting powers of number till 100");
        int myNumber1 = 3;
        System.out.print("Output: \t\t\t");
        for (int i = 1; i <= 100; i++) {
            int result = (int) Math.pow(myNumber1, i);
            if (result < 100) {
                System.out.print(result + " ");
            }

        }
    }
}
