package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.stringExerscises;

import java.util.Scanner;

public class Concat7 {

    public static void main(String[] args) {

        System.out.println("Enter 2 words to concat");
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();

        String finalWord;

        System.out.println("Concat+substring 1: = " + (firstWord.substring(1)).concat(secondWord));
        System.out.println("Length= " + (firstWord.substring(1)).concat(secondWord).length());




    }
}
