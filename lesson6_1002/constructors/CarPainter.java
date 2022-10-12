package com.company.javaFundamentals.lesson6_1002.constructors;

import java.util.Scanner;

public class CarPainter {

    public String painterCompany;
    public Scanner scanner = new Scanner(System.in);

    public void paintCar(Car car, String newColor){
        System.out.println("Dazome masina " + car.brand);
        car.color = newColor;
        System.out.println("Auto repainted to color = " + car.color);
    }

    public void paintCarUsingScanner(Car car){
        System.out.print("What color you want to repaint car?");
        String customerWantedColor = scanner.next();
        car.color = customerWantedColor;
        System.out.println("Dazome masina " + car.brand);
        System.out.println("Auto repainted to color = " + car.color);
    }
}
