package com.company.javaFundamentals.lesson8_1009.arrays.Homework.arrayExercises;

public class Duplicate {
    public static void main(String[] args) {

        int myNumbers[] = {1, 7, 3, 7, 10, 1, 9};

        for (int i = 0; i < myNumbers.length ; i++) {
            for (int j = i+1; j < myNumbers.length; j++) {
                if (myNumbers[i] == myNumbers[j] && i != j) {
                    System.out.print(myNumbers[j]+" ");
                }
            }
        }
    }
}
