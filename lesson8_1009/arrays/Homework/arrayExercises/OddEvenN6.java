package com.company.javaFundamentals.lesson8_1009.arrays.Homework.arrayExercises;

import java.util.Arrays;

public class OddEvenN6 {
    public static void main(String[] args) {

        int[] myNumbers = {1, 7, 3, 10, 9};
        int numberOfOdd=0;
        int numberOfEven = 0;

        System.out.println("Array is : " + Arrays.toString(myNumbers));
        for (int i = 0; i < myNumbers.length; i++) {
            if (myNumbers[i] % 2 != 0)
                numberOfOdd++;
            else {
               numberOfEven++;
            }
        }
        System.out.println("numberOfEven = "+ numberOfEven+"; numberOfOdd = "+numberOfOdd);
    }
}