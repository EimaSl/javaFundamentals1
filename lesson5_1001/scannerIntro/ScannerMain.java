package com.company.javaFundamentals.lesson5_1001.scannerIntro;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savo megstamiausia alaus brando pavadinima: ");
        String beerBrand = scanner.next();
        System.out.println("Best beer brand is : " + beerBrand.toUpperCase());

        System.out.print("Iveskite kiek buteliu siandie reikia: ");
        int bottlesQty = scanner.nextInt();
        System.out.println("Today we need next quantities : " + bottlesQty + " bottles.");

    }
}
