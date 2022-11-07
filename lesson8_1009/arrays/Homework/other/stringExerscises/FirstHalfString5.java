package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.stringExerscises;

import java.util.Scanner;

public class FirstHalfString5 {
    public static void main(String[] args) {
        System.out.println("Enter sentence to split by half");
        Scanner scanner= new Scanner(System.in);
        String Sentense=scanner.nextLine();

        System.out.println("SentenseSplitedEvenLength: ");
        char [] SentenseSplitedEvenLength= Sentense.toCharArray();
        for (int i = 0; i < ((Sentense.length())/2); i++) {
            System.out.print(SentenseSplitedEvenLength[i]);
        }
    }
}
