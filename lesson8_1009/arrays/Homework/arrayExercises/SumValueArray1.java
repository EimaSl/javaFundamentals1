package com.company.javaFundamentals.lesson8_1009.arrays.Homework.arrayExercises;

import java.util.Arrays;

public class SumValueArray1 {
    public static void main(String[] args) {

        int[] myNumbers = new int[]{1,7,3,10,9};

        int sum =0;
        for (int i = 0; i < myNumbers.length; i++) {
            sum += myNumbers[i];

        }
        System.out.println("Array values="+Arrays.toString(myNumbers)+", Sum of values are: "+sum);
    }
}
