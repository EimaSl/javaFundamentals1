package com.company.javaFundamentals.lesson2_0918;

public class TeamWork1 {

    public static void main(String[] args) {

        byte numberOfFloors = 3;
        short numberOfFlats = 20;
        int idNumberRegistry = 76_598_321;
        long coordinates = 936352727363252636L;
        String address = "Dausu 25 street";
        boolean hasFireplace = true;
        char energyClass = 'A';
        double price = 500_000.0;
        float prosperityArea = 20.3f;

        System.out.println("*********************************************************************************");
        System.out.println("* ON SALE                                                                        ");
        System.out.println("* Address details: " + address);
        System.out.println("* The house has number of floors: " + numberOfFloors + ", number of flats: " + numberOfFlats
                + ". \n* You can check us on location: " + coordinates + ",\n* has excellent energy class = "
                + energyClass + ", house area is " + prosperityArea + ".");
        System.out.println("* Special advantages: nice fireplace - " + hasFireplace);
        System.out.println("* This month cost is just: " + price);
        System.out.println("* House details: Number of registry: " + idNumberRegistry);
        System.out.println("********************************************************************************");

    }
}
