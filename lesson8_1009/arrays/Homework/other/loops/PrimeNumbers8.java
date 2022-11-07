package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.loops;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers8 {
    public static void main(String[] args) {

        System.out.println("Enter how many Prime numbers to show");
        Scanner scanner = new Scanner(System.in);
        int numbersToShow = scanner.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();

        int count = 0;
        System.out.print("Prime numbers are:");

        for (int numberToCheck = 2; numberToCheck <= 100; numberToCheck++) {
            boolean isPrime = true;

            for (int j = 2; j <= numberToCheck / 2; j++) {
                if (numberToCheck % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(numberToCheck);
            }
        }
        for (int i = 0; i < numbersToShow; i++) {
            System.out.print(primeNumbers.get(i) + " ");
        }
    }
}

