package com.company.javaFundamentals.lesson7_1008.recap.basic_arrays.TeamWorkParking;

import java.util.Arrays;
import java.util.Scanner;

public class ParkingasMain {

    public static void main(String[] args) {

        Car[] parking = new Car[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite brand and registration number");
        Car audi4 = new Car();

        String brand4 = scanner.next();
        String regNumber4 = scanner.next();

        audi4.brand = brand4;
        audi4.regNumber = regNumber4;


        Car audi1 = new Car("Audi", "PVC123");
        Car audi2 = new Car("Audi", "DGH456");
        Car audi3 = new Car("Audi", "TRP789");

        parking[0] = audi2;
        parking[2] = audi1;
        parking[1] = audi3;
        parking[3] = audi4;

        System.out.println();
        System.out.println("Automobiliai parkinge: " + Arrays.toString(parking));
        System.out.println("Parkavimo vietu skaicius:" + parking.length);


    }

}
