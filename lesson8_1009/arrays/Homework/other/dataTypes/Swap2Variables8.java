package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.dataTypes;

public class Swap2Variables8 {
    public static void main(String[] args) {
        int a = 13;
        int b = 5;

        int laikinas = a;
        a = b;
        b = laikinas;

        System.out.println("a=13 b=5 swap => " + "a=" + a + ", b=" + b);
    }
}
