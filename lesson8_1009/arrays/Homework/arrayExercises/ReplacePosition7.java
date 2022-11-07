package com.company.javaFundamentals.lesson8_1009.arrays.Homework.arrayExercises;
import java.util.Arrays;

public class ReplacePosition7 {
    public static void main(String[] args) {

        int[] myNumbers = {1, 7, 3, 10, 9};
        System.out.println("Array before change : " + Arrays.toString(myNumbers));

        myNumbers[2] = 4;

        System.out.println("Array after change : " + Arrays.toString(myNumbers));
    }
}
