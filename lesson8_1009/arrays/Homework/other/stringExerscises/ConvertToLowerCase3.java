package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.stringExerscises;

import java.util.Scanner;

public class ConvertToLowerCase3 {
    public static void main(String[] args) {
        System.out.println("Enter sentence with Capital letters");
        Scanner scanner = new Scanner(System.in);
        String SentenceInCapital = scanner.nextLine();

        System.out.println("SentenceToLowerCase: " + SentenceInCapital.toLowerCase());
    }
}
