package com.company.javaFundamentals.lesson8_1009.arrays.Homework;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Java code conversion to lower case \"THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG\"");
        System.out.println("2. Java code reverse \"sailek odoK\"");
        System.out.println("3. Java code half of string of even length \"Kodo kelias\"");
        System.out.println("4. Java code concat 2 words \"Java\"+\"Fundamentals\", and remove first letter.");
        System.out.println("5. Java code print number of characters  \"This is Java\".");
        System.out.println("6. Java code compare lexicographically \"This is comparison\" & \"THIS is COMPARISON\"");
        System.out.println("7. Java code check if given strings \"Java exercises\" ends with \"ses\"");
        System.out.println("8. Java code count the letters, spaces, and numbers");
        System.out.println("NUMBERS");
        System.out.println("9. Divide two numbers and print reminder: 50/3= 16 reminder 2");
        System.out.println("10. Print result of given operations ...");
        System.out.println("11. Take three numbers as input to calculate average");
        System.out.println("ARRAYS");
        System.out.println("21. Java code count sum of Array {1,7,3,10,9}");
        System.out.println("22. Java code count average of Array {1,7,3,10,9}");
        System.out.println("23. Java code print oddNumbers of Array {1,7,3,10,9} + Min&Max");
        System.out.println("24. Java code count reverse of Array {1,7,3,10,9}");
        System.out.println("25. Java code count odd/even of Array {1,7,3,10,9}");

        System.out.println("...................................................................................");
        System.out.print("Please select 1-xx :     ");
        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                String primarySentence1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
                System.out.println(primarySentence1.toLowerCase(Locale.ROOT));
                break;
            case 2:
                String primarySentence2 = "sailek odoK";
                char convertToCharArray[] = primarySentence2.toCharArray();
                String reverse = "";

                for (int i = convertToCharArray.length - 1; i >= 0; i--) {
                    reverse += convertToCharArray[i];
                }
                System.out.println("Answer \"" + primarySentence2 + "\" reverse is: " + reverse.toUpperCase());
                break;
            case 3:
                String primarySentence3 = "Programmer";
                int length = primarySentence3.length() / 2;
                System.out.println(primarySentence3.substring(0, length));
                break;
            case 4:
                String primaryWord1 = "Java";
                String primaryWord2 = "Fundamentals";
                System.out.println(primaryWord1.substring(1).concat(primaryWord2.substring(1)));
                break;
            case 5:
                String primaryWord5 = "This is Java!";
                System.out.println("Number of charakters in: \"" + primaryWord5 + "\" is = " + primaryWord5.length());
                break;
            case 6:
                String primarySentence6a = "This is comparison";
                String primarySentence6b = "THIS is COMPARISON";
                int result = primarySentence6a.compareToIgnoreCase(primarySentence6b);

                if (result == 0) {
                    System.out.println("Those sentences are lexicographically equal");
                } else {
                    System.out.println("Those sentences are lexicographically not equal");
                }
                break;
            case 7:
                String primarySentence7 = "Java exercises";
                String checkContentEnd = "ses";
                if (primarySentence7.endsWith(checkContentEnd)) {
                    System.out.println("Yes, Given string ends with with given characters");
                } else {
                    System.out.println("Nope");
                }
                break;
            case 8:
                String primarySentence8 = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
                char[] ch = primarySentence8.toCharArray();
                int letter = 0;
                int space = 0;
                int num = 0;
                int other = 0;

                for (int i = 0; i < primarySentence8.length(); i++) {
                    if (Character.isLetter(ch[i])) {
                        letter++;
                    } else if (Character.isDigit(ch[i])) {
                        num++;
                    } else if (Character.isWhitespace(ch[i])) {
                        space++;
                    } else {
                        other++;
                    }
                }
                System.out.println("Letters:" + letter + "/Numbers:" + num + "/Spaces:" + space + "/Other:" + other);
                break;
            case 9:
                int firstNo = 50;
                int secNo = 3;
                System.out.println("50/3=" + firstNo / secNo + " reminder " + firstNo % secNo);
                break;
            case 10:
                System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));
                System.out.println("(55 + 9) % 9 = " + ((55 + 9) % 9));
                System.out.println("20 + -3 * 5 / 8 = " + (20 + -3 * 5 / 8));
                System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));
                break;
            case 11:
                System.out.print("Enter first number: \t");
                int numbersForAverageCalc1 = scanner.nextInt();
                System.out.print("Enter second number:\t");
                int numbersForAverageCalc2 = scanner.nextInt();
                System.out.print("Enter third number: \t");
                int numbersForAverageCalc3 = scanner.nextInt();
                System.out.println("\t\t\tAverage = " + (numbersForAverageCalc1
                        + numbersForAverageCalc2 + numbersForAverageCalc3) / 3);
            case 21:
                int[] myNumbers = {1, 7, 3, 10, 9};
                int sum = 0;

                for (int i = 0; i < myNumbers.length; i++) {
                    sum += myNumbers[i];
                }
                System.out.println("Sum of Array {1,7,3,10,9} = " + sum);
                break;
            case 22:
                int[] myNumbers2 = {1, 7, 3, 10, 9};
                int average = 0;

                for (int i = 0; i < myNumbers2.length; i++) {
                    average += myNumbers2[i];
                }
                System.out.println("Average of Array {1,7,3,10,9} = " + average / myNumbers2.length);
                break;
            case 23:
                int[] myNumbers3 = {1, 7, 3, 10, 9};

                System.out.print("Odd numbers of Array = ");
                int min = myNumbers3[0];
                int max = 0;
                for (int i = 0; i < myNumbers3.length; i++) {

                    if (myNumbers3[i] % 2 != 0) {
                        System.out.print(myNumbers3[i] + ", ");
                    }
                    if (myNumbers3[i] > max) {
                        max = myNumbers3[i];
                    }
                    if (myNumbers3[i] < min) {
                        min = myNumbers3[i];
                    }

                }
                System.out.println("\nMin= " + min + ", Max= " + max);
                break;
            case 24:
                int[] myNumbers4 = {1, 7, 3, 10, 9};
                int a = 0;
                for (int i = (myNumbers4.length - 1); i >= 0; i--) {
                    System.out.print(myNumbers4[i] + " ");
                }
                break;
            case 25:
                int[] myNumbers5 = {1, 7, 3, 10, 9};
                int even = 0;
                int odd = 0;
                for (int i = 0; i < myNumbers5.length; i++) {
                    if (myNumbers5[i] % 2 == 0) {
                        even ++;
                    } else {
                        odd++;
                    }
                }
                System.out.println("Odd = " + odd + ", Even =" +even);


        }


    }

}

