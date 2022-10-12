package com.company.javaFundamentals.lesson2_0918;

public class DataTypesMain {

    public static void main(String[] args) {

        //primitivus kintamieji
        byte noOfDoors = 4;
        short power = 100;
        int year = 1999;

        //objektas, String tipas reiskia eilute arba simboliu rinkini
        String color = "Red";
        String make = "AUDI";

        //simbolis tarp viengubu kabuciu
        char transmission = 'A';

        double engineCapacity = 2.5;

        boolean isDamaged = false;
        boolean hasTechnicalInspection = true;

        System.out.println("-----------------------------------------");
        System.out.println("make:              " + make);
        System.out.println("no of door:        " + noOfDoors + ",");
        System.out.println("power:             " + power + "kW,");
        System.out.println("production year:   " + year + ",");
        System.out.println("color:             " + color);
        System.out.println("transmission type: " + transmission);
        System.out.println("engine capacity:   " + engineCapacity + "L");
        System.out.println("damaged:           " + isDamaged);
        System.out.println("Valid inspection   " + hasTechnicalInspection);
        System.out.println("-----------------------------------------");

    }
}

//        byte	1 byte	        Stores whole numbers from -128 to 127
//        short	2 bytes	        Stores whole numbers from -32,768 to 32,767
//        int	4 bytes	        Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	8 bytes	        Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

//        float	4 bytes	        Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean	1 bit	    Stores true or false values
//        char	2 bytes	        Stores a single character/letter or ASCII values