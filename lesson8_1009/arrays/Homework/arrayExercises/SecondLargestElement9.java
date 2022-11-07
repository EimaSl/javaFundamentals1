package com.company.javaFundamentals.lesson8_1009.arrays.Homework.arrayExercises;

import java.util.Arrays;

public class SecondLargestElement9 {
    public static void main(String[] args) {

        int[] myArray = {1, 7, 3, 10, 9};
        System.out.println("Given Array: " + Arrays.toString(myArray));

        Arrays.sort(myArray);
        System.out.println("Second largest number: " + myArray[(myArray.length - 1)]);
    }
}
