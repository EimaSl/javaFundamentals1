package com.company.javaFundamentals.lesson7_1008.recap.basic_arrays;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {

//        int houseNumber = 17;
        int[] houseNumbers = {17, 18, 5, 2, 20}; //sukurs 5 skaiciu masyva.Masyvo dydis bus 5
        //bet koks masyvas yra Objektas

        //Masyvo // array spausdinimas
        System.out.println("Masyvo elementai: " + Arrays.toString(houseNumbers));

        int[] friendAges = new int[5]; // kadangi masyvas objektas naudoju new ir nurodau dydi
        System.out.println("Masyvo draugu amziai: "  + Arrays.toString(friendAges));

        friendAges[0] = 99; // masyvo vietoje 0 priskeriu reiksme 99
        System.out.println("Masyvo draugu amziai: "  + Arrays.toString(friendAges));

        friendAges[3] = 13; // masyvo vietoje priepaskutinis priskeriu reiksme 13
        System.out.println("Masyvo draugu amziai: "  + Arrays.toString(friendAges));

        Bike[] garazas = new Bike[3];
        System.out.println("Garaze yra sie motociklai: " + Arrays.toString(garazas));
        Bike kawasaki = new Bike ("Kawasaki") ;
        garazas[2] = kawasaki;
        System.out.println(Arrays.toString(garazas));


    }

    public static void sendNeighbourhoodNumbers(int[] houseNumbers){

    }

}
