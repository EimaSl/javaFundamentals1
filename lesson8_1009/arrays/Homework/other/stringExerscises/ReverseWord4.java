package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.stringExerscises;
import java.util.Scanner;

public class ReverseWord4 {
    public static void main(String[] args) {

        System.out.println("Enter sentence you want to reverse");

        Scanner scanner = new Scanner(System.in);
        String SentenceToReverce = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(SentenceToReverce);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        System.out.print("Reverse: ");
        char[] reverse = SentenceToReverce.toCharArray();
        for (int i = reverse.length - 1; i >= 0; i--)
            System.out.print(reverse[i]);
    }
}
