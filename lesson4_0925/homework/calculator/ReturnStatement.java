package com.company.javaFundamentals.lesson4_0925.homework.calculator;

import java.util.Arrays;

public class ReturnStatement {
    public static void main(String[] args) {

        //strings
        String shouting = caps("testing to caps");
        System.out.println(shouting);
        System.out.println();

        //array
        int[] awesomeArray = gimmeArrayFromInts(1,2,3);
        System.out.println("array=" + Arrays.toString(awesomeArray));
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);
        System.out.println();

        //add
        printMessage();
        add(5, 6);
        System.out.println(addR(5,6));

    }

    public static void printMessage() {
        System.out.println("This is our first method");
    }

    public static void add(int a, int b) {
        System.out.println("a+b=" + a + b);
    }

    public static int addR(int a, int b) {
        int c = a + b;
        System.out.print("a+b=");
        return c;
    }

    public static  String caps(String s){
        return s.toUpperCase();
    }

    public static int[] gimmeArrayFromInts(int a, int b, int c){
        int[] array = new int[3];
        array[0]=a;
        array[1]=b;
        array[2]=c;
     return array;
    }


}
