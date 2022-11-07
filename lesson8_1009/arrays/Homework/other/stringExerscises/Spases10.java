package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.stringExerscises;

public class Spases10 {
    public static void main(String[] args) {

        String string = "Aa kiu, i swd skieo 2387. GH kiu: siep?? 25.33";

        String number = "0123456789";
        String alphabet = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";

        int lettersCount = 0;
        int numberCount = 0;
        int spacesCount = 0;
        int other = 0;

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                if (string.charAt(i) == number.charAt(j)) {
                    numberCount++;
                }
            }
            for (int j = 0; j < alphabet.length(); j++) {
                if (string.charAt(i) == alphabet.charAt(j)) {
                    lettersCount++;
                }
            }

            if (string.charAt(i) == ' ') {
                spacesCount++;
            }
            other = (string.length() - (lettersCount + numberCount + spacesCount));
        }
        System.out.println("Our string: " + string);
        System.out.println("String symbol count: " + lettersCount + "-letters," + numberCount + "-numbers,"
                + spacesCount + "-spaces," + other + "-other.");
    }
}
