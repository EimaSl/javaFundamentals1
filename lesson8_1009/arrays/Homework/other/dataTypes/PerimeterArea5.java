package com.company.javaFundamentals.lesson8_1009.arrays.Homework.other.dataTypes;

public class PerimeterArea5 {

    public static final double RADIUS = 7.5;

    public static void main(String[] args) {

        double squareOfCircle = getSquareOfCircle();
        double perimeterOfCircle = getPerimeterOfCircle();

        System.out.println("Square =" + squareOfCircle + " ; Perimeter =" + perimeterOfCircle);

    }

    private static double getPerimeterOfCircle() {
        return 2 * Math.PI * RADIUS;
    }

    private static double getSquareOfCircle() {
        return Math.PI * Math.pow(RADIUS, 2);
    }
}
