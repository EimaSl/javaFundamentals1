package com.company.javaFundamentals.lesson8_1009.arrays.Homework.arrayExercises;

import java.util.Arrays;

public class ReverseValue5 {

    public static void main(String[] args) {

        int[] myNumbers = {1, 7, 3, 10, 9};

        System.out.println("Array is : " + Arrays.toString(myNumbers));

        System.out.print("Reverse: ");
        for (int i = myNumbers.length - 1; i >= 0; i--) {
            System.out.print(myNumbers[i] + " ");
        }
    }
}
