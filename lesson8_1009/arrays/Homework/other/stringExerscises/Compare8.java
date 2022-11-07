package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.stringExerscises;

public class Compare8 {

    public static void main(String[] args) {

        String string1 = "This is a comparisson";
        String string2 = "THIS is A Comparisson";

        if (string1.compareToIgnoreCase(string2) == 0) {
            System.out.println("Lygus");
        } else {
            System.out.println("Simboliu skirtumas =" + string1.compareToIgnoreCase(string2));
        }
    }
}