package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.dataTypes;

import java.util.Scanner;

public class Rectangle7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 5.5;
        double height = 8.5;


        System.out.println("width = " + width);
        System.out.println("height = " + height);
        System.out.println("Perimeter= " + String.format("%.2f", 2 * (width + height)) + '\t' + "Area= "
                + String.format("%.2f", (width * height)));
    }
}
