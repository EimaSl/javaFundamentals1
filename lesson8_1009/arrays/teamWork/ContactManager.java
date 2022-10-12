package com.company.javaFundamentals.lesson8_1009.arrays.teamWork;

import java.util.Scanner;

public class ContactManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Address book");
        System.out.println("How many contacts we'll have in the book?");

        int noOfContactsInBook = scanner.nextInt();
        Contact[] contactBook = new Contact[noOfContactsInBook];

        int placeInContactBook = 0;

        while (placeInContactBook < noOfContactsInBook) {
            System.out.println(" Please enter contact name");
            Contact contact = new Contact();
            contact.name = scanner.next();
            System.out.println("Please enter phone number");
            contact.phoneNumber = scanner.next();

            contactBook[placeInContactBook] = contact;
            placeInContactBook++;

            System.out.println("!INFO!" + placeInContactBook + " - contact/s created successfully!");
        }
        System.out.print("Contacts are: ");
        ArrayPrinter.printArray(contactBook);
    }
}

//prideti kontakta
//prideti keleta kontaktu
//istrinti kontaktus
//redaguoti