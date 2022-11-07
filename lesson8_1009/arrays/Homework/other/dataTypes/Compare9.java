package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.dataTypes;

import java.util.Scanner;

public class Compare9 {

    public static void main(String[] args) {

        printComparisson(9,10);

        System.out.println("Enter 2 numbers to compare");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber==secondNumber){
            System.out.println("Numbers are equal: "+ firstNumber+"="+secondNumber);
        }else if (firstNumber!=secondNumber && firstNumber<secondNumber){
            System.out.println("Numbers are different: "+firstNumber+"<"+secondNumber);
        }else
            System.out.println("Numbers different:, "+firstNumber+">"+secondNumber);
    }
    private static void  printComparisson( int numberOne, int numberTwo){
        if (numberOne ==numberTwo){
            System.out.println("******");
            System.out.printf("%d == %d", numberOne, numberTwo);
        } else {
                     System.out.printf("%d != %d", numberOne, numberTwo);
            System.out.println("*****");

        }
    }
}
