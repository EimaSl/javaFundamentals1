package com.company.javaFundamentals.lesson8_1009.arrays.Homework.arrayExercises;

import java.util.Arrays;

public class PairsOfArray10 {

    public static void main(String[] args) {

        int myNumbers[] = {1, 2, 7, 3, 10, 2, 9};
        System.out.println("Specified Array is: "+Arrays.toString(myNumbers));

        System.out.print("Pairs when sum equal 4, are: ");
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = i + 1; j < myNumbers.length; j++) {
                if (myNumbers[i] + myNumbers[j]==4) {
                    System.out.print(myNumbers[i]+"-"+myNumbers[j]+" ");
                }
            }
        }
    }
}