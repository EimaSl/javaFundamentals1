package com.company.javaFundamentals.lesson8_1009.arrays.example2;

import com.company.javaFundamentals.lesson8_1009.arrays.example1.ArrayPrinter;

import java.util.Scanner;

public class ArrayMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printText();

        int noOfParticipants = scanner.nextInt();
        String[] participants = new String[noOfParticipants];

        int noOfSeats = 0;

        while (noOfSeats < noOfParticipants) {
            System.out.print("      Enter person name: ");
            participants[noOfSeats++] = scanner.next();
        }
        finalPrintText(participants);
    }

    private static void finalPrintText(String[] participants) {
        System.out.print("\nRESERVATION ACCEPTED, participants are: ");
        ArrayPrinter.printArray(participants);
    }

    private static void printText() {
        System.out.println();
        System.out.println("Cafeteria table reservation");
        System.out.print("Reservation for number of people: ");
    }
}
